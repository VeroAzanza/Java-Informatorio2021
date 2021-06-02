import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese frase o texto y una letra para determinar cantidad de veces que se encuentra en el mismo: ");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String letra = scan.nextLine();
        System.out.print(letra + " aparece " + caracteres(frase,letra) + " veces"); 
        scan.close();
    }

    public static int caracteres(String f, String l) {
        
        int contador = 0;
        char c = l.charAt(0);
        for (int i = 0; i < f.length(); i++) {
            if (c == f.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }
    
}
