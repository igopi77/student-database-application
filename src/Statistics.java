import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {
    void statisticsOfStudent() throws FileNotFoundException {
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


        System.out.println("Total no of student :" + lines.size());
        Set<String> studentData = new LinkedHashSet<String>();
        StringBuilder temp= new StringBuilder();


        for(String line : lines){
            String[] fetchData = line.split(" ");
            String[] programmingLanguage = fetchData[2].split(",");
            for(String i:programmingLanguage){
                temp.append(" ").append(i);
            }
        }


        String[] fetchData = temp.toString().split(" ");
        for(String i:fetchData){
            studentData.add(i);
        }

        System.out.println("Most Chosen Language by student :" + studentData);
        String highKnownStudent = lines.get(0);
        String[] fetchDataHigh = highKnownStudent.split(" ");
        String lowKnownStudent = lines.get(lines.size() - 1);
        String[] fetchDataLow = lowKnownStudent.split(" ");
        String highName = null,highLanguage = null,highNo = null,lowName = null,lowLanguage = null,lowNo = null;
        if(fetchDataHigh.length>=1) {
           highName = fetchDataHigh[1];
        }
        if(fetchDataHigh.length>=2){
            highLanguage = fetchDataHigh[2];
        }
        if(fetchDataHigh.length>=5){
            highNo = fetchDataHigh[5];
        }
        System.out.println("------Highest number Programming language known student------\n" + highName + "\nLanguages Know:" +
                    highLanguage + "\nNo of languages Known : " + highNo);
        if(fetchDataLow.length>=1) {
            lowName = fetchDataLow[1];
        }
        if(fetchDataLow.length>=2){
            lowLanguage = fetchDataLow[2];
        }
        if(fetchDataLow.length>=5){
            lowNo = fetchDataLow[5];
        }
            System.out.println("------Lowest number Programming language known student------\n" + lowName + "\nLanguages Know:" +
                    lowLanguage + "\nNo of languages Known : " + lowNo);

    }
}
