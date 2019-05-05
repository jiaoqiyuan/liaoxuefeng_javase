package two_oop.interface_shape;

public class Rect implements Shape{
    private final double width;
    private final double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
