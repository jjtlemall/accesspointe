//here, i will demonstrate how polymorphism and dynamic binding operates. THe object type is
//not known until run time. I created super classes and had extensions of those main subjects

public class DynamicBindingDemo {

    public static void main(String[] args) {

        Object o = new GraduateStudent();

        Object o1 = new Object();

        if (o1 instanceof GraduateStudent) {
            System.out.println("Never got here");
            GraduateStudent gs = (GraduateStudent)  o1;
        }

        m(o);
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {

}

class Student extends Person {
    public String toString() {
        return "Student";
    }
}

class Person extends Object {
    public String toString() {
        return "Person";
    }
}

//In this program, i created four types of objects
//Each class implemented a 'toString' method
//Passed objects to a method and the method accepted 'Object' as a parameter, the actual type not known
//until run time