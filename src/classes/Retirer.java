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
public class Retirer {
    private int id_retrait;
    private Date Date_retrait;
    private int Qt_retrait;
    private int IDA;
    private int ID_Client;

    public Retirer() {
    }

    public Retirer(Date Date_retrait, int Qt_retrait, int IDA, int ID_Client) {
        this.Date_retrait = Date_retrait;
        this.Qt_retrait = Qt_retrait;
        this.IDA = IDA;
        this.ID_Client = ID_Client;
    }

    public Retirer(int id_retrait, Date Date_retrait, int Qt_retrait, int IDA, int ID_Client) {
        this.id_retrait = id_retrait;
        this.Date_retrait = Date_retrait;
        this.Qt_retrait = Qt_retrait;
        this.IDA = IDA;
        this.ID_Client = ID_Client;
    }

    public int getId_retrait() {
        return id_retrait;
    }

    public void setId_retrait(int id_retrait) {
        this.id_retrait = id_retrait;
    }

    public Date getDate_retrait() {
        return Date_retrait;
    }

    public void setDate_retrait(Date Date_retrait) {
        this.Date_retrait = Date_retrait;
    }

    public int getQt_retrait() {
        return Qt_retrait;
    }

    public void setQt_retrait(int Qt_retrait) {
        this.Qt_retrait = Qt_retrait;
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
        return "Retirer{" + "id_retrait=" + id_retrait + ", Date_retrait=" + Date_retrait + ", Qt_retrait=" + Qt_retrait + ", IDA=" + IDA + ", ID_Client=" + ID_Client + '}';
    }

    
    
    
}
