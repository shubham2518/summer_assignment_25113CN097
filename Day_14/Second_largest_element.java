import java.util.Scanner;

public class Second_largest_element {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    int largest = arr[0];
    int secondLargest = arr[0];

    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }

      System.out.println("The largest element in the array is : " + largest);
    
      System.out.println("The second largest element in the array is : " + secondLargest);
  }
}