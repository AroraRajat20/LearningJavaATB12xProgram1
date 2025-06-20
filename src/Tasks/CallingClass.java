package Tasks;

import java.util.SortedMap;

public class CallingClass {
    public static void main(String[] args) {
        firstclass First = new firstclass();
        firstclass Second = new firstclass();
        Second.name = "Doggy";
        Second.Running();

        System.out.println();
        System.out.println();

        System.out.println(First.name);
        First.name= "Cat";
        First.Running();
        System.out.println(First.name);
    }
}
