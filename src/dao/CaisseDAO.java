/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Caisse;
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
public class CaisseDAO extends DAO<Caisse>{
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");

    
    @Override
    public Caisse rechercher(int id) {
        Caisse caisse = new Caisse();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Caisse where ID_Caisse = " + id);
            
            if (result.next()) {
                caisse.setID_Caisse(result.getInt("ID_Caisse"));
                caisse.setMt_actuel(result.getFloat("Mt_actuel"));
                caisse.setDate_encaissement(result.getDate("Date_encaissement"));
                caisse.setMt_total(result.getFloat("Mt_total"));     
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(CaisseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return caisse;
    }

    @Override
    public void inserer(Caisse obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Caisse(Mt_actuel, Date_encaissement, Mt_total) values (?,?,?)");
            prepare.setFloat(1, obj.getMt_actuel());
            prepare.setString(2, amj.format(obj.getDate_encaissement()));
            prepare.setFloat(3, obj.getMt_total());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CaisseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Caisse obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Caisse set Mt_actuel =?, Date_encaissement =?, Mt_total =? where ID_Caisse = " + id);
            prepare.setFloat(1, obj.getMt_actuel());
            prepare.setString(2, amj.format(obj.getDate_encaissement()));
            prepare.setFloat(3, obj.getMt_total());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CaisseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Caisse where ID_Caisse = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CaisseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Caisse> liste() {
        
        Caisse caisse = new Caisse();
        List<Caisse> lcss = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Caisse");
            
            while (result.next()) {
                caisse.setID_Caisse(result.getInt("ID_Caisse"));
                caisse.setMt_actuel(result.getFloat("Mt_actuel"));
                caisse.setDate_encaissement(result.getDate("Date_encaissement"));
                caisse.setMt_total(result.getFloat("Mt_total")); 
                
                lcss.add(caisse);
                caisse = new Caisse(); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(CaisseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lcss;
        
    }
    
}
