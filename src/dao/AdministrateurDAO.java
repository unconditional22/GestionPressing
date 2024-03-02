/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Administrateur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author kabor
 */
public class AdministrateurDAO extends DAO<Administrateur>{

    @Override
    public Administrateur rechercher(int id) {
        Administrateur admin = new Administrateur();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Administrateur where ID_Admin = " + id);
            
            if (result.next()) {
                admin.setID_Admin(result.getInt("ID_Admin"));
                admin.setNom(result.getString("Nom"));
                admin.setPrenom(result.getString("Prenom"));
                admin.setLogin_admin(result.getString("Login_admin"));
                admin.setPassword_admin(result.getString("Password_admin"));
                admin.setProfil_admin(result.getString("Profil_admin"));
                admin.setID_Caisse(result.getInt("ID_Caisse")); 
               
                
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return admin;
    }
    
    public int getIdAdministrateur (String Nom) {
        int ID_Admin = 0;
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Administrateur where Nom= '"+Nom+"'");
            
            if (result.next()) {
                ID_Admin = result.getInt("ID_Admin");
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ID_Admin;
    }

    @Override
    public void inserer(Administrateur obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Administrateur(Nom, Prenom, Login_admin, Password_admin, Profil_admin, ID_Caisse) values (?,?,?,?,?,?)");
            prepare.setString(1, obj.getNom());
            prepare.setString(2, obj.getPrenom());
            prepare.setString(3, obj.getLogin_admin());
            prepare.setString(4, obj.getPassword_admin());
            prepare.setString(5, obj.getProfil_admin());
            prepare.setInt(6, obj.getID_Caisse());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Administrateur obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Administrateur set Nom =?, Prenom =?, Login_admin =?, Password_admin =?, Profil_admin =?, ID_Caisse =? where ID_Admin = " + id);
            prepare.setString(1, obj.getNom());
            prepare.setString(2, obj.getPrenom());
            prepare.setString(3, obj.getLogin_admin());
            prepare.setString(4, obj.getPassword_admin());
            prepare.setString(5, obj.getProfil_admin());
            prepare.setInt(6, obj.getID_Caisse());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Administrateur where ID_Admin = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Administrateur> liste() {
        
        Administrateur admin = new Administrateur();
        List<Administrateur> lad = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Administrateur");
            
            while (result.next()) {
                admin.setID_Admin(result.getInt("ID_Admin"));
                admin.setNom(result.getString("Nom"));
                admin.setPrenom(result.getString("Prenom"));
                admin.setLogin_admin(result.getString("Login_admin"));
                admin.setPassword_admin(result.getString("Password_admin"));
                admin.setProfil_admin(result.getString("Profil_admin"));
                admin.setID_Caisse(result.getInt("ID_Caisse")); 
                
                lad.add(admin);
                admin = new Administrateur(); // permet de passer au prochain admin.
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lad;
        
    }
    
    
    public boolean connexion(String txt_login, String txt_password) {
        boolean v = false;
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Administrateur where Login_admin='" + txt_login + "' and Password_admin='" + txt_password +"'" );
            
            if (result.next()) {
                v = true;
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return v;
    }
    
     public List<String> getProfil(String txt_login, String txt_password) {
        List<String> v = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Administrateur where Login_admin='" + txt_login + "' and Password_admin='" + txt_password +"'" );
            
            if (result.next()) {
                v.add(result.getString("Profil_admin")); 
                v.add(result.getString("Prenom")); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return v;
    }

    public boolean connection(JTextField txt_login, JPasswordField txt_password) {
        boolean v = false;
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Administrateur where Login_admin = '" + txt_login + "' and Password_admin = '" + txt_password +"'" );
            
            if (result.next()) {
                v = true;
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return v;
    }

    
    
}
