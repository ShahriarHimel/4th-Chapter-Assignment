package Problem_3;

import java.util.Scanner;

public class Two_Integer_Operation_Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int number1 = in.nextInt();
        System.out.print("Enter Second Number : ");
        int number2 = in.nextInt();

        Two_Integer_Operations TwoInt = new Two_Integer_Operations(number1, number2);
        System.out.println("Sum = " + TwoInt.getSum());
        System.out.println("Difference = " + TwoInt.getDifference());
        System.out.println("Product = " + TwoInt.getProduct());
        System.out.println("Average = " + TwoInt.getAverage());
        System.out.println("Distance = " + TwoInt.getDistance());
        System.out.println("Maximum = " + TwoInt.getMaximum());
        System.out.println("Minimum = " + TwoInt.getMinimum());
    }
}

