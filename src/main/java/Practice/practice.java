package Practice;

class A {
    private int x = 5;

    public A() {
        System.out.println(this.getClass().getName());
        System.out.println("Class A");
    }

    public A(int x) {
        this.x = x;
    }

}

class B extends A {

    public B() {
        System.out.println(this.getClass().getName());
        System.out.println("Class B");
    }
}

public class practice {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println();
        A a = new A();
        System.out.println();
        System.out.println("B");
        B b = new B();
    }

}
