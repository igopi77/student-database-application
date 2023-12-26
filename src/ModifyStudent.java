import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ModifyStudent {
    void modifyStudent() throws FileNotFoundException {
        String path ="C:/Users/Dell/IdeaProjects/student-database-application/src/TextFile/StudentDatabase.txt";
        File studentDatabaseFile = new File(path);
        Scanner inputBufferStudent = new Scanner(studentDatabaseFile);
        String rollNoToModify;
        Scanner modifyStudentScanner = new Scanner(System.in);
        System.out.print("Enter the ROLL NO TO Modify: ");
        rollNoToModify = modifyStudentScanner.next();
        List<String> lines = new ArrayList<>();
        while(inputBufferStudent.hasNextLine()){
            String line = inputBufferStudent.nextLine();
            lines.add(line);
        }
        for(int i=0;i<lines.size();i++){
            String line = lines.get(i);
            String[] fetchData = line.split(" ");
            if(fetchData.length>=2 && fetchData[0].equals(rollNoToModify)){
                String name,skill,dept,year;
                System.out.print("Enter Name (If you are not going to edit this Type (NO) ) :");
                name = modifyStudentScanner.next();
                if(Objects.equals(name, "NO")){name =fetchData[1]; }
                System.out.print("Enter Programming skills (If you are not going to edit this Type (NO) ) :");
                skill = modifyStudentScanner.next();
                if(Objects.equals(skill, "NO")){skill = fetchData[2]; }
                System.out.print("Enter Dept (If you are not going to edit this Type (NO) ) :");
                dept = modifyStudentScanner.next();
                if(Objects.equals(dept, "NO")){dept =fetchData[3]; }
                System.out.print("Enter year (If you are not going to edit this Type (NO) ) :");
                year = modifyStudentScanner.next();
                if(Objects.equals(year, "NO")){year=fetchData[4]; }
                String modifiedLine = fetchData[0] + " "+name+" "+skill+" "+dept+" "+year;
                lines.set(i,modifiedLine);
                System.out.println("Student with roll no :"+fetchData[0] +" Modified successfully");
                break;
            }
        }
        try (PrintWriter writer = new PrintWriter(new FileWriter(studentDatabaseFile))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
