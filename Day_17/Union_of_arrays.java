import java.util.Scanner;
public class Union_of_arrays {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the first array : ");
    int n1 = input.nextInt();

    int[] arr1 = new int[n1];

    System.out.println("Enter the elements of the first array : ");
    for (int i = 0; i < n1; i++) {
      arr1[i] = input.nextInt();
    }

    System.out.print("Enter the size of the second array : ");
    int n2 = input.nextInt();

    int[] arr2 = new int[n2];

    System.out.println("Enter the elements of the second array : ");
    for (int i = 0; i < n2; i++) {
      arr2[i] = input.nextInt();
    }

    int[] unionArray = new int[n1 + n2];
    int k = 0;

    for (int i = 0; i < n1; i++) {
      unionArray[k++] = arr1[i];
    }

    for (int i = 0; i < n2; i++) {
      boolean isDuplicate = false;
      for (int j = 0; j < n1; j++) {
        if (arr2[i] == arr1[j]) {
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate) {
        unionArray[k++] = arr2[i];
      }
    }

    System.out.println("The union of the two arrays is : ");
    for (int i = 0; i < k; i++) {
      System.out.print(unionArray[i] + " ");
    }
  }
}