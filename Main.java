public class Main {
  public static void main(String[] args) {

    Robot r1 = new Robot("Tom", "red", 30);
    Robot r2 = new Robot("Jerry", "blue", 40);
    Robot r3 = new Robot("Jack", "green", 50);

    r1.introduceSelf();
    r2.introduceSelf();
    r3.introduceSelf();

    Person p1 = new Person("Alice", "aggressive", false);
    Person p2 = new Person("Becky", "talkative", true);
    Person p3 = new Person("Catherine", "happy", true, r3);

    p1.robotOwned = r2;
    p2.robotOwned = r1;

    p1.robotOwned.introduceSelf();
    p2.robotOwned.introduceSelf();
    p3.robotOwned.introduceSelf();
  }
}
