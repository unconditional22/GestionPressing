/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kabor
 */
public class Recevoir {
    private int id_recevoir;
    private int ID_Admin;
    private int ID_Client;

    public Recevoir() {
    }

    public Recevoir(int ID_Admin, int ID_Client) {
        this.ID_Admin = ID_Admin;
        this.ID_Client = ID_Client;
    }

    public Recevoir(int id_recevoir, int ID_Admin, int ID_Client) {
        this.id_recevoir = id_recevoir;
        this.ID_Admin = ID_Admin;
        this.ID_Client = ID_Client;
    }

    public int getId_recevoir() {
        return id_recevoir;
    }

    public void setId_recevoir(int id_recevoir) {
        this.id_recevoir = id_recevoir;
    }

    public int getID_Admin() {
        return ID_Admin;
    }

    public void setID_Admin(int ID_Admin) {
        this.ID_Admin = ID_Admin;
    }

    public int getID_Client() {
        return ID_Client;
    }

    public void setID_Client(int ID_Client) {
        this.ID_Client = ID_Client;
    }

    @Override
    public String toString() {
        return "Recevoir{" + "id_recevoir=" + id_recevoir + ", ID_Admin=" + ID_Admin + ", ID_Client=" + ID_Client + '}';
    }

   
    
}
