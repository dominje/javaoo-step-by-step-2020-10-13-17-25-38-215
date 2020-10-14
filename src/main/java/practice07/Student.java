package practice07;

public class Student extends Person {

    private Klass klass;

    public Student(String name,  int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return "My name is "+ super.getName() +'.' + " I am " + super.getAge() + " years old. I am a Student. I am at "+  klass.getDisplayName() + ".";
    }
}
