package two_oop.interface_shape;

public interface Shape {
    double area();

    default double perimeter() {
        return 0;
    }
}
