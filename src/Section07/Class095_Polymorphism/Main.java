package Section07.Class095_Polymorphism;

class Car {

    private String name;
    private int cylinders;
    private int whells;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.whells = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake() throws InterruptedException {
        System.out.println("Car breaking...");
        Thread.sleep(2000);
        return "Car -> brake()";
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda - > accelerate()";
    }

    @Override
    public String brake() throws InterruptedException {
        return "Honda -> brake()";
    }
}

class Jeep extends Car{
    public Jeep(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Jeep -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Jeep -> accelerate";
    }

    @Override
    public String brake() throws InterruptedException {
        return "Jeep -> brake()";
    }
}

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("Base Car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Jeep jeep = new Jeep("Cherokee", 6);
        System.out.println(jeep.startEngine());
        System.out.println(jeep.accelerate());
        System.out.println(jeep.brake());

        Honda honda = new Honda("Civic", 4);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
    }
}
