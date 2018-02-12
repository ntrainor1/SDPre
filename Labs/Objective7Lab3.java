import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    String favoriteFoods = "Lasagna, Pot Roast, Caesar Salad";

    while(true){

      printMenu();
      selection = scanner.nextInt();

      if (selection == 1) {
        System.out.println("Hello, World!");
      }
      else if (selection == 2) {
        System.out.println(favoriteFoods);
      }
      else {
        System.out.println("Thanks for playing with me!");
      }
      
      break;

    }

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

}
