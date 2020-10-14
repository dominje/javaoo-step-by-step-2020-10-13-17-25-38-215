package practice09;

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

    public void assignLeader(Student studentName) {
        if(studentName.getKlass().number != number){
            System.out.print("It is not one of us.\n");
        }
        this.studentName = studentName;
    }

    public Student getLeader() {
        return studentName;
    }

    public void appendMember(Student studentName) {
    }
}
