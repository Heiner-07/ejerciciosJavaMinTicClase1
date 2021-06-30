import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un número entero: ");
        int numero = sc.nextInt();

        int digitos = numeroDigitos(numero);
        System.out.print("El numero " + numero + " tiene " + digitos + " cifra(s)");
    }

    public static int numeroDigitos(int numero) {
        int cifras = 0;

        while(numero != 0) {
            numero /= 10;
            cifras ++;
        }

        return cifras;
    }
}
