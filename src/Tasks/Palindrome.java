package Tasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        boolean isPalindrome = true;
//        int length = value.length();
        for (int i = 0; i <=value.length()-1; i++) {
            if (value.charAt(i) != value.charAt(value.length() - 1 -i)) {
//                length--;
                isPalindrome = false;
            }
            break;

        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else
            System.out.println("not Palindrome");
    }


    }



