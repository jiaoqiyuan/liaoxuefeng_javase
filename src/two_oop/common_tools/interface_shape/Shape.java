package two_oop.common_tools.interface_shape;

public interface Shape {
    double area();

    default double perimeter() {
        return 0;
    }
}
