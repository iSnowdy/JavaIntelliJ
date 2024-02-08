package Inheritance;

public class Worker {

    private String name;
    private String position;
    private String address;
    private String phoneNumber;
    private String nSS;

    public Worker(String name, String position, String address, String phoneNumber, String nSS) {
        // This is called a builder. It allows to build the object Worker

        this.name = name;
        this.position = position;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.nSS = nSS;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress () {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getnSS() {
        return nSS;
    }
    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    public String toString() {
        return "Worker [name = " + getName() + ", position = " + this.position + ", address = " + address +
                ", phone number = " + phoneNumber + ", nSS = " + nSS + "]";
    }
}
