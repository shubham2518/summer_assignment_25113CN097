import java.util.Scanner;
public class sort_names_alphabetically {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of names : ");
    int n = input.nextInt();
    input.nextLine(); // Consume the newline character

    String[] names = new String[n];

    System.out.println("Enter the names : ");
    for (int i = 0; i < n; i++) {
      names[i] = input.nextLine();
    }

    // Sort the names alphabetically
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (names[j].compareTo(names[j + 1]) > 0) {
          
          // Swap names[j] and names[j + 1]
          String temp = names[j];
          names[j] = names[j + 1];
          names[j + 1] = temp;
        }
      }
    }

    System.out.println("The names in alphabetical order are : ");
    for (int i = 0; i < n; i++) {
      System.out.println(names[i]);
    }
  }
}