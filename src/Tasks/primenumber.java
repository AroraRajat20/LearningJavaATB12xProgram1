package Tasks;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
//        isPrime(Number);
        if (isPrime(Number)) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;

                }
            }
            return true;
        }
    }
    }



