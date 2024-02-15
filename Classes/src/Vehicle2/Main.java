package Vehicle2;

import java.util.Scanner;

public class Main {
    static int choice = -1;

    static Scanner sc = new Scanner(System.in);
    static Scanner kmSC = new Scanner(System.in);

    public static void main(String[] args) {

        Car car;
        Bike bike;

        car = new Car(1900);
        bike = new Bike(500);

        int kmUsed;

        while (choice != 8) {

            System.out.println("\nVEHICLE GAME\n" +
                    "============\n" +
                    "1. Use your bike\n" +
                    "2. Do a wheelie!\n" +
                    "3. Use your car\n" +
                    "4. Burn wheel!\n" +
                    "5. Show your bike's KM\n" +
                    "6. Show your car's KM\n" +
                    "7. Show total KM\n" +
                    "8. Get me out of here\n" +
                    "\n" +
                    "Choose an option (1-8): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How many KM are you going to do? ");
                    kmUsed = kmSC.nextInt();
                    bike.runs(kmUsed);
                    System.out.println();
                    break;
                case 2:
                    bike.wheelie();
                    break;
                case 3:
                    System.out.println("How many KM are you going to do? ");
                    kmUsed = kmSC.nextInt();
                    car.runs(kmUsed);
                    System.out.println();
                    break;
                case 4:
                    car.burnWheel();
                    break;
                case 5:
                    System.out.println("Traveled KM with your bike: "
                            + bike.getTraveledKM() + " km");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Traveled KM with your car: "
                            + car.getTraveledKM() + " km");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Total KM is: " + Vehicle.getTotalKM());
                    System.out.println();
                    break;
                case 8:
                    System.out.println("You have created a total of: " + 2 + " vehicles.");
                    System.out.println("See you later alligator");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 8");
                    System.out.println();
                    break;
            }
        }
    }
}