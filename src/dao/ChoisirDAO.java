/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Choisir;
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
public class ChoisirDAO extends DAO<Choisir>{

    @Override
    public Choisir rechercher(int id) {
        Choisir choisir = new Choisir();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select Choisir.*, Prenom from Choisir, Client where id_choisir = " + id);
            // select Choisir.*, Nom from Choisir, Client
            //"select * from Choisir where id_choisir = " + id
            if (result.next()) {
                choisir.setId_choisir(result.getInt("id_choisir"));
                choisir.setIDS(result.getInt("IDS"));
                choisir.setID_Client(result.getInt("ID_Client")); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ChoisirDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return choisir;
    }

    @Override
    public void inserer(Choisir obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Choisir(IDS, ID_Client) values (?,?)");
            prepare.setInt(1, obj.getIDS());
            prepare.setInt(2, obj.getID_Client());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChoisirDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Choisir obj, int id) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Choisir set IDS =?, ID_Client =? where id_choisir = " + id);
            prepare.setInt(1, obj.getIDS());
            prepare.setInt(2, obj.getID_Client());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChoisirDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Choisir where id_choisir = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChoisirDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Choisir> liste() {
        Choisir choisir = new Choisir();
        List<Choisir> lchoix = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Choisir");
            
            while (result.next()) {
                choisir.setId_choisir(result.getInt("id_choisir"));
                choisir.setIDS(result.getInt("IDS"));
                choisir.setID_Client(result.getInt("ID_Client")); 
                
                lchoix.add(choisir);
                choisir = new Choisir(); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ChoisirDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lchoix;
    }
    
}
