//here, were going to look at string objects in futher detail eg, replacing strings, splitting strings,
//comparisons using regular expressions, converting to arrays, converting numeric values to strings

public class MoreStrings {
    public static void main(String[] args) {

        String s1 = "Welcome to Java. ";
        String s2 = new String("Programming is fun");
        String s3 = "Java Java Java";
//replace method
        System.out.println(s1.replace('e', '!'));
        System.out.println(s3.replaceFirst("Java", "Micheal"));
        System.out.println(s3.replaceAll("Java", "Micheal"));

 //matches method
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));

        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));

        String s4 = 12 + "";
        System.out.println(s4);

        char[] chars = s2.toCharArray();
        for (int i=0; i<chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
//we used regular expressions here, for future reference, read up on regular expressions!!
