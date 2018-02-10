public class Objective2Lab5 {
    public static void main(String[] args){
      double side1, side2, hypotenuse;

      side1 = 3;
      side2 = 4;
      hypotenuse = Math.sqrt((side1*side1) + (side2*side2));

      System.out.println("The hypotenuse of a triangle with one side of " + side1 + " and another side of " + side2 + " is " + hypotenuse + ".");
  }
}
