public class Triangle {
    private Point p1,p2,p3;

    public Triangle(Point one, Point two, Point three) {
      p1 = one.copy();
      p2 = two.copy();
      p3 = three.copy();
      if (pointCheck()) {System.out.println("Triangle created");}
      else {System.out.println("not a triangle but I'm a silly constructor who can't say no");}
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
      p1 = new Point(x1,y1);
      p2 = new Point(x2,y2);
      p3 = new Point(x3,y3);
      if (pointCheck()) {System.out.println("Triangle created");}
      else {System.out.println("not a triangle but I'm a silly constructor who can't say no");}
    }

    public Point getVertex(int index) {
      if (index == 0) {return p1.copy();}
      else if (index == 1) {return p2.copy();}
      else {return p3.copy();}
    }

    public void setVertex(int index, Point newP) {
      if (index == 0) { p1 = newP;}
      else if (index == 1) { p2 = newP;}
      else { p3 = newP;}
    }

    public boolean pointCheck() {
      if (p1.distanceTo(p2) == 0 || p2.distanceTo(p3) == 0 || p1.distanceTo(p3) == 0) {return false;}
      else if(p1.getX() == p2.getX() && p2.getX() == p3.getX()) {return false;}
      else if(p1.getY() == p2.getY() && p2.getY() == p3.getY()) {return false;}
      else {return true;}
    }


    public double getPerimeter() {
      double sum = p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
      if (this.pointCheck()) {return sum;}
      else {
        System.out.print("This IS NOT a triangle GRR!");
        return 0.0;}
    }

    public String toString() {
      return "Triangle: A" + p1.toString() + " B" + p2.toString() + " C" + p3.toString();
    }
}
