import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese dos números enteros (el primero menor que el segundo): ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print(frase(num,num2));
        scan.close();
    }

    public static List<String> frase(int n, int n2) {

        List<String> numeros = new ArrayList<>();
        for(int i = n;i < n2; i++) {
            if((i % 2 == 0) && (n % 3 == 0)) {
                numeros.add("FizzBuzz");
            }
            else if(i % 2 == 0) {
                numeros.add("Fizz");
            }
            else if(i % 3 == 0) {
                numeros.add("Buzz");
            }
            else {
                String b = String.valueOf(i);
                numeros.add(b);
            }
        }
        return numeros;
    }
}