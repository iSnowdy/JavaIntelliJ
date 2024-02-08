package Inheritance;

public class Inheritance_Example {
    public static void main (String[] args) {

        Worker worker;
        Employee employee;
        Consultor consultor;

        worker = new Worker("Bill Gates", "Presidente", "Redmond", "", "");
        employee = new Employee("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);
        consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);

        System.out.println(worker);
        System.out.println(employee);
        System.out.println(consultor);

        System.out.println();


    }

}
