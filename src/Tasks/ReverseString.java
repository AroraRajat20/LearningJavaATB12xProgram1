package Tasks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Word = scanner.next();
//        StringBuilder New =  new

        for (int i = Word.length()-1; i >=0 ; i--) {
            System.out.print(Word.charAt(i));

        }
    }
}
