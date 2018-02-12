import java.util.Scanner;

public class CoinFlip {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again = "y";
    int streak = 0;
    boolean gotHeads;

    do {
      gotHeads = Math.random() < 0.5;

      if (gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

        System.out.println("You flip a coin and it is . . .      " + coin);

      if (gotHeads) {
        streak++;
        System.out.println("\tThat's " + streak + " times in a row.");
        System.out.println("Would you like to try again? (Y/N) ");
        again = keyboard.next();
      }
      else {
        System.out.println("\tYou lose everything!");
        System.out.println("You should have pulled out while you were ahead!");
        streak = 0;
        again = "n";
      }
    } while (again.equalsIgnoreCase("y"));
    System.out.println("Final score: " + streak);
  }
}
