public class A4_Article {

    public static void main (String[] abs) {

        Article a1 = new Article();
        a1.name = "Red T-Shirt";
        a1.price = 20;
        a1.howManyLeft = 5;

        System.out.println(a1.name + " - Precio: " + a1.price + "€ - IVA: " + a1.TAX + "% - PVP: " +
                (a1.price + (a1.price * a1.TAX / 100)) + "€");

        a1.price = 10;

        System.out.println(a1.name + " - Precio: " + a1.price + "€ - IVA: " + a1.TAX + "% - PVP: " +
                (a1.price + (a1.price * a1.TAX / 100)) + "€");
    }
}
