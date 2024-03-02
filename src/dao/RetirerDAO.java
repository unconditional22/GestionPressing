/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Retirer;
import java.text.SimpleDateFormat;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kabor
 */
public class RetirerDAO extends DAO<Retirer>{
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Retirer rechercher(int id) {
        Retirer retirer = new Retirer();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Retirer where id_retrait = " + id);
            
            if (result.next()) {
                retirer.setId_retrait(result.getInt("id_retrait"));
                retirer.setDate_retrait(result.getDate("Date_retrait"));
                retirer.setQt_retrait(result.getInt("Qt_retrait"));
                retirer.setIDA(result.getInt("IDA"));
                retirer.setID_Client(result.getInt("ID_Client"));   
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(RetirerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return retirer;
    }

    @Override
    public void inserer(Retirer obj) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Retirer(Date_retrait, Qt_retrait, IDA, ID_Client) values (?,?,?,?)");
            prepare.setString(1, amj.format(obj.getDate_retrait()));
            prepare.setInt(2, obj.getQt_retrait());
            prepare.setInt(3, obj.getIDA());
            prepare.setInt(4, obj.getID_Client());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RetirerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Retirer obj, int id) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Retirer set Date_retrait =?, Qt_retrait =?, IDA =?, ID_Client =? where id_retrait = " + id);
            prepare.setString(1, amj.format(obj.getDate_retrait()));
            prepare.setInt(2, obj.getQt_retrait());
            prepare.setInt(3, obj.getIDA());
            prepare.setInt(4, obj.getID_Client());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RetirerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Retirer where id_retrait = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RetirerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Retirer> liste() {
       Retirer retirer = new Retirer();
        List<Retirer> lret = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Retirer");
            
            while (result.next()) {
                retirer.setId_retrait(result.getInt("id_retrait"));
                retirer.setDate_retrait(result.getDate("Date_retrait"));
                retirer.setQt_retrait(result.getInt("Qt_retrait"));
                retirer.setIDA(result.getInt("IDA"));
                retirer.setID_Client(result.getInt("ID_Client"));   
                
                lret.add(retirer);
                retirer = new Retirer(); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(RetirerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lret;
    }
    
}
