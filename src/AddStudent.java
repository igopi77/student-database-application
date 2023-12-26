import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddStudent extends ViewAllStudent{
    void addStudent(){
        String rollNo,name,programmingSkills,dept,year;
        Scanner addStudentScanner = new Scanner(System.in);
        System.out.print("Enter your RollNo: ");
        rollNo = addStudentScanner.next();
        System.out.print("Enter your Name: ");
        name = addStudentScanner.next();
        System.out.print("Enter your programming skills(java,python) in this format: ");
        programmingSkills = addStudentScanner.next();
        System.out.print("Enter your dept: ");
        dept = addStudentScanner.next();
        System.out.print("Enter your year: ");
        year = addStudentScanner.next();
        try (PrintWriter writer = new PrintWriter(new FileWriter(studentDatabaseFile, true))) {
            // Append the new student information to the file
            writer.println(rollNo + " " + name + " " + programmingSkills + " " + dept + " " + year);
            System.out.println("Student added successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    }
