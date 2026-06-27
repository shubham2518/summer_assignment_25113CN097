import java.util.Arrays;
import java.util.Scanner;

public class Check_anagram_strings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter first string : ");
    String str1 = input.nextLine();

    System.out.print("Enter second string : ");
    String str2 = input.nextLine();

    if (str1.length() != str2.length()) {
      System.out.println("The strings are not anagrams.");
      return;
    }

    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    Arrays.sort(charArray1);  // Anagram strings means like "listen" == "silent"
    Arrays.sort(charArray2);

    if (Arrays.equals(charArray1, charArray2)) {
      System.out.println("The strings are anagrams.");
    } else {
      System.out.println("The strings are not anagrams.");
    }
  }
  
}
