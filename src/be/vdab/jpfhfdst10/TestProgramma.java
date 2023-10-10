package be.vdab.jpfhfdst10;

public class TestProgramma {
    public static void main(String[] args) {


        var voertuigen = new Voertuig [3];
        voertuigen[0] = new Personenwagen("Simon de Pauw", 15000F, 95, 5.06F, "IK-BEN-GAY", 4, 4);
        voertuigen[1] = new Vrachtwagen("Glen Meel", 10000F, 460, 30.5F, "IK-BEN-GAYER", 15000F);
        voertuigen[2] = new Personenwagen("Wietse Mees", 250000F, 1109, 20.0F, "IK-BEN-COOL", 2, 3);

        System.out.println("\n--- toString()---");
        for (var voertuig : voertuigen){
            if (voertuig != null){
                System.out.println(voertuig);
            }
        }

        System.out.println("\n--- method toon() ---");
        for (var voertuig : voertuigen){
            if (voertuig != null){
                voertuig.toon();
                System.out.println("Kyotoscore: " + voertuig.getKyotoScore());
            }
        }
    }
}
