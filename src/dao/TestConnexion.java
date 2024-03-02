/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author kabor
 */
public class TestConnexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection connect = Connectdb.getInstance();
        if (connect != null) {
            System.out.println("connection effective!");
        }else {
            System.out.println("pas de connection.");
        }
    }
    
}
