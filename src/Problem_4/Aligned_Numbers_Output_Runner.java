package Problem_4;

import java.util.Scanner;
public class Aligned_Numbers_Output_Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int number1 = in.nextInt();
        System.out.print("Enter Second Number : ");
        int number2 = in.nextInt();

        Aligned_Numbers_Output TwoInt = new Aligned_Numbers_Output(number1, number2);
        System.out.format("Sum : %12s", TwoInt.getSum() + "\n");
        System.out.format("Difference : %5s", TwoInt.getDifference() + "\n");
        System.out.format("Product : %8s", TwoInt.getProduct() + "\n");
        System.out.format("Average : %10s", TwoInt.getAverage() + "\n");
        System.out.format("Distance : %7s", TwoInt.getDistance() + "\n");
        System.out.format("Maximum : %8s", TwoInt.getMaximum() + "\n");
        System.out.format("Minimum : %8s", TwoInt.getMinimum() + "\n");
    }
}