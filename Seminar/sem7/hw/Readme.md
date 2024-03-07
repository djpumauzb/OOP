> # **Применение принципов SOLID к разработанному проекту калькулятора вещественных чисел на Python**

### S — Single Responsibility Principle (Принцип единственной ответственности)

Каждый класс в проекте выполняет строго определенную функцию:

* **Классы операций** (`AddOperation`, `MultiplyOperation`, `DivideOperation`) отвечают только за выполнение конкретной арифметической операции.
* **Класс `Calculator`** отвечает за логику калькулятора, делегируя выполнение операций соответствующим классам операций.
* **Модуль `main.py`** служит точкой входа в программу, демонстрируя использование калькулятора без вмешательства в его внутреннюю логику.

### O — Open/Closed Principle (Принцип открытости/закрытости)

Класс `Calculator` открыт для расширения, но закрыт для изменений:

* Можно легко добавить новую операцию, создав класс, реализующий интерфейс `Operator`, и добавив его в словарь операций в классе `Calculator` без изменения существующего кода.

### L — Liskov Substitution Principle (Принцип подстановки Барбары Лисков)

Классы операций могут быть взаимозаменяемы в контексте их использования классом `Calculator`, так как все они реализуют интерфейс `Operator`. Это означает, что класс `Calculator` может использовать любую операцию, реализующую интерфейс `Operator`, без знания о конкретной реализации.

### I — Interface Segregation Principle (Принцип разделения интерфейса)

Интерфейс `Operator` максимально узко специализирован и содержит только один метод `execute`. Это предотвращает необходимость для классов операций реализовывать ненужные методы, делая интерфейс легким для имплементации.

### D — Dependency Inversion Principle (Принцип инверсии зависимостей)

Класс `Calculator` зависит от абстракций (интерфейса `Operator`), а не от конкретных реализаций (`AddOperation`, `MultiplyOperation`, `DivideOperation`). Это упрощает замену или добавление новых операций, так как `Calculator` не связан напрямую с конкретными классами операций.

*Применение этих принципов в проекте калькулятора не только делает код более чистым и легким для понимания, но и облегчает его дальнейшее расширение и поддержку, предоставляя четкую структуру и избегая жесткой связанности компонентов.*