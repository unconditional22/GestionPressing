/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Article;
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
public class ArticleDAO extends DAO<Article>{

    @Override
    public Article rechercher(int id) {
        Article article = new Article();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Article where IDA = " + id);
            
            if (result.next()) {
                article.setIDA(result.getInt("IDA"));
                article.setLibelleA(result.getString("LibelleA"));
                article.setPrixUA(result.getInt("PrixUA")); 
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return article;
    }
    
    public int getIdArticle (String LibelleA) {
        int IDA = 0;
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Article where LibelleA= '"+LibelleA+"'");
            
            if (result.next()) {
                IDA = result.getInt("IDA");
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return IDA;
    }

    @Override
    public void inserer(Article obj) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("insert into Article(LibelleA, PrixUA) values (?,?)");
            prepare.setString(1, obj.getLibelleA());
            prepare.setInt(2, obj.getPrixUA());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Article obj, int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("update Article set LibelleA =?, PrixUA =? where IDA = " + id);
             prepare.setString(1, obj.getLibelleA());
            prepare.setInt(2, obj.getPrixUA());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement) this.connect.prepareStatement("delete from Article where IDA = " + id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Article> liste() {
        
        Article article = new Article();
        List<Article> lart = new ArrayList();
           
        try {
         
            ResultSet result = this.connect.createStatement().executeQuery("select * from Article");
            
            while (result.next()) {
                article.setIDA(result.getInt("IDA"));
                article.setLibelleA(result.getString("LibelleA"));
                article.setPrixUA(result.getInt("PrixUA")); 
                
                lart.add(article);
                article = new Article(); // permet de passer au prochain article.
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lart;
        
    }
    
}
