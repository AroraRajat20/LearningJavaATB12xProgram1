package Tasks.SuperKeyword;

public class Baseclass {
    private  String Browser;

    public Baseclass(String browser) {
        Browser = browser;
    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser) {
        Browser = browser;
    }
 public void OpenBrower(){
     System.out.println("Open the pbroswe");
 }
 public void CloseBR(){
     System.out.println("CLose the BR");
 }
}
class Child extends Baseclass{
    public Child(String browser) {
        super(browser);
        super.CloseBR();
        super.OpenBrower();

    }
}
