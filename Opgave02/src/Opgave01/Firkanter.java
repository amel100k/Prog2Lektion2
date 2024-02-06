package Opgave01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Firkanter extends Figur {
    private double højde;
    private double bredde;
    private ArrayList<Kvadrat> kvadrater = new ArrayList<>();
    private ArrayList<Rektangel> rektangeler = new ArrayList<>();

    public Firkanter(int x, int y, double højde, double bredde) {
        super(x, y);
        this.højde = højde;
        this.bredde = bredde;
    }

    public double getHøjde() {
        return højde;
    }

    public double getBredde() {
        return bredde;
    }

    public void setHøjde(double højde) {
        this.højde = højde;
    }

    public void setBredde(double bredde) {
        this.bredde = bredde;
    }
}
