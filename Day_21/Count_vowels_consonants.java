import java.util.Scanner;

public class Count_vowels_consonants {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");
    String str = input.nextLine();

    int vowels = 0, consonants = 0;

    for (char c : str.toLowerCase().toCharArray()) {
      if (c >= 'a' && c <= 'z') {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          vowels++;
        } else {
          consonants++;
        }
      }
    }

    System.out.println("Number of vowels : " + vowels);
    System.out.println("Number of consonants : " + consonants);
  }
}
