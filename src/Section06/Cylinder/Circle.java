package Section06.Cylinder;

public class Circle {

    private Double radius;

    public Circle(Double radius) {
        if(radius < 0){
            this.radius = 0d;
        } else {
            this.radius = radius;
        }

    }

    public Double getRadius() {
        return radius;
    }

    public Double getArea () {
        return getRadius()*getRadius()*Math.PI;
    }
}
