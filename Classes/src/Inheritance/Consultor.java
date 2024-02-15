package Inheritance;

public class Consultor extends Worker {

    private int hours;
    private double fee;


    public Consultor(String name, String position, String address, String phoneNumber, String nSS,
                     int hours, double fee) {
        super(name, position, address, phoneNumber, nSS);
        this.hours = hours;
        this.fee = fee;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double calculatePayment() {
        return hours * fee;
    }


    @Override
    public String toString() {
        return "Consultor [hours = " + hours + ", tariff = " + fee + ", getName() = " + getName() + ", getPosition() = "
                + getPosition() + ", getAddress() = " + getAddress() + ", getPhoneNumber() = " + getPhoneNumber()
                + ", getnSS() = " + getnSS() + "]";
    }
}