package Tasks.Abstract_and_Interfaces;

public class newtaskwithcarclass {
    public static void main(String[] args) {
    Nano nano =new Nano();
    nano.drive();


    }
}

















class newfuntion implements Tyre{

    void drive(){
        tyretype();
        griptype();

    }
    @Override
    public void tyretype() {

    }

    @Override
    public void griptype() {

    }
}


class Nano extends car implements Tyre, gearbox{
    void drive(){
        tyretype();
        griptype();
        startengine();
        changing_gear();
        drifting();
        apply_brakes();
        stopengine();

    }

    @Override
    void startengine() {
        System.out.println("Starting thr engine");
    }

    @Override
    public void tyretype() {
        System.out.println("tyre type");
    }

    @Override
    public void griptype() {
        System.out.println("tyre are of best type");
    }

    @Override
    public void changing_gear() {
        System.out.println("gear engagaded");
    }

    @Override
    public void apply_brakes() {
        System.out.println("brakes applied");
    }
}
interface Tyre{
    void tyretype();
    void griptype();

}
interface gearbox{
    void changing_gear();
    void apply_brakes();
    default void drifting(){
        System.out.println("doing drifiting");
    }
}
abstract class car{
    abstract void startengine();

    void stopengine() {
        System.out.println("stoping");
    }}
