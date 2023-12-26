import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteStudent  {
    void deleteStudent() throws FileNotFoundException {
        String path ="C:/Users/Dell/IdeaProjects/student-database-application/src/TextFile/StudentDatabase.txt";
        File studentDatabaseFile = new File(path);
        Scanner inputBufferStudent = new Scanner(studentDatabaseFile);
        String rollNoToDelete;
        Scanner deleteStudentScanner = new Scanner(System.in);
        System.out.print("Enter the ROLL NO to delete :");
        rollNoToDelete = deleteStudentScanner.next();
        List<String> linesFromFile = new ArrayList<>();
        while(inputBufferStudent.hasNextLine()){
            String line = inputBufferStudent.nextLine();
            linesFromFile.add(line);
        }
        for(int i=0;i<linesFromFile.size();i++){
            String line = linesFromFile.get(i);
            String[] fetchData = line.split(" ");
            if(fetchData.length>=2 && fetchData[0].equals(rollNoToDelete)){
                linesFromFile.remove(i);
                System.out.println("Student with RollNo " + rollNoToDelete + " deleted successfully!");
                break;
            }
        }
        try (PrintWriter writer = new PrintWriter(new FileWriter(studentDatabaseFile))) {
            for (String line : linesFromFile) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
