package Problem_2;

import java.util.Scanner;
public class Square_Cube_Fourth_Runner {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");

        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        Square_Cube_Fourth scf = new Square_Cube_Fourth(n);

        System.out.println("Square of this number = " + scf.getSquare());
        System.out.println("Cube of this number = " + scf.getCube());
        System.out.println("Fourth Power of this number = " + scf.getFourthPower());
    }
}