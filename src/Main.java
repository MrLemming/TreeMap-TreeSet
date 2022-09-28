import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Михаил", "Салтыков-Щедрин", 63));
        persons.add(new Person("Алексей", "Новиков-Прибой", 67));
        persons.add(new Person("Антуан де", "Сент-Экзюпери", 44));
        persons.add(new Person("Гарриет", "Бичер-Стоу", 85));
        persons.add(new Person("Максим", "Горький", 68));
        persons.add(new Person("Изабель", "Харрис", 14));
        persons.add(new Person("Дмитрий", "Мамин-Сибиряк", 60));
        persons.add(new Person("Габриэль", "Гарсиа Маркес", 87));
        persons.add(new Person("Шарль Мари Рене", "Леконт де Лиль", 75));
        persons.add(new Person("Михаил", "Булгаков", 48));
        persons.add(new Person("Ритай", "Аль-Хазми", 14));

        Predicate<Person> pr1 = age -> age.getAge() < 18;
        persons.removeIf(pr1);
        persons.sort(new PersonsComparator(2));
        System.out.println(persons);

    }
}
