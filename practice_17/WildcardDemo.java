import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();

        ints.add(10);
        ints.add(20);
        numbers.add(100);

        System.out.println("=== extends (чтение) ===");
        printNumbers(ints);
        printNumbers(doubles);
        printNumbers(numbers);

        System.out.println("=== super (запись) ===");
        addNumbers(numbers);
        addNumbers(ints);

        System.out.println("Результат:");
        for (Number n : numbers) {
            System.out.println(n);
        }
        for (Number n : ints) {
            System.out.println(n);
        }
    }

    // Читаем - используем extends
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }

    }

    // Записываем - используем super
    public static void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);

    }
}