public class EssaiTp10 {
        public static void main(String[] args){
            //creation de nouvelle Planete
            Planete P1 = new Planete("Mars", 1000, "gazeux");
            Planete P2 = new Planete("Neptune", 1000000, "");
            //System.out.println(P1.name);
            //la sortie
            P2.rotation();
            P1.revolution();
        }
    }

    //Declaration de ma class Planete
    class Planete{
       String name;
        int diameter;
        String substance;
        //construteurs
        public Planete(String name, int diameter, String substance){
            //initialisation
            this.name = name;
            this.diameter = diameter;
            this.substance = substance;

        }
        // les methodes
        public void rotation(){
            System.out.println("Je suis la planète " + Planete.this.name+ ", et je tourne autour de mon étoile.");
        }
        public void revolution(){
            System.out.println("Je suis la planète "  + Planete.this.name+ ", et je tourne sur moi même.");
        }
    }



