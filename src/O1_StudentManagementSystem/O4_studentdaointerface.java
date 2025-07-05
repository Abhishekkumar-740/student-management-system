package O1_StudentManagementSystem;

public interface O4_studentdaointerface
{
    public boolean insertStudent(O1_student s);
    public boolean delete(int rollNo);
    public boolean update(int rollNo, String update, int ch, O1_student s);
    public void showAllStudent();
    public boolean showStudentById(int rollNo);

}
