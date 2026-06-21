import java.util.Scanner;

public class Reverse_an_array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    System.out.println("The original array is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("\nThe reversed array is : ");
    for (int i = n - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
  
}
