package Catalog;

import Persoane.Student;

import java.util.Vector;

public class Grupa implements Comparable {
    public Student sefGrupa;
    Vector<Student> studenti;
    String idGrupa;
    public Grupa(Student sefGrupa, Vector<Student> studenti){
        this.sefGrupa = sefGrupa;
        this.studenti = new Vector<>(studenti);
    }

    public String getIdGrupa() {
        return idGrupa;
    }

    @Override
    public int compareTo(Object o) {
        return this.idGrupa.compareTo(((Grupa)o).idGrupa);
    }

    public void addStudent(Student student){
        if(studenti.contains(student)){
            throw new IllegalArgumentException("Studentul deja se afla in aceasta grupa");
        }
        studenti.add(student);
    }

    public boolean  removeStudent(Student student){
        return studenti.removeElement(student);
    }
}
