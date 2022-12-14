# **Коллекции TreeMap и TreeSet.**

Перед Вами программа с помощью которая позволяет сравнить людей по принципу знатности:

* У кого больше слов в фамилии, тот более знатен. При этом есть максимальное количество слов в фамилии, которое имеет смысл при сравнении. Т.е. если обе фамилии состоят из количества слов не меньше чем это значение, то обе фамилии равнозначны;
* Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше.

В классе ```Person``` описан человек: созданы поля name (имя человека), surname (его фамилия), age (его возраст) и wordsInTheSurname (количество слов в фамилии), создан конструктор ```Person```, который содержит данные поля. Созданы методы get(), set() и toString().

В классе ```PersonsComparator``` создан одноименный конструктор ```PersonsComparator```, в котором указывается максимальное количество слов в фамилии имеющее смысл при сравнении. Также тут создан компаратор ```compare(Person o1, Person o2)```.

В классе ```Main``` создан список из нескольких людей, и произведена его сортировка с помощью компаратора: ```persons.sort()```.
