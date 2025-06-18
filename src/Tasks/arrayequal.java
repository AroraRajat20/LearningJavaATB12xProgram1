package Tasks;

import java.util.Arrays;

public class arrayequal {
    public static void main(String[] args) {
        int number[] = {12,34,67,34,67,86,34};
        int Numbers[]= {12,34,67,34,-67,86,34};
        boolean areEqual= Arrays.equals(number,Numbers);
        System.out.println(areEqual);
    }
}
