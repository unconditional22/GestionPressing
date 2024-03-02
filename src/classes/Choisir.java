/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kabor
 */
public class Choisir {
    private int id_choisir;
    private int IDS;
    private int ID_Client;

    public Choisir() {
    }

    public Choisir(int IDS, int ID_Client) {
        this.IDS = IDS;
        this.ID_Client = ID_Client;
    }

    public Choisir(int id_choisir, int IDS, int ID_Client) {
        this.id_choisir = id_choisir;
        this.IDS = IDS;
        this.ID_Client = ID_Client;
    }

    public int getId_choisir() {
        return id_choisir;
    }

    public void setId_choisir(int id_choisir) {
        this.id_choisir = id_choisir;
    }

    public int getIDS() {
        return IDS;
    }

    public void setIDS(int IDS) {
        this.IDS = IDS;
    }

    public int getID_Client() {
        return ID_Client;
    }

    public void setID_Client(int ID_Client) {
        this.ID_Client = ID_Client;
    }

    @Override
    public String toString() {
        return "Choisir{" + "id_choisir=" + id_choisir + ", IDS=" + IDS + ", ID_Client=" + ID_Client + '}';
    }

    
}
