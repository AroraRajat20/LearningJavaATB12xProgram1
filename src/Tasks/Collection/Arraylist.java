package Tasks.Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List Fruits = new ArrayList<>();
        Fruits.add("apple");
        Fruits.add("apple");
        Fruits.add("apple");
        Fruits.add("Apple");
        Fruits.add("apple");
        System.out.println(Fruits);
        System.out.println(Fruits.indexOf("apple"));
        System.out.println(Fruits.size());
        System.out.println(Fruits.contains("Apple"));
        System.out.println(Fruits.isEmpty());
    }
}
