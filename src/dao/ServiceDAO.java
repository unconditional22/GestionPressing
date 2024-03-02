/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kabor
 */
public class ServiceDAO extends DAO<Service> {

    @Override
    public Service rechercher(int id) {
        Service service = new Service();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from service where IDS = " + id);
            
            if (result.next()) {
                service.setIDS(result.getInt("IDS"));
                service.setLibelleS(result.getString("LibelleS"));
                service.setNumS(result.getInt("NumS")); 
                service.setPrixUS(result.getInt("PrixUS")); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return service;
    }
    
    
    public int getIdService (String LibelleS) {
        int IDS = 0;
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Service where LibelleS= '"+LibelleS+"'");
            if (result.next()) {
                IDS = result.getInt("IDS");
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return IDS;
    }
    

    @Override
    public void inserer(Service obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Service(LibelleS, PrixUS, NumS) values (?,?,?)");
            prepare.setString(1, obj.getLibelleS());
            prepare.setInt(2, obj.getPrixUS());
            prepare.setInt(3, obj.getNumS());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Service obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Service set LibelleS =?, PrixUS =?, NumS =? where IDS = " + id);
            prepare.setString(1, obj.getLibelleS());
            prepare.setInt(2, obj.getPrixUS());
            prepare.setInt(3, obj.getNumS());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Service where IDS = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Service> liste() {
        
       Service service = new Service();
        List<Service> lser = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Service");
            
            while (result.next()) {
                service.setIDS(result.getInt("IDS"));
                service.setLibelleS(result.getString("LibelleS"));
                service.setNumS(result.getInt("NumS")); 
                service.setPrixUS(result.getInt("PrixUS")); 
                
                lser.add(service);
                service = new Service(); // permet de passer au prochain Service.
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lser;
        
    }
    
}
