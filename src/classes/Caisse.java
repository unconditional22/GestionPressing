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
public class Caisse {
    private int ID_Caisse;
    private float Mt_actuel;
    private Date Date_encaissement;
    private float Mt_total;

    public Caisse() {
    }

    public Caisse(float Mt_actuel, Date Date_encaissement, float Mt_total) {
        this.Mt_actuel = Mt_actuel;
        this.Date_encaissement = Date_encaissement;
        this.Mt_total = Mt_total;
    }

    public Caisse(int ID_Caisse, float Mt_actuel, Date Date_encaissement, float Mt_total) {
        this.ID_Caisse = ID_Caisse;
        this.Mt_actuel = Mt_actuel;
        this.Date_encaissement = Date_encaissement;
        this.Mt_total = Mt_total;
    }

    public int getID_Caisse() {
        return ID_Caisse;
    }

    public void setID_Caisse(int ID_Caisse) {
        this.ID_Caisse = ID_Caisse;
    }

    public float getMt_actuel() {
        return Mt_actuel;
    }

    public void setMt_actuel(float Mt_actuel) {
        this.Mt_actuel = Mt_actuel;
    }

    public Date getDate_encaissement() {
        return Date_encaissement;
    }

    public void setDate_encaissement(Date Date_encaissement) {
        this.Date_encaissement = Date_encaissement;
    }

    public float getMt_total() {
        return Mt_total;
    }

    public void setMt_total(float Mt_total) {
        this.Mt_total = Mt_total;
    }

    @Override
    public String toString() {
        return "Caisse{" + "ID_Caisse=" + ID_Caisse + ", Mt_actuel=" + Mt_actuel + ", Date_encaissement=" + Date_encaissement + ", Mt_total=" + Mt_total + '}';
    }
    

    
}
