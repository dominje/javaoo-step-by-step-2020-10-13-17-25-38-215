package practice07;

public class Klass {

    private int number;
    private Student studentName;


    public Student getStudentName() {
        return studentName;
    }

    public Klass(int klass) {
        this.number = klass;
    }

    public Klass(Student studentName) {
        this.studentName = studentName;
    }
    

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

}
