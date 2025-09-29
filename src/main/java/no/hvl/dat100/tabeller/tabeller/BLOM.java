package no.hvl.dat100.tabeller.tabeller;

public class BLOM {

    public static void skrivUt (int[] tabell) {

        System.out.println("Skriv ut:");
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);

            if (i < tabell.length - 1) {
                System.out.print(", ");
            }
        }

    }


    public static void main(String[] args) {
    int[] tab = {1, 2, 3, 4};
    skrivUt(tab);
    }




}
