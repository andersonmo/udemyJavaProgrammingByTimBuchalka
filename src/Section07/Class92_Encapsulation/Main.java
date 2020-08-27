package Section07.Class92_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Anderson", 200, "Sword");

        System.out.println("Initial health is: "+player.getHealth());

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining health: "+player.getHealth());

        player.loseHealth(damage);

    }
}
