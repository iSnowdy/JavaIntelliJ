package Fighters;

public class Two_Fighters {

    private String name;
    private int health, damagePerAttack;


    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public void damage (int health) {
        this.health -= health;
    }




    /*
    public String attack (String fighter1, String fighter2, String firstAttacker) {

        if (getHealth() > 0) {
            while (getHealth() > 0) {
                if (firstAttacker == fighter1) {
                    System.out.println(String.format("%s attacks %s; %s now has " +
                        getHealth() + " health.", fighter1, fighter2));
                    this.health = health - Two_Fighters(fighter1, this.health, this.damagePerAttack);
                }
                else {
                    System.out.println(String.format("%s attacks %s; %s now has " +
                            getHealth() + " health.", fighter2, fighter1));
                    this.health = health - Two_Fighters(fighter2, this.health, this.damagePerAttack);
                }
            }
        }
        else {
            return String.format("%s attacks %s: %s now has " + getHealth() + " health " +
                    "and is dead. %s wins.", fighter1, fighter2, fighter2, fighter1);
        }

        return "";
    }

     */





}
