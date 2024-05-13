package Problem_3;

public class Two_Integer_Operations {
    public int firstNumber,secondNumber,sum,difference;

    public Two_Integer_Operations(int number1, int number2) {
        firstNumber = number1;
        secondNumber = number2;
    }
    public int getSum() {
        sum = firstNumber + secondNumber;
        return sum;
    }
    public int getDifference() {
        difference = firstNumber - secondNumber;
        return difference;
    }
    public int getProduct() {
        return firstNumber * secondNumber;
    }
    public double getAverage() {
        return sum/2.0;
    }
    public int getDistance() {
        return Math.abs(difference);
    }
    public int getMaximum() {
        return Math.max(firstNumber, secondNumber);
    }
    public int getMinimum() {
        return Math.min(firstNumber, secondNumber);
    }
}