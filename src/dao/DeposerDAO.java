/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Deposer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kabor
 */
public class DeposerDAO extends DAO<Deposer>{
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    
    @Override
    public Deposer rechercher(int id) {
        Deposer deposer = new Deposer();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Deposer where id_depot = " + id);
            
            if (result.next()) {
                deposer.setId_depot(result.getInt("id_depot"));
                deposer.setDate_depot(result.getDate("Date_depot"));
                deposer.setQt_depot(result.getInt("Qt_depot"));
                deposer.setIDA(result.getInt("IDA"));
                deposer.setID_Client(result.getInt("ID_Client"));   
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(DeposerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return deposer;
    }

    @Override
    public void inserer(Deposer obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Deposer(Date_depot, Qt_depot, IDA, ID_Client) values (?,?,?,?)");
            prepare.setString(1, amj.format(obj.getDate_depot()));
           prepare.setInt(2, obj.getQt_depot());
           prepare.setInt(3, obj.getIDA());
           prepare.setInt(4, obj.getID_Client());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DeposerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void modifier(Deposer obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Deposer set Date_depot =?, Qt_depot =?, IDA =?, ID_Client =? where id_depot = " + id);
           prepare.setString(1, amj.format(obj.getDate_depot()));
           prepare.setInt(2, obj.getQt_depot());
           prepare.setInt(3, obj.getIDA());
           prepare.setInt(4, obj.getID_Client());
           prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DeposerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Deposer where id_depot = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DeposerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Deposer> liste() {
        Deposer deposer = new Deposer();
        List<Deposer> ldpt = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Deposer");
            
            while (result.next()) {
               deposer.setId_depot(result.getInt("id_depot"));
                deposer.setDate_depot(result.getDate("Date_depot"));
                deposer.setQt_depot(result.getInt("Qt_depot"));
                deposer.setIDA(result.getInt("IDA"));
                deposer.setID_Client(result.getInt("ID_Client"));
                
                ldpt.add(deposer);
                deposer = new Deposer(); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(DeposerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ldpt;
    }
    
}
