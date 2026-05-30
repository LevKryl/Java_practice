public class OverrideErrorDemo {
    public static void main(String[] args) {
        System.out.println("Этот код не скомпилируется");
    }
}

class Parent_23 {
    int getValue() {
        return 10;
    }
}

class Child_23 extends Parent {
    // Ошибка! Тип возвращаемого значения должен быть int
    // @Override
    // double getValue() {
    //     return 10.5;
    // }
}