public class Vaisseaux {
    int blindage, resistanceDuBouclier;
    String type;
    public void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+ type);
    }
    public void desactiverBouclier(){
        System.out.println("Desactivation du bouclier d'un vaisseau de type "+ type);
    }
}
