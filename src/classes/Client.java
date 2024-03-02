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
public class Client {
     private int ID_Client;
    private String Nom;
    private String Prenom;
    private String Email_client;
    private String Tel_client;
    private String Ville_client;
    private String Rue_client;
    private Date DateNaiss_client;

    public Client() {
    }

    public Client(String Nom, String Prenom, String Email_client, String Tel_client, String Ville_client, String Rue_client, Date DateNaiss_client) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email_client = Email_client;
        this.Tel_client = Tel_client;
        this.Ville_client = Ville_client;
        this.Rue_client = Rue_client;
        this.DateNaiss_client = DateNaiss_client;
    }

    public Client(int ID_Client, String Nom, String Prenom, String Email_client, String Tel_client, String Ville_client, String Rue_client, Date DateNaiss_client) {
        this.ID_Client = ID_Client;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email_client = Email_client;
        this.Tel_client = Tel_client;
        this.Ville_client = Ville_client;
        this.Rue_client = Rue_client;
        this.DateNaiss_client = DateNaiss_client;
    }

    public int getID_Client() {
        return ID_Client;
    }

    public void setID_Client(int ID_Client) {
        this.ID_Client = ID_Client;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getEmail_client() {
        return Email_client;
    }

    public void setEmail_client(String Email_client) {
        this.Email_client = Email_client;
    }

    public String getTel_client() {
        return Tel_client;
    }

    public void setTel_client(String Tel_client) {
        this.Tel_client = Tel_client;
    }

    public String getVille_client() {
        return Ville_client;
    }

    public void setVille_client(String Ville_client) {
        this.Ville_client = Ville_client;
    }

    public String getRue_client() {
        return Rue_client;
    }

    public void setRue_client(String Rue_client) {
        this.Rue_client = Rue_client;
    }

    public Date getDateNaiss_client() {
        return DateNaiss_client;
    }

    public void setDateNaiss_client(Date DateNaiss_client) {
        this.DateNaiss_client = DateNaiss_client;
    }

    @Override
    public String toString() {
        return "Client{" + "ID_Client=" + ID_Client + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Email_client=" + Email_client + ", Tel_client=" + Tel_client + ", Ville_client=" + Ville_client + ", Rue_client=" + Rue_client + ", DateNaiss_client=" + DateNaiss_client + '}';
    }

   
    

    
}
