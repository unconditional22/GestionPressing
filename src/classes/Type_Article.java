/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kabor
 */
public class Type_Article {
    private int ID_tpa;
    private String Designation_tpa;
    private int IDA;

    public Type_Article() {
    }

    public Type_Article(String Designation_tpa, int IDA) {
        this.Designation_tpa = Designation_tpa;
        this.IDA = IDA;
    }

    public Type_Article(int ID_tpa, String Designation_tpa, int IDA) {
        this.ID_tpa = ID_tpa;
        this.Designation_tpa = Designation_tpa;
        this.IDA = IDA;
    }

    public int getID_tpa() {
        return ID_tpa;
    }

    public void setID_tpa(int ID_tpa) {
        this.ID_tpa = ID_tpa;
    }

    public String getDesignation_tpa() {
        return Designation_tpa;
    }

    public void setDesignation_tpa(String Designation_tpa) {
        this.Designation_tpa = Designation_tpa;
    }

    public int getIDA() {
        return IDA;
    }

    public void setIDA(int IDA) {
        this.IDA = IDA;
    }

    @Override
    public String toString() {
        return "Type_Article{" + "ID_tpa=" + ID_tpa + ", Designation_tpa=" + Designation_tpa + ", IDA=" + IDA + '}';
    }
    
    
}
