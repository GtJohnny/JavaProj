import Catalog.*;

import java.util.Collections;
import java.util.Vector;

public class Meniu {
    static Meniu menu;

    Vector<Departament> departamente;
    Vector<Grupa> grupe;

    private Meniu(){
        //citire din baza de date
    }

    public Meniu(Vector<Departament> departamente) {
        this.departamente = new Vector<>(departamente);
        this.grupe = new Vector<>();
        for(Departament dep : departamente){
            for(An an : dep.getAni()){
                for(Serie serie : an.getSerii()){
                    this.grupe.addAll(serie.getGrupe());
                }
            }
        }
        Collections.sort(this.grupe);
    }

    private Grupa binarySearchGr(int left, int right,String idGrupa){
        int mid = left + (right-left)/2;

        if(right - left <4){
            for(int i = left; i <=right; i++){
                if(grupe.get(i).getIdGrupa().compareTo(idGrupa)==0){
                    return grupe.get(i);
                }
            }
        }

        if(this.grupe.get(mid).getIdGrupa().compareTo(idGrupa)==0){
            return grupe.get(mid);
        }

        if(this.grupe.get(mid).getIdGrupa().compareTo(idGrupa)<0){
            return binarySearchGr(left,mid,idGrupa);
        }else{
            return binarySearchGr(mid,right,idGrupa);

        }


    }


    public Grupa getGrupa(String idGrupa){
        return binarySearchGr(0,grupe.size()-1,idGrupa);
    }



    public Meniu getInstance(){
        if(menu==null){
            menu = new Meniu();
        }
        return menu;
    }



    public Vector<Departament> getDepartamente() {
        return new Vector<>(departamente);
    }

    public Departament findDepartament(String numeDepartament){
        for(var dep : departamente){
            if(dep.getNumeDepartament() == numeDepartament)
                return dep;
        }
        return null;
    }


    public static void main(String[] args) {

    }


}
