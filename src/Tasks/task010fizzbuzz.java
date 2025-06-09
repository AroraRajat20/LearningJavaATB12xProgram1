package Tasks;

import java.util.Scanner;

public class task010fizzbuzz {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Number from 1 to 100");
//        int Number = scanner.nextInt();
        for (int Number = 1; Number <= 100; Number++) {
            if (Number % 5 == 0 && Number % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (Number % 5 == 0) {
                System.out.println("Buzz");
            } else if (Number % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(Number);
            }
        }
    }
}
