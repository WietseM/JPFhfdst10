package be.vdab.jpfhfdst10;

import be.vdab.jpfhfdst10.Spaarrekening;
import be.vdab.jpfhfdst10.Zichtrekening;

public class BankBediende {
    public static void main(String[] args) {
        System.out.println("Interestpercentage van de spaarrekening: " + Spaarrekening.getIntrest());

        var spaar = new Spaarrekening("BE12 3456 7890 1234", 1.5);
        var zicht = new Zichtrekening("BE98 7654 3210 9876", 1000);

        System.out.println("Interestpercentage van de spaarrekening: " + Spaarrekening.getIntrest());
        System.out.println("Maxkrediet van de zichtrekening is: " + zicht.getMaxKrediet());

        spaar.storten(600.0);
        zicht.storten(200.0);

        spaar.afhalen(25.0);
        System.out.println("Saldo van de spaarrekening: " + spaar.getSaldo());

        zicht.afhalen(50.0);
        System.out.println("Saldo van de zichtrekening: " + zicht.getSaldo());

        zicht.afhalen(2000);
        System.out.println("Saldo van de zichtrekening (na poging afhalen 2000): " + zicht.getSaldo());

        spaar.afhalen(600.0);
        System.out.println("Saldo van de spaarrekening (na poging afhalen 600): " + spaar.getSaldo());

        zicht.afhalen(1100);
        System.out.println("Saldo van de zichtrekening (na poging afhalen 1100): " + zicht.getSaldo());

        zicht.setMaxKrediet(2000);
        System.out.println("MaxKrediet van de zichtrekening is: " + zicht.getMaxKrediet());

        zicht.afhalen(900);
        System.out.println("Saldo van de zichtrekening (na poging afhalen 900): " + zicht.getSaldo());

        System.out.println(spaar);
        System.out.println(zicht);

        System.out.println("Intrest op spaarrekening: " + spaar.berekenIntrest());
        System.out.println("Intrest op zichtrekening: " + zicht.berekenIntrest());

        var rekeningen = new Rekening[4];
        rekeningen[0] = new Spaarrekening("BE11 2233 4455 6677", 1.5);
        rekeningen[1] = new Spaarrekening("BE99 8877 6655 4433", 1.5);
        rekeningen[2] = new Zichtrekening("BE19 2837 4655 6473", 2000);
        rekeningen[3] = new Zichtrekening("BE91 8273 6455 4637", 1500);

        rekeningen[0].storten(500.0);
        rekeningen[1].storten(550.0);
        rekeningen[1].afhalen(120.0);
        rekeningen[2].storten(200.0);
        rekeningen[2].afhalen(20.0);
        rekeningen[3].storten(300.0);

        var i = 0;

        for (var rekening : rekeningen){
            if(rekening != null){
                System.out.println("Saldo van de rekening: " +rekening.getSaldo());
            }
        }

        if (rekeningen[0] instanceof Spaarrekening spaarrek) {
            System.out.println(spaarrek);
        }

    }
}

