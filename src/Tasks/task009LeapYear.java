package Tasks;

import java.util.Scanner;

public class task009LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int Year = scanner.nextInt();
        if(Year%4==0){
            System.out.println(Year + " is a Leap Year");
        }
        else {
            System.out.println(Year + " Not a Leap Year");
        }

    }
}
