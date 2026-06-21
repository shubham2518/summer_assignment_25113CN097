import java.util.Scanner;

public class Column_wise_sum {
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

    System.out.println("Column-wise sums : ");
    for (int j = 0; j < c; j++) {
      int sum = 0;
      for (int i = 0; i < r; i++) {
        sum += matrix[i][j];
      }
      System.out.print(sum + " ");
    }
  }
  
}
