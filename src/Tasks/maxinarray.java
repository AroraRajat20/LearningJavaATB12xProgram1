package Tasks;

public class maxinarray {
    public static void main(String[] args) {
        int [] marks = {57 ,82,75,19,46,19,68,18,16,0,19,194,1992};
        int maxnumber = Maxnumber(marks);
        int minimum = minimumnumber(marks);
        System.out.println(maxnumber);
        System.out.println(minimum);

    }
    public static int Maxnumber(int [] array){
         int max = array[0];
        for (int i = 0; i <array.length; i++) {
            if (array[i] > max){
                max= array[i];
            }

        }
return max;
    }

    public static int minimumnumber(int [] array){
        int minimum = array[0];
        for (int i = 0; i <array.length; i++) {
            if (array[i] < minimum){
                minimum = array[i];
            }

        }
        return minimum;
    }


}
