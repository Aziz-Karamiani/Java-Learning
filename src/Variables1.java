import java.awt.*;

public class Variables1 {
    public static void main(String[] args) {
        /*
        Variables in Java are classified into primitive and reference variables. From the programmer's perspective,
         a primitive variable's information is stored as the value of that variable, whereas a reference variable holds
          a reference to information related to that variable
         */
        System.out.println("Primitive Variables");
        int a = 21;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);

        System.out.println("reference Variables");
        String str = "Hello World";
        System.out.println(str);
        Point pointA = new Point(10, 10);
        Point pointB = new Point(20, 20);
        System.out.println("PointA = " + pointA);
        System.out.println("PointB = " + pointB);
    }
}
