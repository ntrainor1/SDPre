public class Objective6Lab4 {
  public static void main(String[] args) {
    int sumTotal = 0, counter = 1, finalTotal = 0;

    while(counter < 20) {
      finalTotal = counter + sumTotal;
      sumTotal = finalTotal;
      counter++;
    }

    System.out.println(finalTotal);
  }
}
