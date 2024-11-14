import java.util.Scanner;

public class DNI {
    public static char calculoLetra(int numeroDNI) {
        int numLetra;
        final char [] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        numLetra = numeroDNI % 23;
        return letrasDNI[numLetra];
    }

    public static void main(String[] args) {
        int numeroDNI;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero de un DNI(8 numeros): ");
        numeroDNI = sc.nextInt();

        System.out.println("" + numeroDNI + calculoLetra(numeroDNI));
    }
}
