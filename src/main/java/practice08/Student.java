package practice08;

public class Student extends Person {

    private Klass klass;
    private int id;

    public Student(String name,  int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(int id, String name,  int age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.id = id;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(klass.getLeader() !=null){
            if(klass.getLeader().getName() == super.getName()){
                return "My name is "+ super.getName() +'.' + " I am " + super.getAge() + " years old. I am a Student. I am Leader of "+  klass.getDisplayName() + ".";
            }
        }

        return "My name is "+ super.getName() +'.' + " I am " + super.getAge() + " years old. I am a Student. I am at "+  klass.getDisplayName() + ".";
    }
}
