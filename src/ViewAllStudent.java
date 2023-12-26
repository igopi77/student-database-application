import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewAllStudent {
    static String path ="C:/Users/Dell/IdeaProjects/student-database-application/src/TextFile/StudentDatabase.txt";
    static File studentDatabaseFile = new File(path);
    static Scanner inputBufferStudent;

    static {
        try {
            inputBufferStudent = new Scanner(studentDatabaseFile);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    void viewAllStudent() throws FileNotFoundException {
        System.out.println("------STUDENT DETAILS------");
        Scanner inputBufferStudent = new Scanner(studentDatabaseFile);
        while(inputBufferStudent.hasNextLine()){
            String line = inputBufferStudent.nextLine();
            String[] fetchData = line.split(" ");
            System.out.println(
                    "Student RollNo :"+fetchData[0]+"\n" +
                    "Student Name :"+fetchData[1]+"\n" +
                    "Programming Skills :"+fetchData[2]+"\n" +
                    "Department :"+fetchData[3]+"\n" +
                    "Year :"+fetchData[4]
            );
        }
    }
}
