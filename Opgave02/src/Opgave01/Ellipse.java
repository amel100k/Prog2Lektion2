package Opgave01;

public class Ellipse extends Rund {
    private double aRadius;
    private double bRadius;

    public Ellipse(int x, int y, double aRadius, double bRadius) {
        super(x, y);
        this.aRadius = aRadius;
        this.bRadius = bRadius;
    }
    public double areal(){
        double areal;
        areal = Math.PI * this.aRadius * this.bRadius;
        return areal;
    }
}
