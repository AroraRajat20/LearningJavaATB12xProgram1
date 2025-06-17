package Tasks;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5 ,"bye");
        System.out.println(sb);
        sb.replace(6,10,"java");
        System.out.println(sb);

//        sb.reverse();
        String SB = sb.substring(6,8);
        System.out.println(SB);
//        String no = sb.toLowerCase


    }
}
