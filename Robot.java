class Robot {

  String name;
  String color;
  int weight;

  Robot(String n, String c, int w) {
    this.name = n;
    this.color = c;
    this.weight = w;
  }

  void introduceSelf() {
    System.out.println("My name is " + this.name);
  }

}
