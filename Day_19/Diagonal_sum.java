import java.util.Scanner;
public class Diagonal_sum {
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

    int primaryDiagonalSum = 0;
    int secondaryDiagonalSum = 0;

    for (int i = 0; i < r; i++) {
      primaryDiagonalSum += matrix[i][i];
      secondaryDiagonalSum += matrix[i][c - 1 - i];
    }

    System.out.println("The sum of the primary diagonal is : " + primaryDiagonalSum);
    System.out.println("The sum of the secondary diagonal is : " + secondaryDiagonalSum);
  }
}