package Opgave01;

public class Cirkel extends Rund{
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
}
