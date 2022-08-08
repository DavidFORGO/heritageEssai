public class BureauDeChange {
    public static void main(String... args) {
        int  montantInitial = 1500; //montant initial à convertir
        double tauxDeChange = 1.22; //le taux de change (1.22 Dollars pour 1 euro)
       double resultat = montantInitial * tauxDeChange ; //le resultat de la conversion
        System.out.println("le montant convertit est " + resultat);
    }
}
