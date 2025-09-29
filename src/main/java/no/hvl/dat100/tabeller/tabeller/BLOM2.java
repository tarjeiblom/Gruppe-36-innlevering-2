package no.hvl.dat100.tabeller.tabeller;

public class BLOM2 {


    public static void Summer (int[] tabell) {

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
        int sum = 0;
        sum = tab[0]+tab[1]+tab[2]+tab[3];
        System.out.println("Summen er: " + sum);


        Summer(tab);
    }




}
