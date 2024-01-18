import java.util.Scanner;

public class CharStrings {

    public static void main(String[] args) {
        // Operaciones con Cadenas de Caracteres

        String cadena1;
        String cadena2;
        Scanner entradachar = new Scanner(System.in);

        // Código

        System.out.print("Teclea primer string: ");
        cadena1 = entradachar.nextLine();

        System.out.print("Teclea segundo string: ");
        cadena2 = entradachar.nextLine();

        System.out.println();
        System.out.println("Primer texto : " + cadena1);
        System.out.println("Segundo texto : " + cadena2);
        System.out.println("Concatenación : " + cadena1 + cadena2);
        System.out.println("Longitud primer texto = " + cadena1.length());
        System.out.println("Longitud segundo texto = " + cadena2.length());
        System.out.println("Texto iguales = " + cadena1.equals(cadena2));
        System.out.println("Último caracter de " + cadena1 + " = " + cadena1.charAt(cadena1.length() - 1));
        System.out.println();
    }
}
