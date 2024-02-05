package Opgave01;

public class Cirkel extends Rund{
    private double radius;

    public Cirkel(double areal, int x, int y, double radius) {
        super(areal, x, y);
        this.radius = radius;
    }
}
