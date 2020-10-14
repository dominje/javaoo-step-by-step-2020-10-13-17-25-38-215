package practice05;

public class Student {

    private int age;
    private int klass;
    private String name;

    public Student(String name, int klass, int age) {
        this.age = age;
        this.klass = klass;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public void setClassNo(int klass) {
        this.klass = klass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String introduce() {
        return "My name is "+ name +'.' + " I am " + age + " years old. I am a Student. I am at Class " + klass + ".";
    }
}
