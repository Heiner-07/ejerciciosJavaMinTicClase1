import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un número entero: ");
        int numero = sc.nextInt();

        int numDoble = (int) Math.pow(numero, 2);
        int numTriple = (int) Math.pow(numero, 3);
        System.out.print("El doble de " + numero + " es " + numDoble + ". Y el triple es " + numTriple);
    }
}
