package O1_StudentManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class O5_studentDao implements O4_studentdaointerface
{

    @Override
    public boolean insertStudent(O1_student st) {
        boolean flag=false;
        try{
            Connection con= O2_DBConnection.createConnection();
            String query="insert into students(name,age,clgName,marks) value(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,st.getName());
            pst.setInt(2,st.getage());
            pst.setString(3,st.getClgName());
            pst.setDouble(4,st.getMarks());
            pst.executeUpdate();
            flag=true;
            con.close();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delete(int rollNo) {
        boolean flag=false;
        try{
            Connection con= O2_DBConnection.createConnection();
            String query="delete from students where rollNo="+rollNo;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            flag=true;

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(int rollNo, String update, int ch, O1_student s) {
        int choice=ch;
        boolean flag=false;
        try{
            if(choice==1){
                Connection con=O2_DBConnection.createConnection();
                String query="update students set sname=? where rollnum=?";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,update);
                ps.setInt(2,rollNo);
                ps.executeUpdate();
                flag=true;

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    public void showAllStudent() {

        try{
            Connection con=O2_DBConnection.createConnection();
            String query="select * from students";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("RollNumber: "+rs.getInt(1)+"\n" +
                        "Name: "+rs.getString(2)+"\n" +
                        "age: "+rs.getInt(3)+"\n" +
                        "ClgName: "+rs.getString(4)+"\n" +
                        "marks: "+rs.getDouble(5));
                System.out.println("----------------------------------");

            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public boolean showStudentById(int rollNo) {
        boolean flag=false;
        try{

            Connection con=O2_DBConnection.createConnection();
            String query="select * from students where rollNo="+rollNo;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("rollNo: "+rs.getInt(1)+"\n" +
                        "name: "+rs.getString(2)+"\n" +
                        "age: "+rs.getInt(3)+"\n" +
                        "clgName: "+rs.getString(4)+"\n" +
                        "marks+"+rs.getDouble(5));
                //System.out.println("----------------------------------");
                flag=true;

            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return flag;
    }

}
