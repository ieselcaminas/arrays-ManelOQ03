import java.util.Scanner;

public class MarcoConCadenas {
    public static int calculaMaximo(String[] cadenas){
        int maxima = cadenas[0].length();
        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].length() > maxima) {
                maxima = cadenas[i].length();
            }
        }
        return maxima;
    }
    public static String asteriscos(int maxima){
        String asteriscos = "";
        for (int i = 0; i < maxima +4; i++) {
            asteriscos += "*";
        }
        return asteriscos;
    }

    public static void main(String[] args) {
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto: ");
        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = sc.next();
        }

        int maxima = calculaMaximo(cadenas);
        System.out.println(asteriscos(maxima));
        for (int i = 0; i < maxima; i++) {
            System.out.print("* " + cadenas[i]);
            for (int j = cadenas[i].length(); j <= maxima; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println(asteriscos(maxima));
    }
}