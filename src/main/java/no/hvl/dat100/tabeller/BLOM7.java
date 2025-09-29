package no.hvl.dat100.tabeller;

public class BLOM7 {
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] nyTabell = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
            nyTabell[i] = tabell1[i];
        }

        for (int i = 0; i < tabell2.length; i++) {
            nyTabell[tabell1.length + i] = tabell2[i];
        }
        return nyTabell;
    }








    public static void main(String[] args) {
        int[] tabell1 = {1,2,3};
        int[] tabell2 = {4,5};
        int[] resultat = settSammen(tabell1, tabell2);

        System.out.print("[");
        for (int i = 0; i < resultat.length; i++) {
            System.out.print(resultat[i]);
            if (i < resultat.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
