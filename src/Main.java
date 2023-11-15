public class Main {
    public static void main(String[] args) {
        Boss mike = new Boss();
        mike.setBossHealth(200);
        mike.setBossDamage(50);
        mike.setBossDefenceType("BARRIER");
        System.out.println(" BOSS HEALTH: " + mike.getBossHealth() + " BOSS DAMAGE: "
                + mike.getBossDamage() + " BOSS DEFENCE TYPE: " + mike.getBossDefenceType());
        System.out.println("\nHEROES:");
        Hero[]heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("  HEALTH: " + heroes[i].getHeroHealth()
                    + "  DAMAGE: " + heroes[i].getHeroDamage() + "  SUPERPOWER: "
                    + heroes[i].getHeroSuperpower());
        }
    }


    public static Hero[] createHeroes() {
        Hero t1 = new Hero(200,100,"TELEPORT");
        Hero t2 = new Hero(250,50);
        Hero t3 = new Hero(300,90,"INVISIBILITY");
        Hero[] heroes = new Hero[3];
        for (int i = 0; i < heroes.length ; i++) {
            heroes[0] = t1;
            heroes[1] = t2;
            heroes[2] = t3;
        }
        return heroes;
    }

}