import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("Ingrese un número entero: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        incremento(a);
        scan.close();
        
    }

    public static void incremento (int a) {

        String contenedor = "";
        for (int i = 1; i <= a; i++) {
            String b = Integer.toString(i);
            contenedor += b;
            System.out.println(contenedor);
        }

    }
    
}