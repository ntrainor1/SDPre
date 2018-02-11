import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int userNum;

      System.out.println("Please give me a number: ");
      userNum = keyboard.nextInt();

      if (userNum % 2 == 0) {
        System.out.println(userNum + " is even.");
      }
      else {
        System.out.println(userNum + " is odd.");
      }
    }
}
