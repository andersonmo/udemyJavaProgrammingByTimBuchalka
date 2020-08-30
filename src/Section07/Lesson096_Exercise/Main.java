package Section07.Lesson096_Exercise;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 4.85);
        hamburger.addition1("Tomato", 0.27);
        hamburger.addition2("Lettuce", 0.75);
        hamburger.addition3("Cheese", 1.13);
        System.out.println("Total Basic Burger price is $" + hamburger.calcHamburgerPrice());

        System.out.println("------------------------------------------------------");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.healthAddition1("Egg", 5.43);
        healthyBurger.healthAddition2("Lentils", 3.41);
        healthyBurger.addition1("Drink", 2.49);
        System.out.println("Total Healthy Burger price is  $" + healthyBurger.calcHamburgerPrice());

        System.out.println("------------------------------------------------------");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addition1("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is  $" + deluxeBurger.calcHamburgerPrice());
    }
}
