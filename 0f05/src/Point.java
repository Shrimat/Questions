public class Point {
  protected final int x;
  protected final int y;
  protected final int z;

  public Point(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double distance(Point p) {
    return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2) + Math.pow(z-p.z, 2));
  }

  public static Point origin() {
    return new Point(0,0,0);
  }

  public double magnitude() {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }
}
