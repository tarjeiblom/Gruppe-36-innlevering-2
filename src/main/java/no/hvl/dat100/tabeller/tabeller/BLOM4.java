package no.hvl.dat100.tabeller.tabeller;

public class BLOM4 {
    public static int posisjonTall (int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {

            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        int tall = 4;

        int posisjon = posisjonTall(tab, tall);
        System.out.println("BLOM INVESTIGATION BUREAU " + tall + "fisk " + posisjon);
    }

}
