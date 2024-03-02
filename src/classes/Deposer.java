/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Date;

/**
 *
 * @author kabor
 */
public class Deposer {
    private int id_depot;
    private Date Date_depot;
    private int Qt_depot;
    private int IDA;
    private int ID_Client;

    public Deposer() {
    }

    public Deposer(Date Date_depot, int Qt_depot, int IDA, int ID_Client) {
        this.Date_depot = Date_depot;
        this.Qt_depot = Qt_depot;
        this.IDA = IDA;
        this.ID_Client = ID_Client;
    }

    public Deposer(int id_depot, Date Date_depot, int Qt_depot, int IDA, int ID_Client) {
        this.id_depot = id_depot;
        this.Date_depot = Date_depot;
        this.Qt_depot = Qt_depot;
        this.IDA = IDA;
        this.ID_Client = ID_Client;
    }

    public int getId_depot() {
        return id_depot;
    }

    public void setId_depot(int id_depot) {
        this.id_depot = id_depot;
    }

    public Date getDate_depot() {
        return Date_depot;
    }

    public void setDate_depot(Date Date_depot) {
        this.Date_depot = Date_depot;
    }

    public int getQt_depot() {
        return Qt_depot;
    }

    public void setQt_depot(int Qt_depot) {
        this.Qt_depot = Qt_depot;
    }

    public int getIDA() {
        return IDA;
    }

    public void setIDA(int IDA) {
        this.IDA = IDA;
    }

    public int getID_Client() {
        return ID_Client;
    }

    public void setID_Client(int ID_Client) {
        this.ID_Client = ID_Client;
    }

    @Override
    public String toString() {
        return "Deposer{" + "id_depot=" + id_depot + ", Date_depot=" + Date_depot + ", Qt_depot=" + Qt_depot + ", IDA=" + IDA + ", ID_Client=" + ID_Client + '}';
    }

   
    
   
}
