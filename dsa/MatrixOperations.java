import java.util.Scanner;

public class MatrixOperations {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input for the first matrix
    System.out.println("Enter the number of rows for the matrices:");
    int rows = scanner.nextInt();
    System.out.println("Enter the number of columns for the matrices:");
    int columns = scanner.nextInt();

    int[][] matrix1 = new int[rows][columns];
    int[][] matrix2 = new int[rows][columns];

    System.out.println("Enter elements of the first matrix:");
    inputMatrix(matrix1, scanner);

    System.out.println("Enter elements of the second matrix:");
    inputMatrix(matrix2, scanner);

    // Add and display the result
    int[][] sumMatrix = addMatrices(matrix1, matrix2);
    System.out.println("Sum of the matrices:");
    displayMatrix(sumMatrix);

    // Subtract and display the result
    int[][] differenceMatrix = subtractMatrices(matrix1, matrix2);
    System.out.println("Difference of the matrices:");
    displayMatrix(differenceMatrix);

    int[][] multiplicationMatrix = multiplyMatrices(matrix1, matrix2);
    System.out.println("multiplication of the matrices:");
    displayMatrix(multiplicationMatrix);

    scanner.close();
  }

  // Function to input elements of a matrix
  private static void inputMatrix(int[][] matrix, Scanner scanner) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.println(
          "Enter element at position (" + (i + 1) + ", " + (j + 1) + "):"
        );
        matrix[i][j] = scanner.nextInt();
      }
    }
  }

  // Function to add two matrices
  private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
    int rows = matrix1.length;
    int columns = matrix1[0].length;
    int[][] resultMatrix = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    return resultMatrix;
  }

  // Function to subtract two matrices
  private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
    int rows = matrix1.length;
    int columns = matrix1[0].length;
    int[][] resultMatrix = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }

    return resultMatrix;
  }

  // Function to multiply two matrices
  private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
    int rows1 = matrix1.length;
    int columns1 = matrix1[0].length;
    int columns2 = matrix2[0].length;
    int[][] resultMatrix = new int[rows1][columns2];

    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < columns2; j++) {
        for (int k = 0; k < columns1; k++) {
          resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    return resultMatrix;
  }

  // Function to display a matrix
  private static void displayMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
