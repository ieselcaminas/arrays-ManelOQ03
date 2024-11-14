public class ParesImpares {
    public static int sumaPositivos(int[] num) {
        int sumap = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                sumap += num[i];
            }
        }
        return sumap;
    }
    public static int sumaNegativos(int[] num) {
        int suman = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                suman += num[i];
            }
        }
        return suman;
    }
    public static void main(String[] args) {
        int[] num = {30, -10, -8, 9, 15, 45, -35, 17, 28, -16};

        System.out.println("Positivos: " + sumaPositivos(num));
        System.out.println("Negativos: " + sumaNegativos(num));
    }
}
