package Tasks.Inheritence;

public class SonClass {
    public static void main(String[] args) {
        singleinhertence son = new singleinhertence();
        son.BHK3();
        System.out.println(son.gold_f);
        son.BHK4();
        son.Car_SUV();
        System.out.println("------------");

        son.Tractor();
        son.villageHome();

        System.out.println("------------");
        cousinclass cousin = new cousinclass();
        cousin.bhk2();

        System.out.println("------------");
        fatherclass father = new fatherclass();
        System.out.println(father.goldfromGF);
        father.Tractor();
        father.villageHome();

    }
}
