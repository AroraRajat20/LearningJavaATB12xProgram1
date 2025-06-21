package Tasks.polymorphism.methodoverriding;

public class allinone {

    void Home()
    {
        System.out.println("Print me ");

    }

    public static class son extends allinone{
        void Home()
        {
            System.out.println("Son class");
        }
    }

    public static void main(String[] args) {
        allinone home = new allinone();
        home.Home();
        allinone f1 =new son();
        f1.Home();


    }
}
