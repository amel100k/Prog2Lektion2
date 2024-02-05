package Opgave01;

public class Kvadrat extends Firkanter{
    public Kvadrat(int x, int y, double højde, double bredde) {
        super(x, y, højde, bredde);
    }
    public double areal(){
        double areal;
        areal = this.getBredde() * this.getHøjde();
        return areal;
    }
}
