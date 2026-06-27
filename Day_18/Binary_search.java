import java.util.Scanner;
public class Binary_search {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array in sorted order : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    System.out.print("Enter the element to be searched : ");
    int key = input.nextInt();

    int left = 0;
    int right = n - 1;
    int found = 0;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] == key) {
        found = 1;
        break;
      } else if (arr[mid] < key) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    if (found == 1) {
      System.out.println("Element " + key + " is present in the array.");
    } else {
      System.out.println("Element " + key + " is not present in the array.");
    }
  }
}