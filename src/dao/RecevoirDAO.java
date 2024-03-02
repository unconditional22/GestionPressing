/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Recevoir;
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
public class RecevoirDAO extends DAO<Recevoir>{

    @Override
    public Recevoir rechercher(int id) {
        Recevoir recevoir = new Recevoir();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select Recevoir.*, Nom from Recevoir, Administrateur where id_recevoir = " + id);
            //select Recevoir.*, Nom from Recevoir, administrateur
            //"select * from Recevoir where id_recevoir = " + id
            if (result.next()) {
                recevoir.setId_recevoir(result.getInt("id_recevoir"));
                recevoir.setID_Admin(result.getInt("ID_Admin"));
                recevoir.setID_Client(result.getInt("ID_Client")); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(RecevoirDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return recevoir;
    }

    @Override
    public void inserer(Recevoir obj) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Recevoir(ID_Admin, ID_Client) values (?,?)");
            prepare.setInt(1, obj.getID_Admin());
            prepare.setInt(2, obj.getID_Client());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RecevoirDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Recevoir obj, int id) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Recevoir set ID_Admin =?, ID_Client =? where id_recevoir = " + id);
            prepare.setInt(1, obj.getID_Admin());
            prepare.setInt(2, obj.getID_Client());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RecevoirDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Recevoir where id_recevoir = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RecevoirDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Recevoir> liste() {
        Recevoir recevoir = new Recevoir();
        List<Recevoir> lrecu = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Recevoir");
            
            while (result.next()) {
                recevoir.setId_recevoir(result.getInt("id_recevoir"));
                recevoir.setID_Admin(result.getInt("ID_Admin"));
                recevoir.setID_Client(result.getInt("ID_Client")); 
                
                lrecu.add(recevoir);
                recevoir = new Recevoir(); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(RecevoirDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lrecu;
    }
    
}
