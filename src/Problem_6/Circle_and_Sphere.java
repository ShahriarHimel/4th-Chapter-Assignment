package Problem_6;

public class Circle_and_Sphere {
    public double radius;

    public Circle_and_Sphere(double r) {
        radius = r;
    }
    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }
    public double getCircumference() {
        return 2 * 3.14 * radius;
    }
    public double getVolume() {
        return (4.0/3) * 3.14 * Math.pow(radius, 3);
    }
    public double getSurface() {
        return 4 * 3.14 * Math.pow(radius, 2);
    }
}