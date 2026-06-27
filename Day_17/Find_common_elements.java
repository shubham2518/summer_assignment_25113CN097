import java.util.Scanner;

public class Find_common_elements {
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

    System.out.println("The common elements in both arrays are : ");
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < n2; j++) {
        if (arr1[i] == arr2[j]) {
          System.out.print(arr1[i] + " ");
          break;
        }
      }
    }
  }
  
}
