**ПРАКТИКА 1**
// Пример 1: условие всегда true
while (true) {
    System.out.println("Этот цикл никогда не остановится");
}

// Пример 2: условие на основе константы
boolean alwaysTrue = true;
while (alwaysTrue) {
    System.out.println("Бесконечный цикл");
}

// Пример 1: условие всегда true
do {
    System.out.println("Выполнится хотя бы раз, потом бесконечно");
} while (true);


**ПРАКТИКА 2**
// Поиск первого четного числа в массиве
int[] numbers = {1, 3, 5, 8, 10, 11};
for (int num : numbers) {
    if (num % 2 == 0) {
        System.out.println("Найдено первое четное число: " + num);
        break; // прерываем цикл после нахождения
    }
    System.out.println("Проверяем: " + num + " - нечетное");
}

// Выводим только нечетные числа от 1 до 10
int counter = 0;
while (counter < 10) {
    counter++;
    if (counter % 2 == 0) {
        continue; // пропускаем вывод четных чисел
    }
    System.out.print(counter + " "); // Вывод: 1 3 5 7 9
}
