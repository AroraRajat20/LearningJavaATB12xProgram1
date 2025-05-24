package Tasks;

import java.util.Scanner;

public class Task006Year_Problem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the month number");
        int month = scanner.nextInt();
        System.out.println("Enter the Year");
        int year = scanner.nextInt();

        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("31 Days");
                break;
            case 4,6,9,11:
                System.out.println("30 Days");
                break;
            case 2:
                if(year%4==0){
                    System.out.println("29 Days as  its Leap Year");
                }
                else {
                    System.out.println("28 Days");
                }
                break;
            default:
                System.out.println("Invaild Input");


        }

    }
}
