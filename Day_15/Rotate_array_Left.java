import java.util.Scanner;

public class Rotate_array_Left {
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
      int first = arr[0];
      for (int j = 0; j < n - 1; j++) {
        arr[j] = arr[j + 1];
      }
      arr[n - 1] = first;
    }

    System.out.println("\nThe rotated array is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
}
