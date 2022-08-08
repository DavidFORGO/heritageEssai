package heritageEssai;

public class Aigle extends AvionVolant{
   // private int mPosX,mPosY,mPosZ;
    //private String name;
    public Aigle(String name){
        //this.name = name;
        super(name);
        //System.out.println("Mon nom est :" + this.name);
    }
    /*public void move(int X, int Y){
        this.mPosX = X;
        this.mPosY =Y;
        System.out.println(this.name +", je me deplace de(X="+ this.mPosX +", Y"+ this.mPosY+ ")");
    }
    public void fly(int Z){   //vole
        this.mPosZ= Z;
        System.out.println(this.name+ " s'eleve dans les aires à "+ this.mPosZ + " km d'altitude");
    }*/
    public void eat(){
        System.out.println("je mange que de la viande.");
    }
    public void type(){
        System.out.println("je vais partie des oiseaux \n");
    }

}
