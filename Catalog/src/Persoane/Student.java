package Persoane;

import Catalog.*;

import java.util.Vector;

public class Student extends Persoana{

    private Grupa grupa;
    private Departament departament;

    Vector<Materie> materii;

    public Student(String nume, String prenume, String email, String officialEmail, String phoneNumber, Grupa grupa, Vector<Materie> materii) {
        super(nume, prenume, email, officialEmail, phoneNumber);
        this.grupa = grupa;
        this.materii = materii;
    }



}
