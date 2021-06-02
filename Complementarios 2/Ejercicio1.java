import java.util.*;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        List<String> ciudades = new ArrayList<>();
        agregarLista(ciudades);
        mostrarRanking(ciudades);
        
    }

    public static List<String> agregarLista(List<String> l) {

        l.add("Córdoba");
        l.add("Buenos Aires");
        l.add("Bariloche");
        l.add("Salta");
        return l;
    }
    
    public static void mostrarRanking(List<String> l) {

        for (int i = 1; i <= l.size(); i++) {
            System.out.println("#" + i + " " + l.get(i-1));
        }
    }
}
