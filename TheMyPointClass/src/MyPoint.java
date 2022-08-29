//write a class that represents a point in 2D space, could represent a position, or a direction vector,
//add operations, distance between two points
public class MyPoint {
    public static void main(String[] args) {
        MyPoint1 p1 = new MyPoint1();
        MyPoint1 p2 = new MyPoint1(10, 30.5);
        System.out.println(p1.distance(p2));
        System.out.println(MyPoint1.distance(p1, p2));
    }

}

class MyPoint1 {

    private double x;
    private double y;

    public MyPoint1() {

    }

    public MyPoint1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(MyPoint1 secondPoint) {
        return distance(this, secondPoint);
    }

    public static double distance(MyPoint1 p1, MyPoint1 p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}

//self note, make sure you do not name the classes too similiar to each other
//i used a private member variables here with public getter and setter methods
//used operations that are common for points and directions
//distance between 2 points, could be extended, addition/subtraction, scaling, multiplication,
//length, etc...