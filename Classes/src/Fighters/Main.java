package Fighters;

public class Main extends Two_Fighters{
    public static void main(String[] args) {

        Two_Fighters fighter1 = new Two_Fighters();
        Two_Fighters fighter2 = new Two_Fighters();

        fighter1.setName("Lew");
        fighter1.setHealth(10);
        fighter1.setDamagePerAttack(2);

        fighter2.setName("Harry");
        fighter2.setHealth(5);
        fighter2.setDamagePerAttack(4);

        String firstAttacker = "Lew";

        do  {
            if (firstAttacker.equals(fighter1)) {
                System.out.println(String.format("%s attacks %s; %s now has " +
                        fighter2.getHealth() + " health.", fighter1, fighter2));

            }
            else {
                System.out.println(String.format("%s attacks %s; %s now has " +
                        fighter1.getHealth() + " health.", fighter2, fighter1));
                // this.health = Two_Fighters(fighter2, this.health, this.damagePerAttack);
            }
        }
        while (fighter1.getHealth() > 0 || fighter2.getHealth() > 0);
    }
}
