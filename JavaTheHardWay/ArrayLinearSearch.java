import java.util.Scanner;

public class ArrayLinearSearch {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828};
    int toFind;
    boolean numFound;

    System.out.print("There are " + orderNumbers.length + " orders in the database.");

    System.out.println(" Orders: ");
    for (int num: orderNumbers) {
      System.out.println("\t" + num + " ");
    }
    System.out.println();

    System.out.print("Which order to find? ");
    toFind = keyboard.nextInt();
    numFound = false;

    for (int num: orderNumbers) {
      if (toFind == num) {
        numFound = true;
      }
    }

    if (numFound == true) {
      System.out.println(toFind + " found.");
    }
    else {
      System.out.println(toFind + " not found.");
    }
  }
}
