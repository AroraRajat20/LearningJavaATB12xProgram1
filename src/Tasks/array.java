package Tasks;

public class array {
    public static void main(String[] args) {
        int number[] = {12,34,67,34,67,86,34};
//        System.out.println(number.length);
//        int[] mat = new int[3];
//        System.out.println(number[1]);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }
        number[1] = 99;
    for(int numbers : number)
            System.out.println(numbers);

    }
}
