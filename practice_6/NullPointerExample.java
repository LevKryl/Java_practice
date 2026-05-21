public class NullPointerExample {
    public static void main(String[] args) {

        // NullPointerException возникает при распаковке null-объекта
        Integer nullInteger = null;
        int value = nullInteger;  // здесь будет NullPointerException

        // Арифметическая операция тоже вызывает распаковку
        Integer a = null;
        Integer b = 5;
        // int c = a + b;  //здесь тоже будет NullPointerException, если раскомментировать

        // Передача null в метод, где происходит распаковка
        printLength(null);  //  здесь будет NullPointerException
    }

    static void printLength(Integer num) {
        // Распаковка Integer в int
        int len = num;  // если num == null NullPointerException
        System.out.println(len);
    }
}