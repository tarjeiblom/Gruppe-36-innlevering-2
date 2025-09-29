package no.hvl.dat100.tabeller.tabeller;

public class BLOM3 {


    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] tab = {4, 7, 9, 10};
        boolean resultat = finnesTall(tab, 99);

        System.out.println(resultat);
    }
}
