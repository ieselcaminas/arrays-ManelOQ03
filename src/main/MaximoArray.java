public class MaximoArray {
    public static int maximoArray(){
        int max = 0;
        int[] num = {30, 10, 8, 9, 15, 45, 35, 17, 28, 46};

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        System.out.println(maximoArray());
    }
}
