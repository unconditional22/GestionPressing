/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Client;
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
public class ClientDAO extends DAO<Client>{
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Client rechercher(int id) {
        Client client = new Client();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Client where ID_Client = " + id);
            
            if (result.next()) {
                client.setID_Client(result.getInt("ID_Client"));
                client.setNom(result.getString("Nom"));
                client.setPrenom(result.getString("Prenom"));
                client.setEmail_client(result.getString("Email_client"));
                client.setTel_client(result.getString("Tel_client"));
                client.setVille_client(result.getString("Ville_client"));
                client.setRue_client(result.getString("Rue_client"));
                client.setDateNaiss_client(result.getDate("DateNaiss_client"));   
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return client;
    }
    
    public int getIdClient (String Prenom) {
        int ID_Client = 0;
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Client where Prenom= '"+Prenom+"'");
            if (result.next()) {
                ID_Client = result.getInt("ID_Client");
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ID_Client;
    }

    @Override
    public void inserer(Client obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Client(Nom, Prenom, Email_client, Tel_client, Ville_client, Rue_client, DateNaiss_client) values (?,?,?,?,?,?,?)");
            prepare.setString(1, obj.getNom());
            prepare.setString(2, obj.getPrenom());
            prepare.setString(3, obj.getEmail_client());
            prepare.setString(4, obj.getTel_client());
            prepare.setString(5, obj.getVille_client());
            prepare.setString(6, obj.getRue_client());
            prepare.setString(7, amj.format(obj.getDateNaiss_client()));
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Client obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Client set Nom =?, Prenom =?, Email_client =?, Tel_client =?, Ville_client =?, Rue_client =?, DateNaiss_client =? where ID_Client = " + id);
            prepare.setString(1, obj.getNom());
            prepare.setString(2, obj.getPrenom());
            prepare.setString(3, obj.getEmail_client());
            prepare.setString(4, obj.getTel_client());
            prepare.setString(5, obj.getVille_client());
            prepare.setString(6, obj.getRue_client());
            prepare.setString(7, amj.format(obj.getDateNaiss_client()));
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Client where ID_Client = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Client> liste() {
        
        Client client = new Client();
        List<Client> lclt = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Client");
            
            while (result.next()) {
                client.setID_Client(result.getInt("ID_Client"));
                client.setNom(result.getString("Nom"));
                client.setPrenom(result.getString("Prenom"));
                client.setEmail_client(result.getString("Email_client"));
                client.setTel_client(result.getString("Tel_client"));
                client.setVille_client(result.getString("Ville_client"));
                client.setRue_client(result.getString("Rue_client"));
                client.setDateNaiss_client(result.getDate("DateNaiss_client"));
                
                lclt.add(client);
                client = new Client(); // permet de passer au prochain client.
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lclt;
        
    }
    
}
