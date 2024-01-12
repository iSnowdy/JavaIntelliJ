import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main(String[] args){

        String user_name, password;
        int attempts;
        attempts = 0;

        do {
            Scanner myFName = new Scanner(System.in);
            System.out.print("Enter your user name: ");
            user_name = myFName.nextLine();

            Scanner myPass = new Scanner(System.in);
            System.out.print("Enter your pasword: ");
            password = myPass.nextLine();

            if (Log_In(user_name, password)) {
                System.out.println("Welcome!");
                break;
            }

            else {
                attempts ++;
                System.out.println("Wrong user name or password. Please try again. " +
                        "You have " + (3 - attempts) + " attempts left");
            }
        }

        while (attempts < 3);
    }

    private static boolean Log_In(String user_name, String password) {

        if (Objects.equals(user_name, "usuario1") && Objects.equals(password, "asdfg")) {
            return true;
        }
        else {
            return false;
        }
    }
}

/*

Dos funciones/métodos.

    1. Método main que incluirá el menú que le pide al usuario el nombre y la contraseña y le vaya imprimiendo por
    pantalla el número de intentos y si entra o no.
    2. Segundo método que llevará el recuento de intentos y devolverá como booleano si es correcto o incorrecto.

Método Main
    Inicializar strings: usuario, clave
    Inicializar int: número de intentos --> contador para el bucle do while. Inicializa a 0

    do while intentos <= 3...

        Input usuario
        Input contraseña

        llamamos al método (Login)

        if Login == True:
            print ('Bienvenido')
            break
        else:
            intentos ++
            print('Nombre de usuario o contraseña incorrectos. Inténtelo nuevo.
            Tiene ' + (3 - intentos) + ' intentos más')

Método Login(usuario, contraseña)
    Definir Login como boolean

    if usuario == "usuario1" && contraseña == "asdfg":
        return Login True
    else:
        return Login False

 */