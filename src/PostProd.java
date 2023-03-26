package Sillas;

public class PostProd extends Production {

    @Override
    public void sitOn() {
        super.sitOn();
        System.out.println("Can sit on it");
    }

    @Override
    public void size() {
        super.size();
        System.out.println("40 cm");
    }
    @Override
    public void hasLegs() {
        super.hasLegs();
        System.out.println("Has legs");
    }

    @Override
    public void color() {
        super.color();
        System.out.println("White");
    }

    @Override
    public void numCushions(){
        super.color();
        System.out.println("3 cushions");
    }
}