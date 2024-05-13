package Problem_5;

import java.util.Scanner;

public class Meter_to_Mile_Feet_Inch_Runner {
    public static void main(String[] args) {
        System.out.print("Enter Any Measurement in Meter : ");
        Scanner in = new Scanner(System.in);
        double m = in.nextDouble();

        Meter_to_Mile_Feet_Inch meter = new Meter_to_Mile_Feet_Inch(m);

        System.out.println(m + " meter = " + meter.convertTo_Mile() + " mile");
        System.out.println(m + " meter = " + meter.convertTo_Feet() + " feet");
        System.out.println(m + " meter = " + meter.convertTo_Inch() + " inch");
    }
}