public class BooleanCreation {
    public static void main(String[] args) {

        // 1. Через valueOf()
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);
        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("false");
        Boolean b5 = Boolean.valueOf("TRUE");  // регистр не важен


        // 2. Через parseBoolean() (возвращает примитив)
        boolean b7 = Boolean.parseBoolean("true");

        // 3. Автоупаковка
        Boolean b8 = true;
        Boolean b9 = false;

        // 4. Конструкторы
        Boolean b10 = new Boolean(true);
        Boolean b11 = new Boolean("true");

        // 5. Через getBoolean() - системное свойство
        Boolean b12 = Boolean.getBoolean("java.version");
    }
}