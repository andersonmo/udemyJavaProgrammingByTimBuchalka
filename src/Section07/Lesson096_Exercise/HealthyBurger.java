package Section07.Lesson096_Exercise;

public class HealthyBurger extends Hamburger {

    private String healthAdd1Name;
    private Double healthAdd1Price;

    private String healthAdd2Name;
    private Double healthAdd2Price;

    public HealthyBurger(String meat, Double price) {
        super("Health", "Brow Rye", meat, price);
    }

    public void healthAddition1(String name, Double price){
        this.healthAdd1Name = name;
        this.healthAdd1Price = price;
    }

    public void healthAddition2(String name, Double price){
        this.healthAdd2Name = name;
        this.healthAdd2Price = price;
    }

    @Override
    public Double calcHamburgerPrice() {
        Double hamburgerPrice = super.calcHamburgerPrice();

        if(this.healthAdd1Name != null){
            hamburgerPrice += this.healthAdd1Price;
            System.out.println("Added " + this.healthAdd1Name + " for an extra $" + this.healthAdd1Price);
        }

        if(this.healthAdd2Name != null){
            hamburgerPrice += this.healthAdd2Price;
            System.out.println("Added " + this.healthAdd2Name + " for an extra $" + this.healthAdd2Price);
        }
        return hamburgerPrice;
    }
}
