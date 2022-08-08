public class Main {
    public static void main(String[] args) {
   /*Vaisseaux vaisseauxGuerre = new Vaisseaux();
   vaisseauxGuerre.blindage=156;
   vaisseauxGuerre.type="vaisseau de guerre";
   vaisseauxGuerre.activerBouclier();
   vaisseauxGuerre.desactiverBouclier();
   vaisseauxGuerre.resistanceDuBouclier = 3; */

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre(); //vaisseau de guerre est un type de vaisseux
        chasseur.type="vaisseau de guerre";
        chasseur.blindage= 156;
        chasseur.resistanceDuBouclier=2;
        //vaisseau type civil
        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "vaisseau civil";
        vaisseauMonde.blindage = 5000;
        vaisseauMonde.resistanceDuBouclier= 30;
        //Activation du bouclier
        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();

        //Attaque du vaisseau monde par vaisseu de guerre
        chasseur.attaque(vaisseauMonde,"lasser photonique",3);
        //Desactivation du bouclier du vaisseau monde
        vaisseauMonde.desactiverBouclier();

        //Affichage duree de protection du bouclier


        //Affichage valeur de blindage du vaisseaux monde

    }

}