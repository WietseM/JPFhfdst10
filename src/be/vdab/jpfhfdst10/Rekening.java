package be.vdab.jpfhfdst10;

import java.util.Date;

public abstract class Rekening {
    private String rekeningNr;
    private double saldo;

    public Rekening(String rekeningNr) {
        setRekeningNr(rekeningNr);
    }

    public Rekening(String rekeningNr, double saldo) {
        this(rekeningNr);
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public String getRekeningNr() {
        return rekeningNr;
    }

    public final void setRekeningNr(String rekeningNr) {
        if (rekeningNr != null && !rekeningNr.isBlank()) {
            this.rekeningNr = rekeningNr;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void storten(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo += bedrag;
        }
    }

    public void afhalen(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
        }
    }

    public void overschrijven(Rekening rek, double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
            rek.storten(bedrag);
        }
    }

    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }

    public abstract double berekenIntrest();

    @Override
    public String toString(){
        return rekeningNr + ", " + saldo;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rekening rekening)){
            return false;
        }

        return rekeningNr.equals(rekening.getRekeningNr());
    }
}
