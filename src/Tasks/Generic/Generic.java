package Tasks.Generic;

public class Generic {
    public static void main(String[] args) {
    add(10 ,20);
    addition(12.1,13.5);

    }

  public static <T> T add(T a, T b){
     System.out.println(a+""+ b);
     return null ;
 }
    public static Integer addition( Integer a , Integer b){
        return a+b;
    }

    public static <T>  T addition( T a , T b){
        System.out.println(a +" "+ b);
        return null;
    }

}
