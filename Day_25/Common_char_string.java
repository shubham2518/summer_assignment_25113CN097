import java.util.Scanner;

public class Common_char_string {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first string : ");
    String str1 = input.nextLine();

    System.out.print("Enter the second string : ");
    String str2 = input.nextLine();

    StringBuilder commonChars = new StringBuilder();
    for (int i = 0; i < str1.length(); i++) {
      char c = str1.charAt(i);
      if (str2.indexOf(c) != -1 && commonChars.indexOf(String.valueOf(c)) == -1) {
        commonChars.append(c);
      }
    }

    System.out.println("Common characters in both strings : " + commonChars.toString());
  }
  
}
