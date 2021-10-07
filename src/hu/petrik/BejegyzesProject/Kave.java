package hu.petrik.BejegyzesProject;

public class Kave extends Forroital {

    private boolean tej;

    public Kave(String nev, int homerseklet, int ar, boolean tej) {
        super(nev, homerseklet, ar);
        this.tej = tej;
    }

    @Override
    public String toString() {

        if (tej){
         return "Kávé, " +  super.toString() + ", hozzáadott tejjel";
        }
        else {
            return "Kávé, " +  super.toString() + ", hozzáadott tej nélkül";
        }
    }
}
