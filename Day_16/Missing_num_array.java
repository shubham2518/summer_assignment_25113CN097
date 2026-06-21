import java.util.Scanner;
public class Missing_num_array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    int arrSum = 0;
    for (int i = 0; i < n; i++) {
      arrSum += arr[i];
    }
    int totalSum = (n + 1) * (n + 2) / 2;
    int missingNum = totalSum - arrSum;

    System.out.println("The missing number in the array is : " + missingNum);
   
  }
}