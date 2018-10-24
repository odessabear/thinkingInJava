package inheritance;

class Student {
    private String name;

    protected void setName(String newName) {
        name = newName;
    }

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "I am student and my name is " + name;
    }
}

public class StudentInfo extends Student{

    private int group;

    public StudentInfo(String name,int group){
        super(name);
        this.group = group;
    }

    public void setStudentInfo(String name,int group){
        setName(name);
        this.group = group;
    }

    public String toString(){
        return "I am student " + super.toString() + " my group is No " + group;
    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo("Jack",21);
        System.out.println(studentInfo);
        studentInfo.setStudentInfo("Francis",17);
        System.out.println(studentInfo);
    }

}


