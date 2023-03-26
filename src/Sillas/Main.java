package Sillas;

public class Main {
    public static void main(String[] args) {
        PostProd pP = new PostProd();

        System.out.println("Chair: ");
        pP.hasLegs();
        pP.sitOn();

        System.out.println("");

        System.out.println("Sofa: ");
        pP.numCushions();

        System.out.println("");

        System.out.println("SideTable: ");
        pP.size();
        pP.color();

    }
    }
