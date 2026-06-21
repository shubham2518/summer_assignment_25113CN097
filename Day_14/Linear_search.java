import java.util.Scanner;

public class Linear_search {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    System.out.print("Enter the element to search : ");
    int key = input.nextInt();

    int found = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == key) {
        found = 1;
        break;
      }
    }

    if (found == 1) {
      System.out.println(key + " is present in the array.");
    } else {
      System.out.println(key + " is not present in the array.");
    }
  }
}