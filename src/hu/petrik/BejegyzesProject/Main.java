package hu.petrik.BejegyzesProject;

public class Main {

    public static void main(String[] args) {


        Kave kave1 = new Kave("KKKKávé", 69, 150, true);
        Kave kave2 = new Kave("Espresso what else", 56, 200, false);
        Tea tea1 = new Tea("Nestea", 49, 170, true);
        Tea tea2 = new Tea("Lipton Ice Tea", 10, 130, false);
        Cappuccino cappuccino1 = new Cappuccino("Nestle-s Cappuccino", 60, 210, true, true);
        Cappuccino cappuccino2 = new Cappuccino("eros", 70, 175, false, false);

        System.out.println(tea1);
        System.out.println(kave1);
        System.out.println(cappuccino1 + "\n");

        tea1.arEmelFix();
        kave1.arEmelMegadott(30);
        cappuccino1.arEmelRandom();

        System.out.println(tea1);
        System.out.println(kave1);
        System.out.println(cappuccino1);

    }
}
