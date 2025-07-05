package O1_StudentManagementSystem;

public class O1_student
{
    private int rollNo;
    private String name;
    private int age;
    private String clgName;
    private double marks;

    public O1_student() {
    }

    public O1_student(int rollNo, String name, int age, String clgName, double marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.clgName = clgName;
        this.marks = marks;
    }

    public O1_student(String name, int age, String clgName, double marks)
    {
        this.name = name;
        this.age = age;
        this.clgName = clgName;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }


    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks= marks;
    }

    @Override
    public String toString() {
        return "O1_student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clgName='" + clgName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
