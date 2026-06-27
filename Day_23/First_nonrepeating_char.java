import java.util.Scanner;
public class First_nonrepeating_char {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      
      if(str.indexOf(c) == str.lastIndexOf(c)) {
        System.out.print("First non-repeating character is : " + c);
        return;
      }
    }
    System.out.print("No non-repeating character found.");
  }
}