public class Tp8 {
    public static void main(String... args){

        //int nbrePlanets = 8;
        for (int i=7; i<=9; i++) {
            switch (i) {
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
                    System.out.println("Le programme ne peut pas fournir de résultat pour " + i);
            }
        }

    }
}
