import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String[] color = {"rojo"
                ,
                "amarillo"
                ,
                "verde"
                ,
                "blanco"
                ,
                "azul"
                ,
                "negro"};


        System.out.println("Generador aleatorio de banderas\n");
        Scanner s = new Scanner(System.in);

        System.out.println("¿Cuántas franjas quiere para la bandera?");
        int franjas = Integer.parseInt(s.nextLine());

        System.out.println("\n-------------------\n");

        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int)(Math.random()*6) ]);
            // Math.random generates a random number between 0 and 1. Thats why we *6 (array max length)
            System.out.println("\n-------------------\n");
        }
    }
}
