public class OperatorsPractice {
    public static void main(String[] args) {

        // Арифметические
        int a = 10, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // String конкатенация
        String s1 = "Hello", s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        s1 += " World";
        System.out.println(s1);

        // Сравнение
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Логические
        boolean t = true, f = false;
        System.out.println(t && f);
        System.out.println(t || f);
        System.out.println(!t);
        System.out.println(t ^ f);

        // Поразрядные и сдвиги
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);
        System.out.println(a << 1);

        // Тернарный
        int max = (a > b) ? a : b;
        System.out.println(max);

        // Инкремент/декремент
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        // Составное присваивание
        x += 5; System.out.println(x);
        x -= 3; System.out.println(x);
        x *= 2; System.out.println(x);
        x /= 4; System.out.println(x);
        x %= 3; System.out.println(x);
    }
}