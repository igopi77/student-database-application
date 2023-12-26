public class SearchStudent extends ViewAllStudent {
    void searchStudent(String key) {
        while (inputBufferStudent.hasNextLine()) {
            String line = inputBufferStudent.nextLine();
            String[] fetchDataStudent = line.split(" ");

            if (fetchDataStudent[1].equals(key)) {
                System.out.println(
                        "Student RollNo :" + fetchDataStudent[0] + "\n" +
                                "Student Name :" + fetchDataStudent[1] + "\n" +
                                "Programming Skills :" + fetchDataStudent[2] + "\n" +
                                "Department :" + fetchDataStudent[3] + "\n" +
                                "Year :" + fetchDataStudent[4]
                );
                System.out.println("\n \n \n");
            }
        }
    }
}
