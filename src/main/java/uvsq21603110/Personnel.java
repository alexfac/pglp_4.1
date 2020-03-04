package uvsq21603110;

import java.time.LocalDate;
import java.util.List;

public final class Personnel {

    private final String Nom;
    private final String Prenom;
    private final String Fonction;
    private final LocalDate Naissance;
    private final List<String> Telephone;

    public static class Builder{
        private final String Nom;
        private final String Prenom;
        private final String Fonction;
        private final LocalDate Naissance = LocalDate.now();
        private final List<String> Telephone = null;

        public Builder(String nom, String prenom, String fonction){
            this.Nom = nom;
            this.Prenom = prenom;
            this.Fonction = fonction;
        }

        public Builder addTel(String tel){
            Telephone.add(tel);
            return this;
        }

        public Personnel build(){
            return new Personnel(this);
        }
    }

    public Personnel(Builder builder) {
        this.Nom = builder.Nom;
        this.Prenom = builder.Prenom;
        this.Fonction = builder.Fonction;
        this.Naissance = builder.Naissance;
        this.Telephone = builder.Telephone;
    }

    public String getNom(){
        return this.Nom;
    }
    public String getPrenom(){
        return this.Prenom;
    }
    public String getFonction(){
        return this.Fonction;
    }
}
