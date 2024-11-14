public class MediaArray {

    public static double mediaArray(){
        double media;
        int suma = 0;
        int [] numeros = {3, 5, 6, 7, 9, 10, 8, 8, 0, 10};

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        media = ((double)suma /(double) numeros.length);
        return media;
    }

    public static void main(String[] args) {

      System.out.println("Media: " + mediaArray());
    }
}
