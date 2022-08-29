//i am using the BMI class here to compute the BMI for a person-representing the design with UML
//and demonstrating the advantages of class over static methods
public class BMI {

    private String name;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    private int age;
    private double weight; //in pounds
    private double height; //in inches

    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height* METERS_PER_INCH));
        return Math.round(bmi*100) / 100.00;
    }

    public String getStatus() {
        double bmi = getBMI();

        if(bmi < 16)
            return "Seriously underweight";
        else if (bmi < 18)
            return "Underweight";
        else if (bmi < 24)
            return "Normal weight";
        else if (bmi<29)
            return "Over weight";
        else if (bmi < 35)
            return "Seriously Overweight";
        else
            return "Gravely overweight";
    }
}
