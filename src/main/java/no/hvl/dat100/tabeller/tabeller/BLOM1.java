package no.hvl.dat100.tabeller.tabeller;

public class BLOM1 {

    public static String tilStreng(int[] tabell) {
        String resultat = "[";

        for (int i = 0; i < tabell.length; i++) {
            resultat += tabell[i];


            if (i < tabell.length - 1) {
                resultat += ",";
            }
        }

        resultat += "]";

        return resultat;
    }


    public static void main(String[] args) {
        int[] tab = {42, 67, 89};
        String streng = tilStreng(tab);
        System.out.println(streng);
    }
}
