package Vehicle2;

public class Vehicle {

    private static int createdVehicles = 0; // Class attributes like this are initialized to 0
    private static int totalKM = 0;
    private int traveledKM; // Instanced attribute

    public Vehicle() {

        this.traveledKM = 0;
    }

    public static int getTotalKM() {
        return Vehicle.totalKM;
    }

    public int getTraveledKM() {

        return this.traveledKM;
    }

    public void runs (int k) {

        this.traveledKM += k;
        Vehicle.totalKM += k;

    }

    /*
    public String toString() {

        return "Vehicle name: " + getCreatedVehicles() +
                ".\n Total KM: " + getTotalKM() + ".\n Traveled KM: " + getTraveledKM();
    }

     */


}
