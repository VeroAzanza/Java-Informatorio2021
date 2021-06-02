import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        List<String> alumnos = new ArrayList<>();
        crearLista(alumnos);
        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);
        //curso(alumnos,curso1,curso2,curso3);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);
    }

    public static void crearLista(List<String> l) {

        l.add("Azanza Veronica");
        l.add("Azanza Agustina");
        l.add("Malgieri Mabel");
        l.add("Kisiel Matias");
        l.add("Kisiel Graciela");
        l.add("Kisiel Candelaria");
        l.add("Kisiel Camilo");
        l.add("Fernandez Marianela");
        l.add("Quiñonez Alejandro");
        l.add("Vazquez Maria");
        l.add("Azanza Francisco");
        l.add("Frias Hilda");
    }

    /*public static void curso(List<String> l, List<String> c, List<String> c1, List<String> c2) {

        int contador = 1;
        for(int i = 0; i < 12; i++) {
            if(contador <= 4) {
                c.add(l.get(i));
                contador++; 
            }
            else if (contador > 4 && contador <=8 ) {
                c1.add(l.get(i));
                contador++;
            }
            else {
                c2.add(l.get(i));
                contador++;
            }
        }

    }*/
}
