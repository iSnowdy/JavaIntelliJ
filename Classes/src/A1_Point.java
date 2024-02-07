public class A1_Point {
    public static void main (String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        p1.x = 5; // Not how you usually add/show values in OOP
        p1.y = 10;

        p2.x = 10;
        p2.y = 10;

        p3.x = -5;
        p3.y = 7;

        System.out.println("Coordinates of point p1 (" + p1.x + ", " + p1.y + ")");
        System.out.println("Coordinates of point p2 (" + p2.x + ", " + p2.y + ")");
        System.out.println("Coordinates of point p3 (" + p3.x + ", " + p3.y + ")");
        System.out.println();

        p1.x += 3;
        p1.y = 6;

        p2.x /= 2;
        p2.y /= 10;

        p3.x *= 2;
        p3.y %= 2;

        System.out.println("Modifying coordinates ... \n");

        System.out.println("Coordinates of point p1 (" + p1.x + ", " + p1.y + ")");
        System.out.println("Coordinates of point p2 (" + p2.x + ", " + p2.y + ")");
        System.out.println("Coordinates of point p3 (" + p3.x + ", " + p3.y + ")");
        System.out.println();

    }
}