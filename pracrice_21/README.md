# final методы и классы

## final метод

Метод с final нельзя переопределить в подклассе.

class Parent {
    public final void print() { }
}

class Child extends Parent {
    // void print() { } // ОШИБКА!
}

## final класс

От final класса нельзя наследовать.

final class FinalClass { }
// class Sub extends FinalClass { } // ОШИБКА!
