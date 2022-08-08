package heritageEssai;

public class AvionVolant {
    protected int X, Y, Z;
    protected String name;
    public AvionVolant(String name){
        this.name = name;
        System.out.println("Mon nom est :" + this.name);
    }
    public void move(int X, int Y){ //se deplace
        this.X= X;
        this.Y = Y;
        System.out.println("je me deplace de(X="+ this.X +", Y="+ this.Y+ ")");
    }
    public void fly(int Z){   //vole
        this.Z= Z;
        System.out.println(this.name+ " s'eleve dans les aires à "+ this.Z + "km d'altitude\n");
    }
}
