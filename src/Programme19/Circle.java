package Programme19;

public class Circle {

    double radius;

    public Circle(double radius) {
        if (this.radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}
