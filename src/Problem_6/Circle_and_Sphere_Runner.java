package Problem_6;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Circle_and_Sphere_Runner {
    public static void main(String[] args) {
        System.out.print("Enter Radius : ");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();

        Circle_and_Sphere cs = new Circle_and_Sphere(r);

        System.out.println("Area of Circle : " + cs.getArea());
        System.out.println("Circumference of Circle : " + cs.getCircumference() + "\n");
        System.out.println("Volume of Sphere : " + cs.getVolume());
        System.out.println("Surface of Sphere : " + cs.getSurface());
    }
}