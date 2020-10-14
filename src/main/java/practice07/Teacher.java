package practice07;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = new Klass(0);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass.getNumber() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        else if (klass.getStudentName() == null) {
                return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        } else{
            return super.introduce() + " I am a Teacher.";
        }
    }

    public String introduceWith(Student studentName) {
        if(studentName.getKlass().getNumber() == klass.getNumber()){
            return super.introduce() + " I am a Teacher. I teach " + studentName.getName()+".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach " + studentName.getName()+".";
        }
        //this.klass = new Klass(studentName);
    }
}
