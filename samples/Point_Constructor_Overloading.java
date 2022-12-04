class Point {
  int x;
  int y;

  public Point(int x,int y) {
    setX(x);
    setY(y);
  }
  
  public Point(int x) {
    setX(x);
    setY(100);  // Since y value is not passes, i am hardcoding y value to 100. this is optional
  }
  
  public Point() {
      super();
  }
  
  public static void main(String[] args) {
    Point point1 = new Point();
    Point point2 = new Point(50);
    Point point3 = new Point(2,4);
    point1.printMethod();
    point2.printMethod();
    point3.printMethod();
  }

  public void printMethod() {
    System.out.println("The point x="+x+" y="+y);
  }
  
  void setX(int x) {
    this.x=x;
  }

  void setY(int y) {
    this.y=y;
  }
  int getX() {
    return this.x;
  }

  int getY() {
    return this.y;
  }
}


