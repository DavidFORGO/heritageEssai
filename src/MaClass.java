import heritageEssai.AccesseurEssai;
import heritageEssai.Aigle;
import heritageEssai.Avion;
import heritageEssai.AvionVolant;

//Lien du cours: https://www.jmdoudoux.fr/java/dej/chap-syntaxe.htm#syntaxe-1
//Lien du cours: https://www.jmdoudoux.fr/java/dej/chap-poo.htm
public class MaClass {
    public static  void main(String ... args){
        /*Planetes neptune = new Planetes();
        Planetes mars = new Planetes();
        Planetes venus = new Planetes();
        Planetes uranus = new Planetes();
        neptune.name= "neptune";
        mars.name = "mars";
        venus.name = "venus";
        uranus.name = "uranus";

        //neptune.revolution(-3542);
       // mars.rotation(-684);
       // venus.rotation(1250);
        //mars.acceuillirVisiteur(8);
       // mars.accueillirVisiteur("FREGATE");
       // System.out.println("Le nombre de visiteurs ayant déjà séjourné sur Mars est actuellement
        // de "+ mars.nbrevisiteur );

        uranus.nouvelleAtmosphere.tauxHydrogene = 83;
        uranus.nouvelleAtmosphere.tauxHelium = 15;
        uranus.nouvelleAtmosphere.tauxMethane = 2.5;

       uranus.afficheComposition("uranus");

        System.out.printf("La composition actuelle d'Uranus est:  %f  d'hydrogene %f d'helium %f de méthane\n ",
                uranus.nouvelleAtmosphere.tauxHydrogene,
                uranus.nouvelleAtmosphere.tauxHelium, uranus.nouvelleAtmosphere.tauxMethane);


        mars.nouvelleVaisseau.nbPassagers = 9;
        mars.nouvelleVaisseau.type = "FREGATE";
        mars.nouvelleVaisseau.nbPassagers = 42;
        mars.nouvelleVaisseau.type ="CROISEUR";

        mars.acceuillirVisiteur(mars.nouvelleVaisseau); */

        //Exo sur l'heritage heritageEssai.AvionVolant

        AccesseurEssai acces = new AccesseurEssai();
        acces.setValeur(30);
        int i = acces.getValeur();
        //System.out.println("ma valeur saisie est:"+ acces.getValeur());

        AvionVolant avion1 = new AvionVolant("heritageEssai.Avion");
        //avion1.name = "heritageEssai.Avion";
        avion1.move(100,200);
        avion1.fly(50);

        Aigle monAigle = new Aigle("heritageEssai.Aigle celeste");
        monAigle.fly(1000);
        monAigle.move(1000,5000);
        monAigle.eat();
        monAigle.type();

        Avion YetPrivee = new Avion("YetPrivee");
        YetPrivee.move(90,80);
        YetPrivee.fly(100);
        YetPrivee.prendPassager(100);

    }
}
