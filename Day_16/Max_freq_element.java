import java.util.Scanner;
public class Max_freq_element {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the array : ");
    int n = input.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    int maxCount = 0;
    int maxElement = arr[0];

    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        maxElement = arr[i];
      }
    }

    System.out.println("The maximum frequency element in the array is : " + maxElement);
  }
  
}
