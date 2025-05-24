package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab068_Task3_17may
{
    public static void main(String[] args) {
        int age =68;

    String result = age>65?"Senior": (age<18?"Minor": "Adult");
        System.out.println(result);

    }
}
