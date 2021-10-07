package hu.petrik.BejegyzesProject;

import java.util.Random;

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

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void arEmelFix (){
        this.ar+=10;
    }
    public void arEmelMegadott(int ar) {
        this.ar+=ar;
    }

    public void arEmelRandom(){

        Random r = new Random();
        int randomSzam = r.nextInt(20)+1;
        ar+=randomSzam;
    }

    @Override
    public String toString() {
        return String.format("%s néven, %d Celsius fok hőmérsékleten és %d áron", nev, homerseklet, ar);
    }
}
