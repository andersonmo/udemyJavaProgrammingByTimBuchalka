package Section07.Lesson096_Exercise;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Australian", "250g Sirloin & Bacon", 22.99);
        super.addition1("Chips", 2.98);
        super.addition2("Drink", 3.99);
    }

    @Override
    public void addition1(String name, Double price) {
        System.out.println("Addition is not allowed");
    }

    @Override
    public void addition2(String name, Double price) {
        System.out.println("Addition is not allowed");
    }

    @Override
    public void addition3(String name, Double price) {
        System.out.println("Addition is not allowed");
    }

    @Override
    public void addition4(String name, Double price) {
        System.out.println("Addition is not allowed");
    }
}
