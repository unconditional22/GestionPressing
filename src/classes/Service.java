/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kabor
 */
public class Service {
    private int IDS;
    private String LibelleS;
    private int NumS;
    private int PrixUS;

    public Service() {
    }

    public Service(String LibelleS, int NumS, int PrixUS) {
        this.LibelleS = LibelleS;
        this.NumS = NumS;
        this.PrixUS = PrixUS;
    }

    public Service(int IDS, String LibelleS, int NumS, int PrixUS) {
        this.IDS = IDS;
        this.LibelleS = LibelleS;
        this.NumS = NumS;
        this.PrixUS = PrixUS;
    }

    public int getIDS() {
        return IDS;
    }

    public void setIDS(int IDS) {
        this.IDS = IDS;
    }

    public String getLibelleS() {
        return LibelleS;
    }

    public void setLibelleS(String LibelleS) {
        this.LibelleS = LibelleS;
    }

    public int getNumS() {
        return NumS;
    }

    public void setNumS(int NumS) {
        this.NumS = NumS;
    }

    public int getPrixUS() {
        return PrixUS;
    }

    public void setPrixUS(int PrixUS) {
        this.PrixUS = PrixUS;
    }

    @Override
    public String toString() {
        return "Service{" + "IDS=" + IDS + ", LibelleS=" + LibelleS + ", NumS=" + NumS + ", PrixUS=" + PrixUS + '}';
    }
    
    
}
