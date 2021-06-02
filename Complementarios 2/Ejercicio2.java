import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        crearLista(numeros);
        System.out.println("La lista: " + numeros + " contiene " + numeros.size() + " elementos.");
        agregar(numeros);
        System.out.println("Lista modificada: " + numeros + " contiene " + numeros.size() + " elementos.");

    }

    public static void crearLista(List<Integer> l) {

        l.add(6);
        l.add(12);
        l.add(21);
        l.add(23);
    }

    public static void agregar(List<Integer> l) {

        l.add(0, 2);
        l.add(51);

    }
    
}
