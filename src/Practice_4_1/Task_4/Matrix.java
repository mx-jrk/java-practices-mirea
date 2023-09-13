package Practice_4_1.Task_4;

public class Matrix {
    private final int lines;

    private final int columns;

    private final double[][] matrix;

    public Matrix(int lines, int columns, double[][] matrix) {
        this.lines = lines;
        this.columns = columns;
        this.matrix = matrix;
    }

    public double[][] sumWithMatrix(Matrix matrix){
        if (matrix.columns != this.columns || matrix.lines != this.lines) return new double[0][0];

        double[][] resultMatrix = new double[this.lines][this.columns];
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++){
                resultMatrix[i][j] = matrix.matrix[i][j] + this.matrix[i][j];
            }
        }
        return resultMatrix;
    }

    public double[][] multiplicationWithNumber(double number){
        double[][] resultMatrix = new double[this.lines][this.columns];

        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++){
                resultMatrix[i][j] = this.matrix[i][j] * number;
            }
        }

        return resultMatrix;
    }

    public void printMatrix(){
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++){
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix mainMatrix = new Matrix(3, 3,  new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix secondMatrix = new Matrix(3, 3,  new double[][]{{0.1, 0.2, 0.3}, {0.4, 0.5, 0.6}, {0.7, 0.8, 0.9}});

        Matrix sumMatrix = new Matrix(3, 3, mainMatrix.sumWithMatrix(secondMatrix));
        sumMatrix.printMatrix();

        System.out.println();

        Matrix multiplicationMatrix = new Matrix(3, 3, mainMatrix.multiplicationWithNumber(2));
        multiplicationMatrix.printMatrix();

    }


}
