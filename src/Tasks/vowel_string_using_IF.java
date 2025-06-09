package Tasks;

import java.util.Scanner;

public class vowel_string_using_IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int vowel = 0, consonants = 0;
        word= word.toLowerCase();
        for (int j = 0; j < word.length(); j++) {
//            char ch = input.Char
            if (word.charAt(j)== 'a' || word.charAt(j)== 'e' ||word.charAt(j)== 'i' ||word.charAt(j)== 'o' ||word.charAt(j)== 'u') {
                vowel++;

            }
            else {
                consonants++;

            }

        }
        System.out.println("vowels are  "+vowel);
        System.out.println("consonants are  "+ consonants);

    }

}
