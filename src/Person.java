public class Person {
    String name;
    int age;
    Gender gender;

    @Override
    public String toString() {
        return '\n' + "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}' ;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    enum Gender{
        MALE,
        FEMALE
    }

}

