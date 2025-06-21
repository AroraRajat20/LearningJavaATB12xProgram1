package Tasks;

public class Carclass {

    String name;
    int year;
    String model;

    Carclass(){
        name = "sample Car";
        year = 0;
        model = "XXXX";
        System.out.println("DC");
    }
    Carclass(String Carname , int Caryear, String carmodel){
        this.name = Carname;
        this.year = Caryear;
        this.model = carmodel;
    }

    void Running(){
        System.out.println("Car is Running");
    }
}
