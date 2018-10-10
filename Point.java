public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public Point copy() {
    return new Point(this);
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other) {
    double d;
    double xDiff = other.x - this.x;
    double yDiff = other.y - this.y;
    d = Math.sqrt((xDiff * xDiff) +  (yDiff * yDiff));
    return d;
    }

  public double distance(Point p1, Point p2) {
    double d;
    double xDiff = p2.x - p1.x;
    double yDiff = p2.y - p1.y;
    d = Math.sqrt((xDiff * xDiff) +  (yDiff * yDiff));
    return d;
  }

  public String toString() {
    return "" + this + "(" + this.x + "," + this.y + ")";
  }
}
