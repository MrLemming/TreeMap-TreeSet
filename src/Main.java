import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Михаил", "Салтыков-Щедрин", 63));
        persons.add(new Person("Алексей", "Новиков-Прибой", 67));
        persons.add(new Person("Антуан де", "Сент-Экзюпери", 44));
        persons.add(new Person("Гарриет", "Бичер-Стоу", 85));
        persons.add(new Person("Максим", "Горький", 68));
        persons.add(new Person("Дмитрий", "Мамин-Сибиряк", 60));
        persons.add(new Person("Габриэль", "Гарсиа Маркес", 87));
        persons.add(new Person("Шарль Мари Рене", "Леконт де Лиль", 75));
        persons.add(new Person("Михаил", "Булгаков", 48));

        persons.sort((o1, o2) -> {
            if (Math.min(o1.getWordsInTheSurname(), 2) != Math.min(o2.getWordsInTheSurname(), 2)) {
                return Integer.compare(o2.getWordsInTheSurname(), o1.getWordsInTheSurname());
            }
            return Integer.compare(o2.getAge(), o1.getAge());
        });
        System.out.println(persons);
    }
}

