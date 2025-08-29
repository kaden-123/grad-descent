package math;

public class Matrix {

    private static double[] getColumn(double[][] m, int n) {
        double[] column = new double[m.length];
        for(int i = 0; i < m.length; i++) column[i] = m[i][n];
        return column;
    }

    public static double dotMultiplication(double[] m1, double[] m2){
        if (m1.length != m2.length) {
            throw new IllegalArgumentException("Vectors are not matching in length!");
        }
        double sum = 0;
        for (int i = 0; i < m1.length; i++) sum =+ m1[i] * m2[i];
        return sum;
    }


    public static double[][] matrixMultiplication(double[][] m1, double[][] m2) {
        if (m1[0].length != m2.length ) throw new IllegalArgumentException("Invalid Matrix Sizes!");
        double[][] product = new double[m1.length][m2[0].length];
        for (int i = 0; i < product.length; i++) {
            for ( int j = 0; j < product[0].length; j++) {
                product[i][j] = dotMultiplication(m1[i], getColumn(m2, j)); //insert whatever here)
            }
        }
        return product;
    }


    

}