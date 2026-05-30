import java.util.ArrayList;
import java.util.List;

public class InstanceOfDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        System.out.println(strings instanceof List);
        System.out.println(integers instanceof List);

        if (strings instanceof List) {
            System.out.println("strings is a List");
        }

        Wrapper<String> ws = new Wrapper<>();
        Wrapper<Integer> wi = new Wrapper<>();

        System.out.println(ws instanceof Wrapper);
        System.out.println(wi instanceof Wrapper);
    }
}

class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}