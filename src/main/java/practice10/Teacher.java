package practice10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private Klass klass;
    private int id;
    private List<Klass> listKlass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = new Klass(0);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.id = id;

    }

    public Teacher(int id, String name, int age, LinkedList <Klass> linkedList) {
        super(name, age);
        this.klass = klass;
        this.id = id;
        this.listKlass = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(listKlass!= null){
            return super.introduce() + " I am a Teacher. I teach Class " + getClasses().stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")) + ".";
        }else if (klass == null || klass.getNumber() == 0) {
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
    }

    public List<Klass> getClasses() {
        return listKlass;
    }

//    public boolean isTeaching(Student student) {
//        boolean checkTeacher = getClasses().stream().map(Klass::getDisplayName).anyMatch(classNo -> classNo.equals(student.getKlass().getNumber()));
//        if (checkTeacher) {
//            return true;
//        }
//            return false;
//
//    }
}
