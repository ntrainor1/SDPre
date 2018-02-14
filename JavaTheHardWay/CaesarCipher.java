import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {
  public static char shiftLetter(char c, int n) {
    int u = c;

    if(!Character.isLetter(c))
      return c;

    u = u + n;
    if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z') {
      u -= 26;
    }
    if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a') {
      u += 26;
    }

    return (char)u;
  }

  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in), fileIn = new Scanner(new File("message.txt"));
    String cipher = "", plainText = fileIn.nextLine(), saveCaesarMessage = "message.txt";
    int shift;

    System.out.print("Shift (0-26): ");
    shift = keyboard.nextInt();

    for (int i = 0; i < plainText.length(); i++) {
      cipher += shiftLetter(plainText.charAt(i), shift);
    }

    // Updates message.txt into Caesar.
    File f = new File(saveCaesarMessage);
    PrintWriter out = new PrintWriter(f);
      out.println(cipher);
    out.close();
  }
}
