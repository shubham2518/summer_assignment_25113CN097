import java.util.Scanner;

public class Frequency_of_element {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    System.out.print("Enter the element to find its frequency : ");
    int key = input.nextInt();

    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == key) {
        count++;
      }
    }

    System.out.println("The frequency of " + key + " is : " + count);
  } 
}
