**Практика 4**
для 128:
a1==i1 true
b1==i1 true
a1==b1 false
a1.equals(i1) true
b1.equals(i1) true
a1.equals(b1) true

Для 127:
a2==i2 true
b2==i2 true
a2==b2 true
a2.equals(i2) true
b2.equals(i2) true
a2.equals(b2) true

Объяснение:

a1==i1 и b1==i1 всегда true, потому что Integer распаковывается в int, сравниваются числа.

a1==b1 для 128 false, для 127 true. Причина: IntegerCache кэширует объекты от 128 до 127. Для 127 из кэша возвращается тот же объект, для 128 создаются новые объекты.

equals всегда true, потому что сравнивает значения, а не ссылки.
IntegerCache нужен для экономии памяти и оптимизации, переиспользует часто встречающиеся числа.

