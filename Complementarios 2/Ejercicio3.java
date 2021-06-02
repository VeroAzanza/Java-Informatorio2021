import java.util.ArrayList;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        List<String> cartas = new ArrayList<>();
        crearLista(cartas);
        System.out.println(cartas);
        Collections.reverse(cartas);
        System.out.println("Mazo invertido: " + cartas);
        Collections.sort(cartas);
        System.out.println("Mazo mezaclado: " + cartas);

    }

    public static void crearLista(List<String> l) {

        l.add("A");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("6");
        l.add("7");
        l.add("8");
        l.add("9");
        l.add("10");
        l.add("11");
        l.add("12");
    }

    
}
