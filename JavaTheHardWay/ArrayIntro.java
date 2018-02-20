public class ArrayIntro {
  public static void main(String[] args) {
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    String[] friends = {"Beau", "Thomas", "Caleb", "Will", "Sarah"};

    for (String p: planets) {
      System.out.println(p + "\t" + p.toUpperCase());
    }

    System.out.println("");

    for (String f: friends) {
      System.out.print(f.toUpperCase() + "\t");
    }

    System.out.println("");
  }
}
