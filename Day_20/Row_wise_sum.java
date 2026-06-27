import java.util.Scanner;

public class Row_wise_sum {
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

    System.out.println("Row-wise sums : ");
    for (int i = 0; i < r; i++) {
      int sum = 0;
      for (int j = 0; j < c; j++) {
        sum += matrix[i][j];
      }
      System.out.print(sum + " ");
    }
  }
}
