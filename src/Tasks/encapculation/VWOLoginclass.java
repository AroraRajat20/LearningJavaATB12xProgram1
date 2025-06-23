package Tasks.encapculation;

public class VWOLoginclass {

    String Username;
    String Password;

    public VWOLoginclass(String username, String password) {
        Username = username;
        Password = password;
    }

    public static void main(String[] args) {
        VWOLoginclass VWO = new VWOLoginclass("Rajat", "Passwod");
        System.out.println(VWO.Password);
        VWO.Password = "Arora";
        System.out.println(VWO.Password);

    }


}
