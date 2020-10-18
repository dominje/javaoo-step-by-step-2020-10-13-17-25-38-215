package practice09;

public class Person {

    private String name;
    private int age;
    private int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) { return true; }
        if (!(o instanceof Person)) { return false; }

        Person c = (Person) o;

        return Double.compare(id, c.id) == 0
                && name.equals(c.name)
                && Double.compare(age, c.age) == 0;
    }
}
