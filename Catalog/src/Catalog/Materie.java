package Catalog;

import Persoane.Profesor;

import java.util.Vector;

public class Materie{
    Vector<Profesor> profesori;

    Vector<String> SurseNota = new Vector<>();
    Vector<Double> PonderiNota = new Vector<>();
    Vector<Integer> Note = new Vector<>();

    int calculeazaNota() {
        if (Note.size() != PonderiNota.size()) throw new IllegalStateException("Notele nu au ponderile corecte");

        double sum = 0;
        for (int i = 0; i < Note.size(); i++) {
            sum += Note.elementAt(i) * PonderiNota.get(i);
        }
        return (int) Math.round(sum);
    }

    void setSurseNota(Vector<String> surseNote) {
        this.SurseNota.clear();
        for (var sursa : surseNote) {
            SurseNota.add(sursa);
        }
    }


    Vector<String> getSurseNota() {
        return new Vector<>(SurseNota);
    }

    void setPondereNote(String sursa, double pondere) {
        for (int i = 0; i < PonderiNota.size(); i++) {
            if (SurseNota.get(i) == sursa) {
                PonderiNota.set(i, pondere);
            }
        }
    }

    void setNota(String sursa, int nota) {
        for (int i = 0; i < Note.size(); i++) {
            if (SurseNota.get(i) == sursa) {
                Note.set(i, nota);
            }
        }
    }

    @Override
    public String toString() {
        return "Materie{" +
                "profesori=" + profesori +
                ", SurseNota=" + SurseNota +
                ", PonderiNota=" + PonderiNota +
                ", Note=" + Note +
                '}';
    }
}
