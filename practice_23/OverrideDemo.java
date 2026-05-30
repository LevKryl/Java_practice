public class OverrideDemo {
    public static void main(String[] args) {
        Animal_23 a = new Dog_23();
        a.sound();
    }
}

class Animal_23 {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog_23 extends Animal_23 {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}