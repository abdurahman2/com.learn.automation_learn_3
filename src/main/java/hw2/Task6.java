package hw2;

public class Task6 {
       /*
6.	How does a program destroy an object that it creates?

2.7. Garbage collection
    Java (and JVM in particular) uses automatic garbage collection. To put it simply, whenever new objects are created,
    the memory is automatically allocated for them. Consequently, whenever the objects are not referenced anymore,
    they are destroyed and their memory is reclaimed.

    Java garbage collection is generational and is based on assumption that most objects die young (not referenced
    anymore shortly after their creation and as such can be destroyed safely). Most developers used to believe that
    objects creation in Java is slow and instantiation of the new objects should be avoided as much as possible. In
    fact, it does not hold true: the objects creation in Java is quite cheap and fast. What is expensive though is
    an unnecessary creation of long-lived objects which eventually may fill up old generation and cause stop-the-world
    garbage collection.

2.7. Вывоз мусора
Java (и, в частности, JVM) использует автоматическую сборку мусора. Проще говоря, всякий раз, когда создаются новые
объекты, для них автоматически выделяется память. Следовательно, всякий раз, когда на объекты больше не ссылаются,
они уничтожаются, а их память восстанавливается.

Сборка мусора Java является поколенческой и основана на предположении, что большинство объектов умирают молодыми
(больше не упоминаются вскоре после их создания и как таковые могут быть безопасно уничтожены). Большинство
разработчиков считали, что создание объектов в Java происходит медленно, и следует по возможности избегать создания
экземпляров новых объектов. На самом деле это не так: создание объектов на Java довольно дешево и быстро. Однако
дорого обходится ненужное создание долгоживущих объектов, которые в конечном итоге могут заполнить старое поколение
и вызвать остановку сборки мусора.
*/
}