package hu.petrik.BejegyzesProject;

public class Cappuccino extends Kave {

    private boolean tejszinhab;

    public Cappuccino(String nev, int homerseklet, int ar, boolean tej, boolean tejszinhab) {
        super(nev, homerseklet, ar, tej);
        this.tejszinhab = tejszinhab;
    }

    @Override
    public String toString() {
        String s = super.toString();
        if (tejszinhab == true){
            s = s.replace(super.toString().substring(0, 5), "Cappuccino, ") + "hozzáadott tejszínhabbal.";
        }
        else{
            s = s.replace(super.toString().substring(0, 5), "Cappuccino, ");
        }

        return s;
    }
}
