import java.util.Scanner;
public class Merge_sorted_arrays { 
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the first array : ");
    int n1 = input.nextInt();

    int[] arr1 = new int[n1];

    System.out.println("Enter first sorted array : ");
    for (int i = 0; i < n1; i++) {
      arr1[i] = input.nextInt();
    }

    System.out.print("Enter the size of the second array : ");
    int n2 = input.nextInt();

    int[] arr2 = new int[n2];

    System.out.println("Enter second sorted array : ");
    for (int i = 0; i < n2; i++) {
      arr2[i] = input.nextInt();
    }

    int[] mergedArray = new int[n1 + n2];

    int i = 0, j = 0, k = 0; // i for arr1, j for arr2, k for mergedArray

    while (i < n1 && j < n2) { // continue until one of the arrays finishes
      if (arr1[i] <= arr2[j]) {
        mergedArray[k++] = arr1[i++];
      } else {
        mergedArray[k++] = arr2[j++];
      }
    }

    while (i < n1) { // if any elements left in arr1, add them to mergedArray
      mergedArray[k++] = arr1[i++];
    }

    while (j < n2) {
      mergedArray[k++] = arr2[j++];
    }

    System.out.println("The merged sorted array is : ");
    for (int m = 0; m < mergedArray.length; m++) {
      System.out.print(mergedArray[m] + " ");
    }
  }
}