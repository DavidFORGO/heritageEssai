public class Planetes {
    //static final int ANGLE;
    static final int ANGLE = 360;
    String name, substance;
    int diameter, nbrevisiteur;
    //creation de ma novelle atmosphère
    Vaisseau ancienVaisseau;
    Atmosphere nouvelleAtmosphere = new Atmosphere();
    public void afficheComposition(String nomPlanete){
        /* System.out.println("A x% d'hydrogène \n");
       System.out.println("A x% d'argon \n");
        System.out.println("A x% de dioxyde de carbone \n");
        System.out.println("A x% d'azote \n");
        System.out.println("A x% d'hélium  \n");
        System.out.println("A x% de méthane \n");
        System.out.println("A x% de sodium  \n"); */
        System.out.println("L'atmosphère de" + nomPlanete+ "est composée :  \n");
        for(int i =1; i<=7; i++){
            switch (i){
                case 1:
                    System.out.println(i +"  x% d'hydrogène \n");
                    break;
                case 2 :
                    System.out.println(i +"  x% d'argon \n");
                    break;
                case 3 :
                    System.out.println(i +"  x% de dioxyde de carbone \n");
                    break;
                case 4:
                    System.out.println(i +"  x% d'azote \n");
                    break;
                case 5 :
                    System.out.println(i + "  x% d'hélium  \n");
                    break;
                case 6:
                    System.out.println(i +"  x% de méthane \n");
                    break;
                case 7 :
                    System.out.println(i +"  x% de sodium  \n");
                    break;



            }


        }
    }

    public void rotation(int degre){
        int tour = degre/ANGLE;
        System.out.printf("%s  a effectué %d tours complets sur elle-même.\n", this.name, tour);

    }
    public void revolution(int degre){
        int tour = degre/360;
        System.out.printf("%s a effectué %d tours autour de son étoile.\n", this.name, tour);
    }
    Vaisseau nouvelleVaisseau = new Vaisseau();

    public  Vaisseau acceuillirVisiteur(Vaisseau maVaisseau){
        this.nbrevisiteur += maVaisseau.nbPassagers;
        System.out.println("le nombre de personne ayant sejourner est " + this.nbrevisiteur);
        return ancienVaisseau;
    }
    public void accueillirVisiteur(String vaisseau){
        switch (vaisseau){
            case "CHASSEUR":
                this.nbrevisiteur += 3;
                break;
            case "FREGATE":
                this.nbrevisiteur += 12;
                break;
            case "CROISEUR":
                this.nbrevisiteur += 50;
                break;

        }
    }



}
