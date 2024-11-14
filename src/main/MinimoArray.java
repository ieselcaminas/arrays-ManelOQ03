public class MinimoArray {
    public static int minimoArray(){
        int[] num = {30, 10, 8, 9, 15, 45, 35, 17, 28, 46};
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        System.out.println(minimoArray());
    }
}
