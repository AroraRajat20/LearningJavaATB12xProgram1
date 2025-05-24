package Tasks;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Task005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you grade");
        String Grade = scanner.next().toUpperCase();
        switch (Grade){
            case "A" :
                System.out.println("Excellent");
                break;
            case "B" :
                System.out.println("Very Good");
                break;
            case "C" :
                System.out.println("Good");
                break;
            case "D" :
                System.out.println("Need Improvement");
                break;

            case "F" :
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invaild Grade");

        }


    }
}
//-case 'A': return "Excellent";
//
//            case 'B': return "Very Good";
//
//            case 'C': return "Good";
//
//            case 'D': return "Needs Improvement";
//
//            case 'F': return "Fail";
//
//            default: return "Invalid grade";