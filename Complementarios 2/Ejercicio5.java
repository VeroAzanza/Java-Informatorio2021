import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        List<Integer> horasTrabajo = new ArrayList<>();
        List<Integer> valorHora = new ArrayList<>();
        List<Integer> total = new ArrayList<>();
        System.out.println("Horas de trabajo por día: " + cargarHoras(horasTrabajo));
        System.out.println("Valor por hora: " + valores(valorHora));
        System.out.println("Total por día: " + totales(total,horasTrabajo,valorHora));
        System.out.println("Total: $" + suma(total));

    }

    public static List<Integer> cargarHoras(List<Integer> horas) {

        horas.add(8);
        horas.add(7);
        horas.add(8);
        horas.add(6);
        horas.add(4);
        return horas;
    }
    
    public static List<Integer> valores(List<Integer> valor) {

        valor.add(250);
        valor.add(250);
        valor.add(250);
        valor.add(250);
        valor.add(250);
        return valor;
    }

    public static List<Integer> totales(List<Integer> total,List<Integer> horas,List<Integer> valor) {

        for(int i = 0; i < 5; i++) {
            total.add(horas.get(i)*valor.get(i));
        }
        return total;
    
    }

    public static int suma(List<Integer> total) {

        int s = total.get(0) + total.get(1) + total.get(2) + total.get(3) + total.get(4);
        return s; 
    }
}
