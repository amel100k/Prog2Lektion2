package Opgave01.Storage;

import Opgave01.Firkanter;
import Opgave01.Rund;

import java.util.ArrayList;

public class Storage {
    public static ArrayList<Firkanter> alleFirkanter = new ArrayList<>();
    public static ArrayList<Rund> alleCirkler = new ArrayList<>();
    public static void addFirkant(Firkanter firkant){
        alleFirkanter.add(firkant);
    }
    public static void addCirkel(Rund cirkel){
        alleCirkler.add(cirkel);
    }
}
