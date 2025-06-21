package Tasks;

public class calligcarclass {
    public static void main(String[] args) {
        Carclass tesla = new Carclass();
        tesla.name = "Tesla";
        tesla.model = "Highend";
        tesla.year= 2020;
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);
        Carclass teslamodelY = new Carclass();
        System.out.println(teslamodelY.name);
        System.out.println(teslamodelY.model);
        System.out.println(teslamodelY.year);
        System.out.println();
        System.out.println();
        System.out.println();
        Carclass nano = new Carclass("TATA NANO", 2011 , "TOP END");
        System.out.println(nano.year);
        System.out.println(nano.model);
        System.out.println(nano.name);



    }
}
