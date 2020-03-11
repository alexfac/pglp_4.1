package uvsq21603110;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Groupe {

    private List GroupeList;
    public String NomGroupe;

    public Groupe(String nomGroupe){

        this.NomGroupe = nomGroupe;
        this.GroupeList = new ArrayList<Personnel>();
    }

    public void add2Groupe(Personnel p){

        this.GroupeList.add(p);
    }

    public List<Personnel> getListGroup(){
        List<Personnel> unmodifiableList = Collections.unmodifiableList(GroupeList);
        return unmodifiableList;
    }

    public String getNomGroupe() {
        return this.NomGroupe;
    }
}
