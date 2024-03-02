/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kabor
 */
public class Article {
    private int IDA;
    private String LibelleA;
    private int PrixUA;

    public Article() {
    }

    public Article(String LibelleA, int PrixUA) {
        this.LibelleA = LibelleA;
        this.PrixUA = PrixUA;
    }

    public Article(int IDA, String LibelleA, int PrixUA) {
        this.IDA = IDA;
        this.LibelleA = LibelleA;
        this.PrixUA = PrixUA;
    }

    public int getIDA() {
        return IDA;
    }

    public void setIDA(int IDA) {
        this.IDA = IDA;
    }

    public String getLibelleA() {
        return LibelleA;
    }

    public void setLibelleA(String LibelleA) {
        this.LibelleA = LibelleA;
    }

    public int getPrixUA() {
        return PrixUA;
    }

    public void setPrixUA(int PrixUA) {
        this.PrixUA = PrixUA;
    }

    @Override
    public String toString() {
        return "Article{" + "IDA=" + IDA + ", LibelleA=" + LibelleA + ", PrixUA=" + PrixUA + '}';
    }

    
    
    
}
