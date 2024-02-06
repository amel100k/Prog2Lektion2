package Opgave01;

public class Rektangel extends Firkanter implements Reziable{
    public Rektangel(int x, int y, double højde, double bredde) {
        super(x, y, højde, bredde);
    }
    public double areal(){
        double areal;
        areal = this.getBredde() * this.getHøjde();
        return areal;
    }

    @Override
    public void doubleUp() {
        setBredde(this.getBredde() * 2);
        setHøjde(this.getHøjde() * 2);
    }

    @Override
    public void halve() {
        setBredde(this.getBredde() / 2);
        setHøjde(this.getHøjde() / 2);
    }
}
