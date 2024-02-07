import java.util.ArrayList;

public class ArraysLists {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();

        String[] possibilities = {"Alice", "Bob", "Charlie", "Pepe"};

        // Agregando nombres
        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Charlie");

        // Mostrando nombres
        for(String nombre : nombres) {
            System.out.println(nombre);
            int i = 0;
            i++;
            if (nombres.contains(possibilities[i])) {
                System.out.println("For iteration " + nombres.get(0));
                System.out.println("Name value: " + nombre);
            }
        }

        System.out.println("\n\n\n");

        if (nombres.contains("Alice")) {
            System.out.println("Yes");
            System.out.println(nombres.indexOf("Alice"));
            nombres.set(0, "Pepe");
            System.out.println(nombres);
        }

        if (nombres.contains(possibilities)) {
            System.out.println("Hi" + nombres.get(0));
        }


        // Tamaño del ArrayList
        System.out.println("Total de nombres: " + nombres.size());
    }
}