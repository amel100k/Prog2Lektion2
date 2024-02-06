package Opgave01.Storage;

import Opgave01.Cirkel;
import Opgave01.Rektangel;

public class Test {
    public static void main(String[] args) {
        initStorage();
    }
    public static Storage initStorage(){
        Storage storage = new Storage();
        Cirkel cirkel = new Cirkel(20,20,5);
        System.out.println("cirkel.areal() = " + cirkel.areal());
        cirkel.doubleUp();
        System.out.println("cirkel.areal() = " + cirkel.areal());

        Rektangel rektangel = new Rektangel(20,20,7,5);
        System.out.println("rektangel.areal() = " + rektangel.areal());
        rektangel.doubleUp();
        System.out.println("rektangel.areal() = " + rektangel.areal());
        rektangel.halve();
        System.out.println("rektangel.areal() = " + rektangel.areal());


        return storage;
    }
}
