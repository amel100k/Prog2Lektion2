package Opgave01;

public class Firkanter extends Figur {
    private double højde;
    private double bredde;

    public Firkanter(double areal, int x, int y, double højde, double bredde) {
        super(areal, x, y);
        this.højde = højde;
        this.bredde = bredde;
    }
}
