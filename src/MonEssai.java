public class MonEssai {
    public static void main(String[] args) {

       /** int nbrePlanet = 8;

        System.out.println("Aux dernières nouvelles, le nombre total de planètes dans " +
                "le système solaire est de " + nbrePlanet);
        nbrePlanet = 9;
        System.out.println("Il y a quelques années cependant, elles étaient au nombre de " + nbrePlanet);

        //short nbrePlanet = 8;
        //System.out.println("Il y a quelques années cependant, elles étaient au nombre de  " +  nbrePlanet = 8);
    **/
       /*int nbrePlanet = 8;
       String maChaine = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de ";
       System.out.println(maChaine + nbrePlanet);
       nbrePlanet = 9;
       maChaine = "Il y a quelques années cependant, elles étaient au nombre de ";
        System.out.println(maChaine + nbrePlanet);*/

        short annee = 2003;
        int nbPlanetes=8;
        if(annee > 2006){
            System.out.println("En "+annee + "les planètes du système solaire étaient au nombre de : "+nbPlanetes);
        }else {
            nbPlanetes++;
            System.out.println("le nombre de planète jusqu'en 2006 inclus étaient au nombre de : "+ nbPlanetes);
        }
    }
}
