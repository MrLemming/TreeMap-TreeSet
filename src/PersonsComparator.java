import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {

    private int maxWordsInTheSurname;

    public PersonsComparator(int maxWordsInTheSurname) {
        this.maxWordsInTheSurname = maxWordsInTheSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if ((o1.getWordsInTheSurname() < maxWordsInTheSurname) || (o2.getWordsInTheSurname() < maxWordsInTheSurname)) {
            if (o1.getWordsInTheSurname() < o2.getWordsInTheSurname()) {
                return 1;
            }
            if (o1.getWordsInTheSurname() > o2.getWordsInTheSurname()) {
                return -1;
            }
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}

