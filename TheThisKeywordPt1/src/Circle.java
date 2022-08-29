//Here, I will use the 'this' keyword to access data fields, to refer to the instance members, methods,
//and constructors in a class, and lastly to compare instance members of two objects
public class Circle {
    public double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        //return this.radius * this.radius * Math.PI;
        return radius * radius * Math.PI;
    }

    public String toString() {
       //return "radius: " + this.radius + "area: " + this.getArea();
        return "radius: " + radius + "area: " +  getArea();
    }
}
