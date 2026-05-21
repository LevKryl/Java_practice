public class DecodePractice {
    public static void main(String[] args) {
        // decode() преобразует строку в Integer, понимая разные системы счисления

        Integer dec = Integer.decode("123");      // десятичная - 123
        Integer hex = Integer.decode("0xFF");     // шестнадцатеричная - 255
        Integer hex2 = Integer.decode("#FF");     // шестнадцатеричная - 255
        Integer oct = Integer.decode("077");      // восьмеричная - 63
        Integer negative = Integer.decode("-123"); // отрицательное - (-123)

        System.out.println(dec);      // 123
        System.out.println(hex);      // 255
        System.out.println(oct);      // 63
        System.out.println(negative); // -123
    }
}