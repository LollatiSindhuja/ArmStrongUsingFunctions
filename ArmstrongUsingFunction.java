import java.util.Scanner;

public class ArmstrongUsingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");
        printArmstrongNumbers(lowerBound, upperBound);
    }

    public static void printArmstrongNumbers(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
