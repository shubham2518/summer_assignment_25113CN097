import java.util.Scanner;
public class Compress_string {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the string : ");
    String str = input.nextLine();

    StringBuilder compressed = new StringBuilder();
    int count = 1;

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(i - 1)) {
        count++;
      } else {
        compressed.append(str.charAt(i - 1));
        compressed.append(count);
        count = 1;
      }
    }
    // Append the last character and its count
    compressed.append(str.charAt(str.length() - 1));  
    compressed.append(count);
    System.out.println("The compressed string is : " + compressed.toString()); 
  }
}