import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = object.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");

        }
        Scanner object1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = object1.nextInt();
        if (number1 < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }
}
