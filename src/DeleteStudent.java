import java.util.ArrayList;
import java.util.List;

public class DeleteStudent extends ViewAllStudent {
    void deleteStudent(){
        String rollNOToDelete;
        List<String> lines = new ArrayList<>();
        while(inputBufferStudent.hasNextLine()){
            String line = inputBufferStudent.nextLine();
            lines.add(line);
        }
        for(int i=0;i<lines.size();i++){
            String line = lines.get(i);
            String[] fetchData = line.split(" ");
            if()

        }
    }
}
