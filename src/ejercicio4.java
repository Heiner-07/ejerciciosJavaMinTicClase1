import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) throws Exception {      
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite la cantidad e grados centígrados: ");
        int centigrados = sc.nextInt();

        float fahrenheit = conversionTemperatura(centigrados);
        System.out.print(centigrados + " grados centigrados equivalen a " + fahrenheit + " grados fahrenheit.");
    }

    public static float conversionTemperatura(float centigrados) {
        float conversion = 32 + (9 *centigrados / 5);
        return conversion;
    }
}
