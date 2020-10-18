package practice10;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private int id;
    private List<Klass> listKlass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    public Teacher(int id, String name, int age, LinkedList <Klass> linkedList) {
        super(name, age);
        this.id = id;
        this.listKlass = linkedList;
    }

    public List<Klass> getClasses() {
        return listKlass;
    }

    public String introduce() {
        if(Objects.nonNull(listKlass)){
            return super.introduce() + " I am a Teacher. I teach Class " + getClasses().stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")) + ".";
        }else{
            if(Objects.isNull(listKlass)) {
                return super.introduce() + " I am a Teacher. I teach No Class.";
            }
            return super.introduce() + " I am a Teacher.";
        }

    }

    public String introduceWith(Student studentName) {
        boolean checkTeacher = getClasses().stream().map(Klass::getNumber).anyMatch(classNo ->
                classNo.equals(studentName.getKlass().getNumber()));
        if(checkTeacher){
            return super.introduce() + " I am a Teacher. I teach " + studentName.getName()+".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach " + studentName.getName()+".";
        }
    }

    public boolean isTeaching(Student student) {
        boolean checkTeacher = getClasses().stream().map(Klass::getNumber).anyMatch(classNo ->
                classNo.equals(student.getKlass().getNumber()));
        if (checkTeacher) {
            return true;
        } else{
            return false;
        }
    }
}
