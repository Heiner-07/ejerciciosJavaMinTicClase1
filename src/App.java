import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Capturar datos por teclado 
        System.out.print("Digite su nombre: ");
        Scanner sc = new Scanner(System.in);
        //Gurdamos el nombre
        String resultado = sc.next();
        System.out.println(saludo(resultado));
    }

    //Metodo saludo
    public static String saludo(String nombre){
        return "Hola " + nombre + ", ¿Cómo estas?";
    }
}
