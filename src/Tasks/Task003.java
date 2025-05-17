package Tasks;

public class Task003 {
    public static void main(String[] args) {
    int Num1 = 500 ;
    int Num2 = 20 ;
    int Num3 = 30 ;
    int result;
    result = (Num1 > Num2) ? ((Num1 > Num3? Num1: Num3)):(Num2 > Num3) ? Num2 : Num3;
//(N1 > N2) ? ((N1 > N3) ? N1 : N3) : ((N2 > N3) ? N2 : N3);
        System.out.println(result);
    }
}
