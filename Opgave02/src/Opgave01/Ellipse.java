package Opgave01;

public class Ellipse extends Rund {
    private double aRadius;
    private double bRadius;

    public Ellipse(double areal, int x, int y, double aRadius, double bRadius) {
        super(areal, x, y);
        this.aRadius = aRadius;
        this.bRadius = bRadius;
    }
}
