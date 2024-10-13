import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        letterPosition("Я");

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Игорь", 23, Person.Gender.MALE)) ;
        persons.add(new Person("Нина", 24, Person.Gender.FEMALE));
        persons.add(new Person("Вася", 5, Person.Gender.MALE));
        persons.add(new Person("Маша", 41, Person.Gender.FEMALE));
        persons.add(new Person("Женя", 36, Person.Gender.FEMALE));
        persons.add(new Person("Петя", 27, Person.Gender.MALE));
        persons.add(new Person("Инга", 66, Person.Gender.FEMALE));
        persons.add(new Person("Олег", 22, Person.Gender.MALE));
        persons.add(new Person("Валя", 45, Person.Gender.FEMALE));
        persons.add(new Person("Саша", 12, Person.Gender.MALE));

        System.out.println(listOfSameGender(persons, Person.Gender.MALE));
    }
    private static List<Person> listOfSameGender(List<Person> personList, Person.Gender input) {
        List<Person> persons = new ArrayList<>();
        for (Person person : personList) {
            if (person.gender.equals(input)) {
                persons.add(person);
            }
        }
        return persons;
    }

    private static void letterPosition(String letter) {

        System.out.println("Позиция буквы '" + letter + "' в алфавите - " + (Abc.valueOf(letter).ordinal() + 1));
    }

}

enum Abc {
    А, Б, В, Г, Д, Е, Ё, Ж, З, И, Й, К, Л, М, Н, О, П, Р, С, Т, У, Ф, Х, Ц, Ч, Ш, Щ, Ь, Ы, Ъ, Э, Ю, Я

}