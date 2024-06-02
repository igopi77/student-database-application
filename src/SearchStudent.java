import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchStudent{
    void searchStudent(String key) throws FileNotFoundException {
        String path ="C:/Users/Dell/IdeaProjects/student-database-application/src/TextFile/StudentDatabase.txt";
        File studentDatabaseFile = new File(path);
        Scanner inputBufferStudent = new Scanner(studentDatabaseFile);
        while (inputBufferStudent.hasNextLine()) {
            String line = inputBufferStudent.nextLine();
            String[] fetchDataStudent = line.split(" ");

            if (fetchDataStudent.length >=2 && fetchDataStudent[1].equals(key)) {
                System.out.println(
                        "Student RollNo :" + fetchDataStudent[0] + "\n" +
                                "Student Name :" + fetchDataStudent[1] + "\n" +
                                "Programming Skills :" + fetchDataStudent[2] + "\n" +
                                "Department :" + fetchDataStudent[3] + "\n" +
                                "Year :" + fetchDataStudent[4]
                );
                System.out.println();
            }
        }
    }
}
