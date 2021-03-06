package Section07.Lesson096_Exercise;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private Double price;

    private String add1Name;
    private Double add1Price;
    private String add2Name;
    private Double add2Price;
    private String add3Name;
    private Double add3Price;
    private String add4Name;
    private Double add4Price;

    public Hamburger(String name, String breadRollType, String meat, Double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;

        System.out.println(this.name+" hamburger " +
                "on a "+this.breadRollType+" bread"+
                " with "+this.meat+
                ", price is "+this.price);
    }

    public void addition1(String name, Double price){
        this.add1Name = name;
        this.add1Price = price;
    }

    public void addition2(String name, Double price){
        this.add2Name = name;
        this.add2Price = price;
    }

    public void addition3(String name, Double price){
        this.add3Name = name;
        this.add3Price = price;
    }

    public void addition4(String name, Double price){
        this.add4Name = name;
        this.add4Price = price;
    }

    public Double calcHamburgerPrice(){
        Double hamburgerPrice = this.price;

//        System.out.println(this.name+" hamburger " +
//                "on a "+this.breadRollType+" bread"+
//                " with "+this.meat+
//                ", price is "+this.price);

        if(this.add1Name != null){
            hamburgerPrice += this.add1Price;
            System.out.println("Added " + this.add1Name + " for an extra $" + this.add1Price);
        }
        if(this.add2Name != null){
            hamburgerPrice += this.add2Price;
            System.out.println("Added " + this.add2Name + " for an extra $" + this.add2Price);
        }
        if(this.add3Name != null){
            hamburgerPrice += this.add3Price;
            System.out.println("Added " + this.add3Name + " for an extra $" + this.add3Price);
        }
        if(this.add4Name != null){
            hamburgerPrice += this.add4Price;
            System.out.println("Added " + this.add4Name + " for an extra $" + this.add4Price);
        }

        return hamburgerPrice;
    }
}
