package no.hvl.dat100.tabeller.tabeller;

public class BLOM5 {

    public static int[] reverser(int[] tabell) {
        int lengde = tabell.length;
        int[] reversert = new int[lengde];

        for (int i = 0; i < lengde; i++) {
            reversert[i] = tabell[lengde - 1 - i];
        }

        return reversert;
    }

    // Eksempel på bruk
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] motsatt = reverser(original);

        System.out.print("Reversert tabell: ");
        for (int tall : motsatt) {
            System.out.print(tall + " ");
        }
    }
}

