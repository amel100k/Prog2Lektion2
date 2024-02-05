package Opgave01;

public class Rektangel extends Firkanter{
    public Rektangel(double areal, int x, int y, double højde, double bredde) {
        super(x, y, højde, bredde);
    }
    public double areal(){
        double areal;
        areal = this.getBredde() * this.getHøjde();
        return areal;
    }
}
