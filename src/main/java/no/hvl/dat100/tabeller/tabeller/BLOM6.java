package no.hvl.dat100.tabeller.tabeller;

public class BLOM6 {
    public static boolean erSortert(int[] tabell) {

        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] sorterTabell = {1,2,3,4,5,6};
        int[] usortertTabell = {2,4,3,1,6,5};

        System.out.println(erSortert(sorterTabell));
        System.out.println(erSortert(usortertTabell));

    }



}
