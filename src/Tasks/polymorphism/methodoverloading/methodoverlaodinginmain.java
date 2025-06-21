package Tasks.polymorphism.methodoverloading;

public class methodoverlaodinginmain {
    public static void main(String[] args) {
        methodoverlopdingclass addition = new methodoverlopdingclass();
        System.out.println(addition.add(3,5));
//        System.out.println(addition);
        System.out.println(addition.add(2,3, 4));
//        System.out.println(addition);
        System.out.println(addition.additionof4(3,4,5,6));

    }
}
