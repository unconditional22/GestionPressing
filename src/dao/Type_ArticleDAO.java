/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Type_Article;
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
public class Type_ArticleDAO extends DAO<Type_Article> {

    @Override
    public Type_Article rechercher(int id) {
        Type_Article tpa = new Type_Article();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select Type_Article.*, LibelleA from Type_Article, Article where ID_tpa = " + id);
            
            if (result.next()) {
                tpa.setID_tpa(result.getInt("ID_tpa"));
                tpa.setDesignation_tpa(result.getString("Designation_tpa"));
                tpa.setIDA(result.getInt("IDA"));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(Type_ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return tpa;
    }

    @Override
    public void inserer(Type_Article obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Type_Article(Designation_tpa, IDA) values (?,?)");
            prepare.setString(1, obj.getDesignation_tpa());
            prepare.setInt(2, obj.getIDA());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Type_ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Type_Article obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Type_Article set Designation_tpa =?, IDA =? where ID_tpa = " + id);
            prepare.setString(1, obj.getDesignation_tpa());
            prepare.setInt(2, obj.getIDA());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Type_ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Type_Article where ID_tpa = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Type_ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Type_Article> liste() {
        
        Type_Article tpa = new Type_Article();
        List<Type_Article> ltpa = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Type_Article");
            
            while (result.next()) {
                tpa.setID_tpa(result.getInt("ID_tpa"));
                tpa.setDesignation_tpa(result.getString("Designation_tpa"));
                tpa.setIDA(result.getInt("IDA"));
                
                ltpa.add(tpa);
                tpa = new Type_Article(); // permet de passer au prochain type d'article.
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(Type_ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ltpa;
        
    }
    
}
