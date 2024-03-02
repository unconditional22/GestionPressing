/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kabor
 */
public class Type_Service {
    private int ID_tps;
    private String Designation_tps;
    private int IDS;

    public Type_Service() {
    }

    public Type_Service(String Designation_tps, int IDS) {
        this.Designation_tps = Designation_tps;
        this.IDS = IDS;
    }

    public Type_Service(int ID_tps, String Designation_tps, int IDS) {
        this.ID_tps = ID_tps;
        this.Designation_tps = Designation_tps;
        this.IDS = IDS;
    }

    public int getID_tps() {
        return ID_tps;
    }

    public void setID_tps(int ID_tps) {
        this.ID_tps = ID_tps;
    }

    public String getDesignation_tps() {
        return Designation_tps;
    }

    public void setDesignation_tps(String Designation_tps) {
        this.Designation_tps = Designation_tps;
    }

    public int getIDS() {
        return IDS;
    }

    public void setIDS(int IDS) {
        this.IDS = IDS;
    }

    @Override
    public String toString() {
        return "Type_Service{" + "ID_tps=" + ID_tps + ", Designation_tps=" + Designation_tps + ", IDS=" + IDS + '}';
    }
    
    
}
