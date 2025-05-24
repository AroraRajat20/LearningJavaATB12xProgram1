package ex_06_Ternary_Operator;

public class Lab067_Task2_17May
{
    public static void main(String[] args) {
        int a=3;int b=4;int c=1;

        String result= a>b?(a>c?"a is greater": "c is greater"):(b>a?(b>c?"b is greater": "c is greater"): "c is greater");
        System.out.println( result);
    }
}
