package heritageEssai;

public class Avion extends AvionVolant{
    public Avion(String name){
        super(name);
    }
    public void prendPassager(int nbrePa){
        this.nbrePassager = nbrePa;
        System.out.println("je peux prendre plus de 50 passager\n");
    }
    private int nbrePassager;
}
