import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewAllStudent {

    void viewAllStudent() throws FileNotFoundException {
        String path ="C:/Users/Dell/IdeaProjects/student-database-application/src/TextFile/StudentDatabase.txt";
        File studentDatabaseFile = new File(path);
        System.out.println("------STUDENT DETAILS------");
        Scanner inputBufferStudent = new Scanner(studentDatabaseFile);
        while(inputBufferStudent.hasNextLine()){
            String line = inputBufferStudent.nextLine();
            String[] fetchData = line.split(" ");
            if(fetchData.length >=2) {
                System.out.println(
                        "Student RollNo :" + fetchData[0] + "\n" +
                                "Student Name :" + fetchData[1] + "\n" +
                                "Programming Skills :" + fetchData[2] + "\n" +
                                "Department :" + fetchData[3] + "\n" +
                                "Year :" + fetchData[4]
                );
            }
            System.out.println();
        }
    }
}
