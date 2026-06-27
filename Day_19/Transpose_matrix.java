import java.util.Scanner;
public class Transpose_matrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows : ");
    int r = input.nextInt();

    System.out.print("Enter the number of columns : ");
    int c = input.nextInt();

    int[][] matrix = new int[r][c];

    System.out.println("Enter the elements of the matrix : ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = input.nextInt();
      }
    }

    int[][] transpose = new int[c][r];

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }

    System.out.println("The transpose of the matrix is : ");
    for (int i = 0; i < c; i++) {
      for (int j = 0; j < r; j++) {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}