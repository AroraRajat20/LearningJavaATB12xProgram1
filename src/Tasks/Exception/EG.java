package Tasks.Exception;

public class EG {
    public static void main(String[] args) {
        int a =10;
//        int b= a/0;
//        System.out.println(b);
        String a1= null;
        try {
            int b= a/0;
            String b1 = a1.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
//            catch (NullPointerException ex) {
//                System.out.println(ex.getMessage());
//            System.out.println(e);
//        String a1= null;
//            String b1= null;
//            try {
//                b1 = a1.trim();
//            } catch (Exception ex) {
//                ex.printStackTrace();
////                System.out.println(ex.getMessage());
            }

        }


