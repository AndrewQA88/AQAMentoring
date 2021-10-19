package exercises;

public class MultipleMatrix {

    public static void main(String[] args) {

        int[][] a = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};

        int[][] b = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};

        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);
        int[][] c = multiplicationMatrix(a, b);
        System.out.println("Multiplication result");
        printMatrix(c);

    }

    public static int[][] multiplicationMatrix(int[][] a, int[][] b) {
        int[][] multiplicationResultMatrix = new int[a.length][b[0].length];
        for (int row = 0; row < multiplicationResultMatrix.length; row++) {
            for (int col = 0; col < multiplicationResultMatrix[row].length; col++) {
                multiplicationResultMatrix[row][col] = multiplyMatricesCell(a, b, row, col);
            }
        }
        return multiplicationResultMatrix;
    }

    static int multiplyMatricesCell(int[][] a, int[][] b, int row, int col) {
        int cell = 0;
        for (int i = 0; i < b.length; i++) {
            cell += a[row][i] * b[i][col];
        }
        return cell;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}


