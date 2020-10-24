package Practice;

import java.util.*;

public class Ternary {

    public interface FunctionalInterface {
        void test();
    }

    public interface FunctionalInterfaceTwo {
        void test2(String a, String b, int c, int d, int e, int f);
    }


    public static void main(String[] args) {

        FunctionalInterface functionalInterface = () -> System.out.println("Test");
        functionalInterface.test();

        FunctionalInterfaceTwo functionalInterfaceTwo = (a, b, c, d, e, f) ->
        {
            System.out.println(a + b);
            int sum = sum(c, d);
            System.out.println(sum);
            System.out.println(e * f);
        };
        functionalInterfaceTwo.test2("Eugene ", "Julia ", 28, 23, 3, 2);

    }

    public static int sum(int a, int b) {
        return a + b;
    }


}
