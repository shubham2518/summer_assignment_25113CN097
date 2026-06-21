import java.util.Scanner;

public class Rotate_array_Right {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    System.out.print("Enter the number of rotations : ");
    int d = input.nextInt();

    System.out.println("The original array is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    for (int i = 0; i < d; i++) {
      int last = arr[n - 1];
      for (int j = n - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = last;
    }

    System.out.println("\nThe rotated array is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
}