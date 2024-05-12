package Problem_2;

public class Square_Cube_Fourth {
    public double number;
    public Square_Cube_Fourth(double n) {
        number = n;
    }
    public double getSquare() {
        return number * number;
    }
    public double getCube() {
        return number * number * number;
    }
    public double getFourthPower() {
        return Math.pow(Math.pow(number, 2), 2);
    }
}