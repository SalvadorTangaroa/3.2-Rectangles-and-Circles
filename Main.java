public class Rectangle {
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;

    // Default constructor
    public Rectangle() {
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
    }

    // Parameterized constructor
    public Rectangle(double x, double y, double width, double height) {
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }

    public double getPerimeter() {
        return 2 * (myWidth + myHeight);
    }

    public double getArea() {
        return myWidth * myHeight;
    }

    Rectangle rectA = new Rectangle();
    Rectangle rectB = new Rectangle(0, -80, 400, 160);
    Rectangle rectC = new Rectangle(100, -100, 20, 300);
}
