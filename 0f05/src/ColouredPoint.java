public class ColouredPoint extends Point{
  private Colour colour;

  public ColouredPoint(int x, int y, int z, Colour colour) {
    super(x, y, z);
    this.colour = colour;
  }

  @Override
  public String toString() {
    return super.toString()
            + "\nColour: " + colour;
  }

}
