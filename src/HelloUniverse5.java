public class HelloUniverse5 {
    public static void main(String... args){
       /*short annee = 2007;

            if(annee <1800){
                System.out.println("En "+annee + " les planètes du système solaire étaient au nombre de  : 8 ");
            }
            else if(annee <1700){
                System.out.println("En "+annee + " les planètes du système solaire étaient au nombre de  : 7 ");
            }
            else if(annee <2006){
                System.out.println("En "+annee + " les planètes du système solaire étaient au nombre de  : 9");
            }
            else {
                System.out.println("En "+annee + " les planètes du système solaire étaient au nombre de  : 8 ");
            }*/

        int nbrePlanets = 8;
        switch (nbrePlanets){
            case 7:
                System.out.println("On sait qu'au 16e siècle, seules 7 planètes avaient été découvertes");
                break;
            case 8:
                System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17e siècle, " +
                        "mais il a également été réduite de 9 à 8 en 2006");
                break;
            case 9:
                System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18e siècle et " +
                        "ce jusqu'en 2006, où le nombre a été réduit à 8");
                break;
            default:
                System.out.println("Le programme ne peut pas fournir de résultat pour " + nbrePlanets);
        }

}
}
