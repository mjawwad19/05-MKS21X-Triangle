public class Driver {
  public static void main(String[] args) {
    Point a = new Point(0,0);
    Point b = new Point(0,4);
    Point c = new Point(3,0);
    Point d = new Point(0,0);
    Point e = new Point(1,4);
    Point f = new Point(0,5);

    //Triangle abc = new Triangle (a,b,c);
    Triangle abc = new Triangle (0,0,0,4,3,0);
    Triangle bcd = new Triangle (b,c,d);
    Triangle cde = new Triangle (c,d,e);
    Triangle dea = new Triangle (d,e,a);
    Triangle abf = new Triangle (a,b,f);

    /*System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    System.out.println(abc);
    System.out.println(bcd);
    System.out.println(cde);
    System.out.println(dea);
    System.out.println(abf);

    System.out.println(abc.getVertex(0));
    System.out.println(abc.getVertex(1));
    System.out.println(abc.getVertex(2));

    abc.setVertex(0,b);
    System.out.println(abc.getVertex(0));
    System.out.println(abc);*/

    System.out.println(a.distanceTo(b)); //4
    System.out.println(a.distanceTo(c)); //3
    System.out.println(a.distanceTo(d)); //0.0
    System.out.println(a.distanceTo(e)); // 4.123 ish sqr rt 17

    System.out.println(abc.getPerimeter()); //12
    System.out.println(bcd.getPerimeter()); //12
    System.out.println(cde.getPerimeter()); //something like 11 ish
    System.out.println(dea.getPerimeter()); //This is not a triangle! 0.0
    System.out.println(abf.getPerimeter());//This is not a triangle! 0.0
  }
}
