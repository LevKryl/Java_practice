
class Animal {}


class Dog extends Animal {}

// InstanceOfPractice.java
public class InstanceOfPractice {
    public static void main(String[] args) {

        // Обычное использование
        Object obj = "Hello";
        System.out.println(obj instanceof String);     // true
        System.out.println(obj instanceof Integer);    // false

        // С иерархией классов
        Animal animal = new Dog();
        System.out.println(animal instanceof Dog);      // true
        System.out.println(animal instanceof Animal);   // true

        // С null - всегда false
        Object nullObj = null;
        System.out.println(nullObj instanceof Object);   // false
        System.out.println(nullObj instanceof String);   // false
    }
}