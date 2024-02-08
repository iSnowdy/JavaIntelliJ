package Inheritance;

public class Employee extends Worker {

    private double salary;
    private double taxes;

    private final int PAYMENTS = 14;

    public Employee(String name, String position, String address, String phoneNumber, String nSS,
                  double salary, double taxes) {

        super(name, position, address, phoneNumber, nSS);
        this.salary = salary;
        this.taxes = taxes;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sueldo) {
        this.salary = sueldo;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double impuestos) {
        this.taxes = impuestos;
    }

    public double calculatePayment() {
        return (salary-taxes) / PAYMENTS;
    }

    @Override
    public String toString() {
        return "Employee [salary = " + salary + ", taxes = " + taxes + ", getName()=" + getName()
                + ", getPosition()=" + getPosition() + ", getAddress()=" + getAddress() + ", getPhoneNumber()="
                + getPhoneNumber() + ", getnSS()=" + getnSS() + "]";
    }







}