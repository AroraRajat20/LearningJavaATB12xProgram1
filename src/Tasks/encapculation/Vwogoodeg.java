package Tasks.encapculation;

 class Vwogoodeg {
    private String Username;
    private String Password;

    private Vwogoodeg (String Username , String Password){
        this.Username = Username;
        this.Password= Password;
    }


    public static void main(String[] args) {
        Vwogoodeg Vwo1;
        Vwo1 = new Vwogoodeg("Rajat","Arora");
        System.out.println(Vwo1.Password);
    }


}
