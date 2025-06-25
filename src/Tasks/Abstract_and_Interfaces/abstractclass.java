package Tasks.Abstract_and_Interfaces;

public class abstractclass {
    public static void main(String[] args) {
 son son = new son();
 son.loan50k();
    }
}










abstract class father {
    abstract void loan50k();
}

class son extends father{

    @Override
    void loan50k() {
        System.out.println("Paying loan");
    }
}
