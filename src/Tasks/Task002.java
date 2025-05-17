package Tasks;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        System.out.println(number);
    String result = (number%2== 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
