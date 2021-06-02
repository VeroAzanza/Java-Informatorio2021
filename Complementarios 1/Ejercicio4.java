import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese un número entero: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        factorial(a);
        scan.close();

    }
    public static void factorial(int a) {

        int contenedor = 1;
        for (int i = 1; i <= a; i++) {
            contenedor *= i;
        }
        System.out.print("El factorial de " + a + " es: " + contenedor);
    }
    
}
