package no.hvl.dat100.matriser.matriser;

public class BAUGE3 {
    public static boolean erLik(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) {
            return false;
        }

        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) {
                return false;
            }

            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] matA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matB = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matC = {
                {1, 2, 3},
                {7, 8, 9}
        };

        System.out.println(erLik(matA, matC));
        System.out.println(erLik(matA, matB));
    }

}
