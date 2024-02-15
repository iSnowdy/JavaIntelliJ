package Vehicle2;

public class Bike extends Vehicle {

    private int force;

    public Bike(int c) {
        this.force = c;
    }

    public void wheelie() {

        System.out.println("Now I'm doing a wheelie!\n" +
                "*crashes*\n" +
                "Now I am in the Hospital :)");
    }
}
