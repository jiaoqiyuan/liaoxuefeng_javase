package two_oop.interface_shape;

public class ShapUtil {

    public double sum(Shape[] shapes) {
        double s = 0;
        for (Shape shape : shapes) {
            s += shape.area();
        }
        return s;
    }

    public boolean isGreaterThan(Shape shape1, Shape shape2) {
        return shape1.area() > shape2.area();
    }

    public boolean isLessThan(Shape shape1, Shape shape2) {
        return shape1.area() < shape2.area();
    }

}
