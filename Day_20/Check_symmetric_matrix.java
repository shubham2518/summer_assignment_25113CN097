 import java.util.Scanner;
public class Check_symmetric_matrix {
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

    boolean isSymmetric = true;

    if (r != c) {
      isSymmetric = false;
    } else {
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          if (matrix[i][j] != matrix[j][i]) {
            isSymmetric = false;
            break;
          }
        }
        if (!isSymmetric) {
          break;
        }
      }
    }

    if (isSymmetric) {
      System.out.println("The matrix is symmetric.");
    } else {
      System.out.println("The matrix is not symmetric.");
    }
  }
  
}
