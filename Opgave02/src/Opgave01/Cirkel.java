package Opgave01;

public class Cirkel extends Rund implements Reziable{
    private double radius;

    public Cirkel(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public double areal(){
        double areal;
        areal = Math.PI * Math.pow(this.radius,2);
        return areal;
    }

    @Override
    public void doubleUp() {
        radius = radius * 2;
    }

    @Override
    public void halve() {

    }

    public double getRadius() {
        return radius;
    }
}
