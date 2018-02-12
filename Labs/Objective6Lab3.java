public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 0, divide;

    while (counter <= 20) {
      divide = counter%2;
      if (divide == 0) {
        System.out.println(counter + " is even.");
      }
      else {
        System.out.println(counter + " is odd.");
      }
      counter++;
    }
  }
}
