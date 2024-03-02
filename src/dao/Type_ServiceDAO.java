/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Type_Service;
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
public class Type_ServiceDAO extends DAO<Type_Service> {

    @Override
    public Type_Service rechercher(int id) {
        Type_Service tps = new Type_Service();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select Type_Service.*, LibelleS from Type_Service, Service where ID_tps = " + id);
            
            
            if (result.next()) {
                tps.setID_tps(result.getInt("ID_tps"));
                tps.setDesignation_tps(result.getString("Designation_tps"));
                tps.setIDS(result.getInt("IDS"));  
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(Type_ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return tps;
    }

    @Override
    public void inserer(Type_Service obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Type_Service(Designation_tps, IDS) values (?,?)");
            prepare.setString(1, obj.getDesignation_tps());
            prepare.setInt(2, obj.getIDS());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Type_ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Type_Service obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Type_Service set Designation_tps =?, IDS =? where ID_tps = " + id);
            prepare.setString(1, obj.getDesignation_tps());
            prepare.setInt(2, obj.getIDS());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Type_ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Type_Service where ID_tps = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Type_ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Type_Service> liste() {
        
        Type_Service tps = new Type_Service();
        List<Type_Service> ltps = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Type_Service");
            
            while (result.next()) {
                tps.setID_tps(result.getInt("ID_tps"));
                tps.setDesignation_tps(result.getString("Designation_tps"));
                tps.setIDS(result.getInt("IDS"));  
                
                ltps.add(tps);
                tps = new Type_Service(); // permet de passer au prochain type de service.
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(Type_ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ltps;
        
    }
    
}
