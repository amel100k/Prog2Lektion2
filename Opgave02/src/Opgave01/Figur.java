package Opgave01;

import java.util.ArrayList;

public class Figur {
    private int x;
    private int y;
    private ArrayList<Rund> rundeFigurer = new ArrayList<>();
    private ArrayList<Firkanter> firkanter = new ArrayList<>();

    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
