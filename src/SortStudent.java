import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortStudent {

    void sortStudent() throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        String path = "C:/Users/Dell/IdeaProjects/student-database-application/src/TextFile/StudentDatabase.txt";
        File studentDatabaseFile = new File(path);
        Scanner inputBufferStudent = new Scanner(studentDatabaseFile);
        while(inputBufferStudent.hasNextLine()) {
            String line = inputBufferStudent.nextLine();
            String[] fetchData = line.split(" ");
            String[] programmingSkill = new String[0];
            if (fetchData.length >= 2) {
                programmingSkill = fetchData[2].split(",");
            }
            int size = programmingSkill.length;
            line = line + " " + size;
            lines.add(line);
        }
        for(int i=0;i<lines.size();i++){
            for(int j=i+1;j<lines.size();j++) {
                String line = lines.get(i);
                String[] fetchData = line.split(" ");
                String line2;
                line2 = lines.get(j);
                String[] fetchData2 = line2.split(" ");
                int size1 = 0;
                int size2 = 0;
                if (fetchData.length >= 5 && fetchData2.length >= 5) {
                    size1 = Integer.parseInt(fetchData[5]);

                    size2 = Integer.parseInt(fetchData2[5]);
                }
                if (size1 < size2) {
                    String temp = lines.get(i);
                    lines.set(i, lines.get(j));
                    lines.set(j, temp);
                }
            }
        }

        System.out.println("Sorting Students......");

        for(String sortedStudent : lines){
            String[] fetchData = sortedStudent.split(" ");
            if(fetchData.length>=4 ) {
                System.out.println(
                        "Student RollNo :" + fetchData[0] + "\n" +
                                "Student Name :" + fetchData[1] + "\n" +
                                "Programming Skills :" + fetchData[2] + "\n" +
                                "Department :" + fetchData[3] + "\n" +
                                "Year :" + fetchData[4]
                );
            }
        }
    }
}
