/**
 * Класс "Приветствие" для демонстрации Javadoc.
 *
 * Этот класс умеет приветствовать пользователя на разных языках.
 *
 * @author Крылов Лев
 * @version 1.0
 * @since 2026
 */
public class Greeting {

    /**
     * Приветствует пользователя на русском языке.
     *
     * @param name имя пользователя
     * @return строка "Привет, имя!"
     * @author Крылов Лев
     */
    public String sayRussian(String name) {
        return "Привет, " + name + "!";
    }

    /**
     * Приветствует пользователя на английском языке.
     *
     * @param name имя пользователя
     * @return строка "Hello, name!"
     * @author Крылов Лев
     */
    public String sayEnglish(String name) {
        return "Hello, " + name + "!";
    }
}