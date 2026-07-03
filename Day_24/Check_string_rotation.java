import java.util.Scanner;
public class Check_string_rotation {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first string : ");
    String str1 = input.nextLine();

    System.out.print("Enter the second string : ");
    String str2 = input.nextLine();

    if (str1.length() != str2.length()) {
      System.out.println("Not Rotation");
    }
      else {
        String temp = str1 + str1;
        if (temp.contains(str2)) {
          System.out.println("Rotation");
        } else {
          System.out.println("Not Rotation");
        }
      }
  }
}