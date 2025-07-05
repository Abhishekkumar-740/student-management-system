package O1_StudentManagementSystem;

import java.util.Scanner;

public class O3_Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to first project! ");


        Scanner sc=new Scanner(System.in);

        O4_studentdaointerface dao=new O5_studentDao();

        System.out.println("Welcome to Student Management application");
        while(true){
            System.out.println("\n1.Add Student" +
                    "\n2.Show All Students+" +
                    "\n3.Get student based on roll number+" +
                    "\n4.Delete Student"+
                    "\n5.Update Student" +
                    "\n6.Exit");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Add Student");
                    System.out.println("Enter student name");
                    String name=sc.next();
                    System.out.println("Enter age");
                    int age=sc.nextInt();
                    System.out.println("Enter student clg name");
                    String clgName=sc.next();
                    System.out.println("Enter marks");
                    double marks=sc.nextDouble();
                    O1_student st=new O1_student(name, age, clgName, marks);
                    boolean ans=dao.insertStudent(st);
                    if(ans)
                        System.out.println("Record inserted Successfully!!!");
                    else
                        System.out.println("something went wrong, please try again");

                    break;
                case 2:
                    System.out.println("Show all students ");
                    dao.showAllStudent();

                    break;
                case 3:
                    System.out.println("Get student based on rollnumber");
                    System.out.println("enter roll number");
                    int roll=sc.nextInt();
                    boolean f=  dao.showStudentById(roll);
                    if(!f)
                        System.out.println("Student with this id is not available in our system");

                    break;
                case 4:
                    System.out.println("Delete Student");
                    System.out.println("enter roll number to delete");
                    int rollnum=sc.nextInt();
                    boolean ff=dao.delete(rollnum);
                    if(ff)
                        System.out.println("Record deleted successfully...");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 5:
                    System.out.println("Update the student");
                    System.out.println("\n1.Update name\n2.Update clgName");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1){
                        System.out.println("enter roll number");
                        int rnum=sc.nextInt();
                        System.out.println("Enter new name");
                        String sname=sc.next();
                        O1_student std=new O1_student();
                        std.setName(sname);
                        boolean flag=  dao.update(rnum,sname,choice,std);
                        if(flag)
                            System.out.println("Name updated successfully");
                        else
                            System.out.println("Something went wrong...");
                    }
                    break;
                case 6:
                    System.out.println("Thank You fro using Student management application!!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
            }
        }


    }


}
