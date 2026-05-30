# Generics в Java: instanceof, extends и super

## Практика 1: instanceof с generic-типами

Нельзя проверить конкретный параметр типа:
list instanceof List<String>  // ошибка

Можно проверить только сырой тип (raw type):
list instanceof List         // работает

## Практика 2: wildcard (extends и super)

### <? extends T>
- Означает: T или его подкласс
- Используется для чтения
- Нельзя добавлять элементы

### <? super T>
- Означает: T или его суперкласс
- Используется для записи
- Нельзя безопасно читать

## Вывод программы

=== Практика 1: instanceof ===
true
true
true
true

=== Практика 2: extends и super ===
--- extends (чтение) ---
10
20
100

--- super (запись) ---
numbers: 100 100 200 
ints: 10 20 100 200
