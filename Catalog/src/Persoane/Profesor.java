package Persoane;

import Catalog.Materie;
import Catalog.TipOra;

import java.util.Vector;

public class Profesor extends Persoana{
    Vector<Materie> materii;
    Vector<TipOra> tipOre;

    public void setMaterii(Vector<Materie> materii) {
        this.materii = materii;
    }

    public void setTipOre(Vector<TipOra> tipOre){
        this.tipOre = tipOre;
    }



    public Profesor(String nume, String prenume, String email, String officialEmail, String phoneNumber, Vector<Materie> materii, Vector<TipOra> tipOre) {
        super(nume, prenume, email, officialEmail, phoneNumber);
        this.materii = materii;
        this.tipOre = tipOre;
    }
}





