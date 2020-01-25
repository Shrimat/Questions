public class Ellipse extends Shape {
  private int major;
  private int minor;

  public Ellipse(int major, int minor) {
    this.major = major;
    this.minor = minor;
  }


  public int getMajor() {
    return major;
  }

  public void setMajor(int major) {
    this.major = major;
  }

  public int getMinor() {
    return minor;
  }

  public void setMinor(int minor) {
    this.minor = minor;
  }

  @Override
  public boolean isCircle() {
    return minor == major;
  }

  @Override
  public boolean isSquare() {
    return false;
  }
}
