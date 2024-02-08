package Vehicles;

public class Main {
    public static void main(String[] args) {

        Vehicle saab = new Vehicle("Saab", "93");
        Vehicle toyota = new Vehicle("Toyota", "Avensis");

        saab.Moved(30);
        saab.Moved(40);
        saab.Moved(220);
        toyota.Moved(60);
        toyota.Moved(150);
        toyota.Moved(90);

        System.out.println("El saab ha recorrido " + saab.getTraveledKM() + "Km");
        System.out.println("El toyota ha recorrido " + toyota.getTraveledKM() + "Km");
        System.out.println("El kilometraje total ha sido de " + (saab.getTotalKM() + toyota.getTotalKM()) + "Km");
    }
}
