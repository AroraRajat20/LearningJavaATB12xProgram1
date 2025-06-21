package Tasks.polymorphism.methodoverriding;

public class overriding {
    public static void main(String[] args) {
        Sonclass son= new Sonclass();
        son.car();
        son.Home();

        fatherclass father = new fatherclass();
        father.F1();
        father.Home();

        fatherclass f2 = new Sonclass();
        f2.Home();

    }
}
