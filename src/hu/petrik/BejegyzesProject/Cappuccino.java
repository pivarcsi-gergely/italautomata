package hu.petrik.BejegyzesProject;

public class Cappuccino extends Kave {

    private boolean tejszinhab;

    public Cappuccino(String nev, int homerseklet, int ar, boolean tej, boolean tejszinhab) {
        super(nev, homerseklet, ar, tej);
        this.tejszinhab = tejszinhab;
    }
}
