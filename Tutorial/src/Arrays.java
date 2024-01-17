import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        final byte Numero = 6; // Constante a usar. Final keyword fija un valor que no se puede cambiar
        int k = 0; // contador de proposito general

        //Definimos los objetos
        String [] testing; // testing GitHub
        int[] a1_enteros1;
        char[] a1_caracteres1;
        boolean[] a1_booleanos1; // boolean
        String[] a1_cadenas1;

        System.out.println("Change on the work branch. Now I will do a commit");

        // Instanciamos (creamos) los objetos (arrays), su valor es null. Todos están vacíos
        a1_enteros1 = new int[10]; //  contiene 10 valores base: 0. Se pone [10] porque es un int normal. Array con {}
        a1_caracteres1 = new char[10]; // contiene 10 valores base: \u0000 vacíos
        System.out.println(java.util.Arrays.toString(a1_caracteres1) + "Here");
        a1_booleanos1 = new boolean[10]; // contiene 10 valores base: false
        a1_cadenas1 = new String[10]; // contiene 10 valores base: null


        // Definicion e instanciación junto, (algunos no serán null)
        int[] a1_enteros2 = {0,1,2,3,4,5,6,7,8,9};
        char[] a1_caracteres2 = {'a','b','c','d','e','f','g','h','i','j'};
        boolean[] a1_booleanos2 = new boolean[10]; // contiene 10 valores base: "false"
        String[] a1_cadenas2 = new String[10]; // contiene 10 valores base: "null"


        //Mostramos los valores iniciales de los objetos definidos
        for (int i = 0; i < a1_enteros1.length; i++) {
            System.out.println(" a1_enteros1["+ i +"]=" + a1_enteros1[i]);
        }
        System.out.println();
        for (int i = 0; i < a1_enteros2.length; i++) {
            System.out.println(" a1_enteros2["+i+"]="+a1_enteros2[i]);
        }

        System.out.println();

        // Igualamos los dos arrays
        if (a1_enteros1.length != a1_enteros2.length) {
            System.out.println("No se pueden igualar");
        } else {
            System.out.println("Si se pueden igualar");
            for (int i = 0; i < a1_enteros1.length; i++) {
                a1_enteros1[i] = a1_enteros2[i];
            }
        }

        // Mostramos ahora a1_enteros1[] después de igualarlo a a1_enteros2[]
        for (int i = 0; i < a1_enteros1.length; i++) {
            System.out.println("a1_enteros["+i+"]="+a1_enteros1[i]+ " Here ");
        }
        System.out.println();

        // El recorrido de un array para la lectura de su contenido es un operación muy común
        // por lo que hay un FOR especial. Recorremos el array a1_caracteres2, a1_bolneanos1, a1_cadenas2
        // la desventaja, es que no tenemos control total sobre la operación de FOR

        for (char valor : a1_caracteres2) {
            System.out.println("a1_caracteres2["+ (k++) +"]="+ valor);
        }
        System.out.println();
        for (boolean valor : a1_booleanos1) {
            System.out.println("a1_booleanos1[]=" + valor + " ");
        }
        System.out.println();
        for (String valor : a1_cadenas2) {
            System.out.println("a1_cadenas2[]="+valor+ " ");
        }

        System.out.println();

        System.out.println("Arrays multidimensionales");

        // Vamos con los arrays multidimensionales.
        // Es un array que contiene otro array dentro de cada elemento
        // Es mejor entenderlo como una matriz, filas x columnas.

        int[][] a2_enteros3;
        a2_enteros3 = new int[2][3]; // Matriz 2 x 3

        for (int i = 0; i < a2_enteros3.length; i++) {
            for (int j= 0; j < a2_enteros3.length; j++) {
                System.out.println("Int Array is empty " + a2_enteros3[i][j]);
            }
        }

        System.out.println();

        int[][] a2_enteros4 = new int[2][3]; // Matriz 2 x 3

        int[][] a2_enteros5 = {{5, 7}, {4, 6, 5}}; // Matriz no cuadrada

        // Rellenamos array multidimensional, cada celda con su posición
        for (int i = 0, l = 0; i < a2_enteros3.length; i++) {
            for (int j = 0; j < a2_enteros3[i].length; j++) {
                a2_enteros3[i][j] = l++;
            }
        }

        System.out.println();

        // Recorremos el array multidimensional y mostramos sus valores
        System.out.println("Recorrido clásico a2_enteros3");
        for (int i = 0; i < a2_enteros3.length; i++) {
            for (int j = 0; j < a2_enteros3[i].length; j++) {
                System.out.println("a2_enteros3["+i+"]["+j+"]="+a2_enteros3[i][j]);
            } // Primero imprime i = 0 y de ese i = 0 los valores de j. Luego pasa a i = 1 ...
        }

        System.out.println();

        // Recorrido automático parcial para el mismo array
        System.out.println("Recorrido parcialmente automático a2_eneros3");
        for (int contador = 0; contador < a2_enteros3.length; contador++) {
            for (int valor : a2_enteros3[contador]) {
                System.out.println("a2_enteros3["+contador+"][]=" + valor);
            }
        }

        System.out.println();

        // Recorrido automático para el mismo array
        System.out.println("Recorrido automático a2_enteros3");
        for (int[] fila :  a2_enteros3) {
            for (int valor2 : fila) {
                System.out.println("a2_enteros3[][]="+valor2);
            }
        }

        System.out.println();

        // Recorrido automático para array matriz no cuadrada
        System.out.println("Recorrido automático a2_enteros5 para matriz no cuadrada");
        for (int[] fila :  a2_enteros5) {
            for (int valor2 : fila) {
                System.out.println("a2_enteros3[][]="+valor2);
            }
            System.out.println(" \ncambio dimension\n");
        }

        // Nos atrevemos con un array de 3 dimensiones (1 cubo no cuadrado)

        int[][][] a3_enteros6 = {{{1,2,3},{4,5}}, {{6},{7,8},{9}}};

        // Vamos a recorrerlo de manera tradicional, son tres FOR anidados
        System.out.println("Recorrido tradicional a3_enteros6");

        for (int i = 0; i < a3_enteros6.length; i++) {
            for (int j = 0; j < a3_enteros6[i].length; j++) {
                for (int n = 0; n < a3_enteros6[i][j].length; n++) {
                    System.out.println("a3_enteros6["+i+"]["+j+"]["+n+"] = " + a3_enteros6[i][j][n]);
                }
                System.out.println("cambio dimension");
            }
            System.out.println("cambio dimension");
        }

        System.out.println();

        // Vamos a recorrerlo de manera automática
        System.out.println("Recorrido automático a3_enteros6");
        for (int[][] matriz : a3_enteros6) {
            for (int[] fila : matriz) {
                for (int valor : fila) {
                    System.out.println("a3_enteros6[][][] = " + valor);
                }
                System.out.println("cambio dimension");
            }
            System.out.println("cambio dimension");
        }

        System.out.println();

        // Operaciones con arrays proporcionados por el usuario

        int[] a1_enteros7 = new int[Numero]; // Definimos sin inicializar
        Scanner entradaTeclado = new Scanner(System.in); // Para obtener los valores del usuario

        // Requerimos los números al usuario
        for (int i = 0; i < Numero; i++) { // Numero definido a 6
            System.out.println("Introduzca el valor número " + (i + 1) + ": ");
            a1_enteros7[i] = entradaTeclado.nextInt();
        }

        // Mostramos los números introducidos por el usuario
        System.out.println("Los valores introducidos son:");
        for (int i = 0;i < Numero; i++) {
            System.out.println(a1_enteros7[i]+" ");
        }

        // Y ahora los ordenamos con el método bubble short

        int marca = a1_enteros7.length - 1;
        int j;
        while (marca > 0) {
            for (int i = 0; i < marca; i++) {
                if (a1_enteros7[i] > a1_enteros7[i+1]) {
                    j = a1_enteros7[i];
                    a1_enteros7[i] = a1_enteros7[i+1];
                    a1_enteros7[i+1] = j;
                }
            }
            marca--;
        }
        System.out.println("Los ordenados son:");
        for (int i = 0;i < Numero; i++) {
            System.out.println(a1_enteros7[i]+" ");
        }
    } // main
} // class

