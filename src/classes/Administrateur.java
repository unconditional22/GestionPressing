/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kabor
 */
public class Administrateur {
    private int ID_Admin;
    private String Nom;
    private String Prenom;
    private String Login_admin;
    private String Password_admin;
    private String Profil_admin;
    private int ID_Caisse;

    public Administrateur() {
    }

    public Administrateur(String Nom, String Prenom, String Login_admin, String Password_admin, String Profil_admin, int ID_Caisse) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Login_admin = Login_admin;
        this.Password_admin = Password_admin;
        this.Profil_admin = Profil_admin;
        this.ID_Caisse = ID_Caisse;
    }

    public Administrateur(int ID_Admin, String Nom, String Prenom, String Login_admin, String Password_admin, String Profil_admin, int ID_Caisse) {
        this.ID_Admin = ID_Admin;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Login_admin = Login_admin;
        this.Password_admin = Password_admin;
        this.Profil_admin = Profil_admin;
        this.ID_Caisse = ID_Caisse;
    }

    public int getID_Admin() {
        return ID_Admin;
    }

    public void setID_Admin(int ID_Admin) {
        this.ID_Admin = ID_Admin;
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

    public String getLogin_admin() {
        return Login_admin;
    }

    public void setLogin_admin(String Login_admin) {
        this.Login_admin = Login_admin;
    }

    public String getPassword_admin() {
        return Password_admin;
    }

    public void setPassword_admin(String Password_admin) {
        this.Password_admin = Password_admin;
    }

    public String getProfil_admin() {
        return Profil_admin;
    }

    public void setProfil_admin(String Profil_admin) {
        this.Profil_admin = Profil_admin;
    }

    public int getID_Caisse() {
        return ID_Caisse;
    }

    public void setID_Caisse(int ID_Caisse) {
        this.ID_Caisse = ID_Caisse;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "ID_Admin=" + ID_Admin + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Login_admin=" + Login_admin + ", Password_admin=" + Password_admin + ", Profil_admin=" + Profil_admin + ", ID_Caisse=" + ID_Caisse + '}';
    }
    
    
    
}
