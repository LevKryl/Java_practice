public class A_14 {
    public final int a;

    public A_14() {
        a = 10;
    }

    public A_14(int value) {
        a = value;
    }
}

class Test {
    public static void main(String[] args) {
        A_14 obj1 = new A_14();
        A_14 obj2 = new A_14(25);

        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}