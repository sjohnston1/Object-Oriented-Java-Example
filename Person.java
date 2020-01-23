public class Person {

  String name;
  String personality;
  Boolean isSitting;
  Robot robotOwned;

  Person(String n, String p, Boolean s) {
    this.name = n;
    this.personality = p;
    this.isSitting = s;
    this.robotOwned = null;
  }

  Person(String n, String p, Boolean s, Robot r) {
    this.name = n;
    this.personality = p;
    this.isSitting = s;
    this.robotOwned = r;
  }

  void sitDown() {
    this.isSitting = true;
  }

  void standUp() {
    this.isSitting = false;
  }

}
