package no.hvl.dat100.matriser.matriser;

public class BAUGE1 {

    public static String tilStreng(int[][] matrise) {
        String resultat = "";

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                resultat += matrise[i][j];


                if (j < matrise[i].length - 1) {
                    resultat += " ";
                }
            }
            resultat += "\n";
        }

        return resultat;
    }

    public static void main(String[] args) {
        int[][] matrise = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String streng = tilStreng(matrise);
        System.out.print(streng);
    }
}