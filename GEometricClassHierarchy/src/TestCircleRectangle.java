//this is our test class
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle4 circle = new Circle4(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle1 rectangle = new Rectangle1(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The parameter is " + rectangle.getParameter());

    }
}


//in this program, i created a class hierarchy for geometric objects
//all classes extended from a superclass
//superclass contains code that is common to all subclasses
//Rectangle class; width, height, calculate area, calculate parameter
//Circle class; radius, calculate area, calculate diameter, calculate parameter