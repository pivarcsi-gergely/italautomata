package hu.petrik.BejegyzesProject;

public class Tea extends Forroital {

    private boolean citrom;

    public Tea(String nev, int homerseklet, int ar, boolean citrom) {
        super(nev, homerseklet, ar);
        this.citrom = citrom;
    }

    @Override
    public String toString() {
        if (citrom == true){
            return "Tea, " + super.toString() + ", hozzáadott citrommal";
        }
        else {
            return "Tea, " + super.toString() + ", hozzáadott citrom nélkül";
        }
    }
}
