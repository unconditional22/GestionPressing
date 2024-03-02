/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author kabor
 */
public abstract class DAO<T> {
    
    public Connection connect = Connectdb.getInstance();
    
    // methode recherche 
    public abstract T rechercher(int id);
    
    // methode insertion 
    public abstract void inserer (T obj);
    
    // methode modifier
    public abstract void modifier (T obj, int id);
    
    // methode supprimer
    public abstract void supprimer (int id);
    
    // methode liste
    public abstract List<T>liste();
    
}
