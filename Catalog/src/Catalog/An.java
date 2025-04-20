package Catalog;

import java.util.Vector;

public class An {
    private String idAn;

    Vector<Serie> serii;

    public An(String idAn, Vector<Serie> serii) {
        this.idAn = idAn;
        this.serii = serii;
    }

    public String getIdAn() {
        return idAn;
    }

    public Vector<Serie> getSerii() {
        return new Vector<>(serii);
    }

    public Serie getSerie(String idSerie){
        for(Serie x : serii){
            if(x.getIdSerie() == idSerie){
                return x;
            }
        }
        return null;
    }


}
