public class CircleDriver {

    public static void main(String[] args) {
        Circle circleOne = new Circle();
        Circle circleTwo = new Circle();

        circleOne.setRadius(30);
        circleTwo.setRadius(50);

        System.out.println(circleOne.getRadius());
        System.out.println(circleTwo.getRadius());

        System.out.println(circleOne.getArea());
        System.out.println(circleTwo.getArea());

        System.out.println(circleOne);
        System.out.println(circleTwo);
    }

}
