public class Practice3 {
    public static void main(String[] args) {
        A_22 a1 = new A_22();
        A_22 a2 = new A_22(10);
        A_22 a3 = new A_22(10, 20);
        A_22 a4 = new A_22(10, 20, 30);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}

class A_22 {
    int a;
    int b;
    int c;
    int z;

    public A_22() {
        this(0, 0, 0);
    }

    public A_22(int a) {
        this(a, 0, 0);
    }

    public A_22(int a, int b) {
        this(a, b, 0);
    }

    public A_22(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }

    public String toString() {
        return "a=" + a + ", b=" + b + ", c=" + c + ", z=" + z;
    }
}