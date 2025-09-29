package no.hvl.dat100.matriser.matriser;

public class BAUGE {
    public static void skrivUtv1(int[][] matrise) {
        for (int[] rad : matrise){
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    int[][] Matrise = {
            {1, 2, 3},
            {4, 6, 8},
            {1, 2, 3}
    };

    System.out.println("Matrisen vår ligner på: ");
    skrivUtv1(Matrise);
}
}