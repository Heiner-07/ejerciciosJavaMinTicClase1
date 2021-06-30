import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un número entero: ");
        int num = sc.nextInt();

        System.out.print("El número " + num + " es " + ((num%2 == 0) ? "par" : "impar"));
    }
}
