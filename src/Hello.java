import java.util.Scanner;

public class Hello{
    public static void main(String [] args) {

        String first_name, last_name, full_name, city, state, Hello;

        Scanner myFName = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        first_name = myFName.nextLine();

        Scanner myLName = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        last_name = myLName.nextLine();

        full_name = first_name + " " + last_name;

        Scanner myCity = new Scanner(System.in);
        System.out.println("Enter your city: ");
        city = myCity.nextLine();

        Scanner myState = new Scanner(System.in);
        System.out.println("Enter your state: ");
        state = myState.nextLine();

        Hello = ("Hello, " + full_name + "! Welcome to " + city + ", " + state + "!");
        System.out.println(Hello);

    }
}