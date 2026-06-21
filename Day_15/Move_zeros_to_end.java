import java.util.Scanner;
public class Move_zeros_to_end {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        arr[count++] = arr[i];
      }
    }

    while (count < n) {
      arr[count++] = 0;
    }

    System.out.println("The array after moving zeros to the end is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}