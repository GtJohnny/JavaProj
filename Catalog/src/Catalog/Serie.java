package Catalog;

import java.util.Vector;

public class Serie {
    Vector<Grupa> grupe;
    String idSerie;

    public String getIdSerie() {
        return idSerie;
    }

    public Vector<Grupa> getGrupe() {
        return new Vector<>(grupe);
    }

    public Grupa getGrupa(String idGrupa){
        for(var x : grupe){
            if(x.getIdGrupa() == idGrupa){
                return x;
            }
        }
        return null;
    }
}
