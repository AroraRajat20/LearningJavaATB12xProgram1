package Tasks.encapculation;

public class Privatemethod {
    public static void main(String[] args) {
        Vwogoodeg1 Vwo = new Vwogoodeg1("Rajat" , "Arora");
//        System.out.println(Vwo.Password);
        System.out.println(Vwo.getPassword());
        System.out.println(Vwo.getUsername());
//        System.out.println(Vwo.setUsername("new"));
        Vwo.setUsername("RAJAT");
        System.out.println(Vwo.getUsername());
        Vwo.setPassword("Yes", true);
        System.out.println(Vwo.getPassword());
    }

}
class Vwogoodeg1 {

    private String Username;
    private String Password;

    public Vwogoodeg1(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;

    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean IsAdmin) {
        if(IsAdmin)
        this.Password = password;
        else
            System.out.println("This is only for Admin");
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
