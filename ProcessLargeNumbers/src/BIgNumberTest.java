//here, i will be investigating the BigInteger and BigDecimal classes and how we can represent them
//and manipulate the numbers of arbitrary size and precision.
import java.math.BigDecimal;
import java.math.BigInteger;
public class BIgNumberTest {

    public static void main(String[] args) {
        long someNumber= Long.MAX_VALUE;

        System.out.println(someNumber);

       BigInteger a = new BigInteger("9223372036854775807");
       BigInteger b = new BigInteger("2");
       BigInteger c = a.multiply(b);

       System.out.println(a + " * " + b + " = " + c);

       BigDecimal d = new BigDecimal("1.0");
       BigDecimal e = new BigDecimal("3");
       System.out.println(d.divide(e,100, BigDecimal.ROUND_UP));

    }
}
//BigInteger can store an integer of any size. BigDecimal can store a real number of arbitrary
//size and precision. Classes provide methods for manipulating numbers similar to the arithmetic operations
//available for primitive types.