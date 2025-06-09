package Tasks;

import java.util.Scanner;

public class vowelusingswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int vowel = 0, consonants = 0;
        word= word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
           // char ch = word.charAt(i);
            switch (word.charAt(i)){
                case 'a' ,'e' , 'i' , 'o' ,'u' :
                    vowel++;
                    break;
                default:
                    consonants++;

            }
        }
        System.out.println("vowels are  "+vowel);
        System.out.println("consonants are  "+ consonants);



    }
}
