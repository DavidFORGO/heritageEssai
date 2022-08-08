public class NotionDeClasse {
    public static void main(String[] args){
        //creation de nouvelle ordinateur et marque
        Marque hp = new Marque("mac");
        System.out.println(hp.nom);
    }
}

//Declaration de ma class ordinateur
class Ordinateur{
    int capaciteRam;
    int capaciteDisqueDure;
   String typeCpu;
    Marque marque;
    //construteurs
    public Ordinateur(int capaciteRam, int capaciteDisqueDure, String typeCpu, Marque marque){
        //initialisation
        this.capaciteRam = capaciteRam;
        this.capaciteDisqueDure = capaciteDisqueDure;
        this.typeCpu = typeCpu;
        this.marque = marque;
    }
}
//Declaration de ma class marque
class Marque{
    String nom;
    //construteurs
    public Marque(String nom){
        this.nom = nom;
    }
}
