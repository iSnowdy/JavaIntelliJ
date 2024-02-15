package Vehicle2;

public class Car extends Vehicle { // extends means that the class Car also has teh attributes of Vehicle

    private int force;

    public Car(int c) {
        this.force = c;
    }

    public void burnWheel() {

        System.out.println("*Stirs like crazy the wheel*\n" +
                "Do you smell that!? It is the smell of burnt wheels!");
    }


}
