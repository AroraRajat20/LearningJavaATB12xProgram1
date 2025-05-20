package Tasks;

import java.util.Scanner;

public class Task004withCLI {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first side");
//        float firstside = scanner.nextFloat();
//        System.out.println("Enter the second side");
//        float secondside = scanner.nextFloat();
//        System.out.println("Enter the third side");
//        float thirdside = scanner.nextFloat();
        float firstside = Float.parseFloat(args[0]);
        float secondside = Float.parseFloat(args[1]);
        float thirdside = Float.parseFloat(args[2]);

        if(firstside == secondside && secondside == thirdside){
            System.out.println("equilateral triangle");}
        else if (firstside == secondside || secondside == thirdside || thirdside == firstside) {
            System.out.println("isosceles triangle ");
        }
        else {
            System.out.println("scalene triangle");
        }
    }
}

