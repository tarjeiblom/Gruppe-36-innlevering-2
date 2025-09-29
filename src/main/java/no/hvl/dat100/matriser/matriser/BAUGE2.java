package no.hvl.dat100.matriser.matriser;

public class BAUGE2 {
    public static int[][] skaler(int tall, int[][] matrise) {
        int rad = matrise.length;
        int lengde = matrise[0].length;

        int[][] nyMatrise = new int[rad][lengde];

        for (int i = 0; i < rad; i++) {
            for (int j = 0; j < lengde; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
    }


    public static void main(String[] args) {
        int[][] matrise = {
                {1,2,3},
                {4,5,6}
        };

        int[][] skalert = skaler(8, matrise);

        for (int[] ra : skalert) {
            for (int tall : ra) {
                System.out.print(tall + " ");
            }
        System.out.println();
        }


    }



}



