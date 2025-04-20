package Catalog;

import Persoane.Profesor;

import java.util.Vector;

public class Departament {
    String numeDepartament;
    Profesor coordonator;

    public String getNumeDepartament() {
        return numeDepartament;
    }

    public Profesor getCoordonator() {
        return coordonator;
    }

    Vector<An> ani;

    public Departament(String numeDepartament, Profesor coordonator, Vector<An> ani) {
        this.numeDepartament = numeDepartament;
        this.coordonator = coordonator;
        this.ani = ani;
    }

    public Vector<An> getAni() {
        return ani;
    }

    public An findAn(String idAn){
        for(An x : ani){
            if(x.getIdAn() == idAn){
                return x;
            }
        }
        return null;
    }
}
