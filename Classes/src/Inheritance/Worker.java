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
    public void setName() {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition() {
        this.position = position;
    }

    public String getAddress () {
        return address;
    }
    public void setAddress() {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public String getnSS() {
        return nSS;
    }
    public void setnSS() {
        this.nSS = nSS;
    }

    public String toString() {
        return "Worker [name = " + getName() + ", position = " + this.position + ", address = " + address +
                ", phone number = " + phoneNumber + ", nSS = " + nSS + "]";
    }
}
