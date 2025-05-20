package Tasks;

import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side");
        float firstside = scanner.nextFloat();
        System.out.println("Enter the second side");
        float secondside = scanner.nextFloat();
        System.out.println("Enter the third side");
        float thirdside = scanner.nextFloat();

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

