package matematicas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PruebaFunciones {

    public static void main(String[] args) {

        int n;

        Scanner myN = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        n = myN.nextInt();

        if (matematicas.Varias.esPrimo(n)) {
            System.out.println("El " + n + " es primo");
        }
        else {
            System.out.println("El " + n + " no es primo");
        }

        Scanner myP = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        n = myP.nextInt();

        System.out.println(n + " tiene " + matematicas.Varias.digitos(n) + " dígitos");

        double r, h;

        System.out.print("Cálculo del volumen de un cilindro\n");

        Scanner myR = new Scanner(System.in);
        System.out.print("Introduzca el radio en metros: ");
        r = myR.nextInt();

        Scanner myH = new Scanner(System.in);
        System.out.print("Introduzca la altura en metros: ");
        h = myH.nextInt();

        double V = matematicas.Geometria.volumenCilindro(r, h); // Round to 2 decimals
        BigDecimal bd = new BigDecimal(V);
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        System.out.println("El volumen del cilindro es " + bd.doubleValue() + " m3");
    }
}
