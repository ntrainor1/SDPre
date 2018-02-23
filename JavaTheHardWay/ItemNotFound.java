import java.util.Scanner;

public class ItemNotFound {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {"Abderus", "Achilles", "Aeneas", "Ajax",
    "Bellerophon", "Daedalus", "Daedalus", "Diomedes", "Hector", "Jason",
    "Odysseus", "Orpheus", "Perseus", "Theseus"};
    String guess;
    boolean found;
    int num;

    System.out.println("Pop Quiz!");
    System.out.print("Name any *mortal* hero from Greek mythology: ");
    guess = keyboard.next();

    num = 0;
    found = false;
    
    for (String hero: heroes) {
      if (guess.equals(hero)) {
        System.out.println("That's one of them!");
        found = true;
        num++;
      }
    }

    System.out.println("That hero appears " + num + " times in the array!");


    if (found == false) {
      System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
    }
  }
}
