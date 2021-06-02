import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("Ingrese dos numeros enteros a multiplicar: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print(a + " * " + b + " = " + sumaSucesiva(a,b));
        scan.close();
        
    }
    
    public static int sumaSucesiva(int a, int b) {

        int suma = 0;
        for(int i = 1; i <= b; i++) {
            suma += a;
        }
        return suma;
    }
}
