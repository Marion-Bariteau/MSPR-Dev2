package com.company;

public class Materiel {
    private String allias;
    private String nom;

    public Materiel(String allias, String nom) {
        this.allias = allias;
        this.nom = nom;
    }

    public String getAllias() {
        return allias;
    }

    public void setAllias(String allias) {
        this.allias = allias;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Materiel{" +
                "allias='" + allias + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
