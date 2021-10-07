package hu.petrik.BejegyzesProject;

public class Forroital {

    private String nev;
    private int homerseklet;
    private int ar;

    public Forroital(String nev, int homerseklet, int ar) {
        this.nev = nev;
        this.homerseklet = homerseklet;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    public int getAr() {
        return ar;
    }


    public void arEmelFix (){
        this.ar+=10;
    }
    public void arEmelMegadott(int ar) {
        this.ar = ar;
    }

    public void arEmelRandom(){

    }

    @Override
    public String toString() {
        return String.format("%s néven, %d hőmérsékleten és %d áron", nev, homerseklet, ar);
    }
}
