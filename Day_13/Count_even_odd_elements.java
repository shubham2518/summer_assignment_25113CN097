import java.util.Scanner;

public class Count_even_odd_elements {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    int evenCount = 0;
    int oddCount = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }

    System.out.println("The number of even elements in the array is : " + evenCount);
    System.out.println("The number of odd elements in the array is : " + oddCount);
  }
}