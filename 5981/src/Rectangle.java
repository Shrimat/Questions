public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.height = height;
    this.width = width;
  }

  @Override
  public boolean isSquare() {
    return width == height;
  }

  @Override
  public boolean isCircle() {
    return false;
  }
}
