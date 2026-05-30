# Enum (перечисления)

## Практика 1: инициализация элементов

Элементам enum можно передавать параметры в конструктор.

enum Planet {<br>
    EARTH(6.0e24, 6.4e6);<br>
    Planet(double mass, double radius) {<br>
        this.mass = mass;<br>
    }<br>
}<br>

## Практика 2: enum с методом

В enum можно объявлять абстрактные методы, которые реализует каждый элемент.

enum Operation {<br>
    SUM { public int apply(int a, int b) { return a + b; } },<br>
    MULTIPLY { public int apply(int a, int b) { return a * b; } };<br>
    public abstract int apply(int a, int b);<br>
}<br>

## Вывод

=== Практика 1: инициализация ===<br>
MERCURY: mass=3.3E23, radius=2400000.0<br>
VENUS: mass=4.9E24, radius=6100000.0<br>
EARTH: mass=6.0E24, radius=6400000.0<br>

=== Практика 2: метод apply ===<br>
2 + 3 = 5<br>
2 * 3 = 6
