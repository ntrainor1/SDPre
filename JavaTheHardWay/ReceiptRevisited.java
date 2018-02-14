import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    double gallons, price;

    System.out.println("How many gallons would you like to purchase today? ");
    gallons = keyboard.nextDouble();

    price = gallons*2.24;

    PrintWriter fileout = new PrintWriter("receipt.txt");

    fileout.println( "+-----------------------------------------+" );
    fileout.println( "|                                         |" );
    fileout.println( "|               CORNER STORE              |" );
    fileout.println( "|                2018-03-29               |" );
    fileout.println( "|               Gallons " + gallons + "              |" );
    fileout.println( "|            Price/gallon: $2.24          |" );
    fileout.println( "|      Fuel total: " + price + "     |" );
    fileout.println( "|                                         |" );
    fileout.println( "+-----------------------------------------+" );
    fileout.close();

  }
}
