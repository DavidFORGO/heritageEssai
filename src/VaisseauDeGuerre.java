public class VaisseauDeGuerre extends Vaisseaux{
    /*String type;
    public void setType(String type){
        this.type=type;
    }
    public  String getType(){
        return this.type;
    }*/
    public void attaque(Vaisseaux vaisseaux, String arme, int dureeAttaque){

        System.out.println("Un vaisseau de type " +type+" attaque un vaisseau de type "+ vaisseaux.type+" en utilisant " +
                " l'arme "+arme+" pendant "+dureeAttaque+" minutes."); //ici le type n'est pas pris en charge
        System.out.println("De detruire complètement le bouclier du vaisseau attaqué");
        System.out.println("De dimunier de moitier le blindage du vaisseau attaqué");
    }
}
