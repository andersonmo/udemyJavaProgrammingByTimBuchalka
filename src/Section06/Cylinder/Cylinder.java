package Section06.Cylinder;

public class Cylinder extends Circle {
    private Double height;

    public Cylinder(Double radius, Double height) {
        super(radius);
        if (height<0){
            this.height = 0d;
        } else {
            this.height = height;
        }
    }

    public Double getHeight() {
        return height;
    }

    public Double getVolume (){
        return getArea()*getHeight();
    }
}
