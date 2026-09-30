/** is a rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * constructor.
   *
   * @param w width
   * @param h height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * returns rectangle area.
   *
   * @return area
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the factor to multiply by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * calculates if area is larger than other area.
   *
   * @param other area of rectangle
   * @return bool
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
