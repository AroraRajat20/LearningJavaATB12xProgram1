package ex_08_If_Condition;

public class Lab085_classifies_a_triangle_if_condition
{
    public static void main(String[] args) {
        int n1=10,n2=89,n3=10;

        if(n1==n2||n2==n3||n3==n1)
        {
            if(n1==n2&&n2==n3)
            {
                System.out.println("Equilateral");
            }
            else
            {
                System.out.println("Isosceles");
            }
        }
       else
        {
            System.out.println("Scalene");
        }
    }
}
