import java.util.Scanner;

public class GreatCircleDistance {

    public static void main(String[] args) {
        //reading from system.in
        Scanner input = new Scanner (System.in);
//looking for the distance along the surface of the sphere
//instructions for the user
        System.out.print("Enter point 1 (lat and long) in degrees: ");
        //storing in two variables, x1 and y1
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        //storing second point into two variables 

        System.out.print("Enter point 2 (lat and long) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
//using earth as an example here, stroring distance into d
// you need the radius of the sphere, 
        double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
                + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

        System.out.println("The distance between the two points is " + d + "km");       

        
    }
}
