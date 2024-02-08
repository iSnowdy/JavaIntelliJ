package Vehicles;

public class Vehicle {

    private static int totalKM;
    int traveledKM;

    private String brand;
    private String model;

    public Vehicle(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }

    public void Moved(int traveledKM) {
        this.traveledKM = traveledKM;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getTraveledKM() {
        return traveledKM;
    }

    public void setTraveledKM () {
        this.traveledKM = traveledKM;
    }

    public int getTotalKM () {
        return totalKM + traveledKM;
    }
}
