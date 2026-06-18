import java.util.Scanner;

public class Avg_of_array {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }

    double average = (double) sum / n;  // double is used to get a more accurate average with decimal points
    System.out.println("The average of the array is : " + average);
  }
}