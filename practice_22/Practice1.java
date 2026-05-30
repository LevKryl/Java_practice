public class Practice1 {
    public static void main(String[] args) {
        Child_22 obj = new Child_22();
        obj.show();
    }
}

class Parent_22 {
    int x = 10;

    Parent_22() {
        System.out.println("Конструктор Parent");
    }

    void print() {
        System.out.println("Метод Parent");
    }
}

class Child_22 extends Parent_22 {
    int x = 20;

    Child_22() {
        super();
        System.out.println("Конструктор Child");
    }

    void show() {
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
        super.print();
    }
}