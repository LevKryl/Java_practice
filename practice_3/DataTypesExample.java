// Практика #1: Примеры всех типов данных
public class DataTypesExample {
    // Члены класса (автоматически получают нулевые значения)
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    public static void main(String[] args) {
        DataTypesExample obj = new DataTypesExample();

        System.out.println("=== Практика #1: Нулевые значения членов класса ===");
        System.out.println("byte: " + obj.byteValue);
        System.out.println("short: " + obj.shortValue);
        System.out.println("int: " + obj.intValue);
        System.out.println("long: " + obj.longValue);
        System.out.println("float: " + obj.floatValue);
        System.out.println("double: " + obj.doubleValue);
        System.out.println("char: " + (int)obj.charValue);
        System.out.println("boolean: " + obj.booleanValue);

        System.out.println("\nЯвная инициализация:");
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 1000000L;
        float f = 3.14f;
        double d = 3.1415926535;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Практика #2: Вывод имени в Unicode
        System.out.println("\n=== Практика #2: Имя в Unicode ===");
        System.out.println("\u041B\u0435\u0432");

        // Практика #3: Ошибка компиляции
        System.out.println("\n=== Практика #3: Ошибка компиляции ===");
        System.out.println("int a = 1;");
        System.out.println("{ int b = 2; }");
        System.out.println("int c = a + b; // ОШИБКА! b не видна вне блока");
        System.out.println("Результат: переменная b объявлена внутри блока {} и недоступна снаружи");

        // Практика #4: Перегруженный оператор + с String
        System.out.println("\n=== Практика #4: Конкатенация строк ===");
        String name = "Лев";
        int age = 20;
        double height = 175.5;
        System.out.println("Привет, " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Рост: " + height);
        System.out.println("Сумма: " + (10 + 20));
        System.out.println("Конкатенация: " + 10 + 20);

        // Практика #5: Арифметика с разными типами
        System.out.println("\n=== Практика #5: Арифметические операции ===");
        byte b1 = 10;
        short s1 = 20;
        int i1 = b1 + s1;
        System.out.println("byte(10) + short(20) = int(" + i1 + ")");

        float f1 = 5.5f;
        int i2 = 10;
        float f2 = f1 + i2;
        System.out.println("float(5.5) + int(10) = float(" + f2 + ")");

        double d1 = 3.14;
        int i3 = 2;
        double d2 = d1 * i3;
        System.out.println("double(3.14) * int(2) = double(" + d2 + ")");

        // Практика #6: Сужающее преобразование
        System.out.println("\n=== Практика #6: Сужающее преобразование ===");
        int largeInt = 300;
        byte smallByte = (byte) largeInt;
        System.out.println("int 300 -> byte: " + smallByte + " (потеря данных из-за переполнения)");

        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("double 3.14159 -> int: " + intPi + " (дробная часть отброшена)");

        long bigLong = 10000000000L;
        int smallInt = (int) bigLong;
        System.out.println("long 10000000000 -> int: " + smallInt + " (переполнение)");

        // Практика #7: Преобразование с byte
        System.out.println("\n=== Практика #7: Преобразование byte ===");
        int a = 120;
        // byte b2 = a + 10; // ОШИБКА! int не может быть автоматически преобразован в byte
        byte c2 = (byte)(a + 10);
        // byte d2 = a + 1; // ОШИБКА! int не может быть автоматически преобразован в byte
        byte c3 = (byte)(a + 1);

        System.out.println("int a = 120;");
        System.out.println("byte b = a + 10; // ОШИБКА компиляции");
        System.out.println("byte c = (byte)(a + 10) = " + c2);
        System.out.println("byte d = a + 1; // ОШИБКА компиляции");
        System.out.println("byte d = (byte)(a + 1) = " + c3);
        System.out.println("Объяснение: a + 10 = 130, что выходит за пределы byte (-128 до 127)");
        System.out.println("130 в byte: 130 - 256 = -126");

        // Практика #8: Type inference (var)
        System.out.println("\n=== Практика #8: Type inference (var) ===");
        var number = 42;
        var text = "Привет, мир!";
        var decimal = 3.14;
        var flag = true;
        var letter = 'A';

        System.out.println("var number = 42 -> тип int: " + number);
        System.out.println("var text = \"Привет, мир!\" -> тип String: " + text);
        System.out.println("var decimal = 3.14 -> тип double: " + decimal);
        System.out.println("var flag = true -> тип boolean: " + flag);
        System.out.println("var letter = 'A' -> тип char: " + letter);
    }
}
