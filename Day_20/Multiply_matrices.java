import java.util.Scanner;
public class Multiply_matrices {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows for the 1st matrix : ");
    int r1 = input.nextInt();

    System.out.print("Enter the number of columns for the 1st matrix : ");
    int c1 = input.nextInt();

    System.out.print("Enter the number of rows for the 2nd matrix : ");
    int r2 = input.nextInt();

    System.out.print("Enter the number of columns for the 2nd matrix : ");
    int c2 = input.nextInt();

    if (c1 != r2) {
      System.out.println("Matrix multiplication is not possible.");
      return;
    }

    int[][] matrix1 = new int[r1][c1];
    int[][] matrix2 = new int[r2][c2];
    int[][] result = new int[r1][c2];

    System.out.println("Enter the elements of the first matrix : ");
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        matrix1[i][j] = input.nextInt();
      }
    }

    System.out.println("Enter the elements of the second matrix : ");
    for (int i = 0; i < r2; i++) {
      for (int j = 0; j < c2; j++) {
        matrix2[i][j] = input.nextInt();
      }
    }

    // Matrix multiplication
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        for (int k = 0; k < c1; k++) {
          result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    System.out.println("The result of matrix multiplication is : ");
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}