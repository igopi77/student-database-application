public class FilterByProgrammingLanguage extends ViewAllStudent{
    void filterByProgrammingLanguage(String key) {
        while (inputBufferStudent.hasNextLine()) {
            String line = inputBufferStudent.nextLine();
            String[] fetchDataStudent = line.split(" ");
            String[] fetchDataLanguage = fetchDataStudent[2].split(",");

            if (containsLanguage(fetchDataLanguage, key)) {
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
    private boolean containsLanguage(String[] languages, String key) {
        for (String language : languages) {
            if (language.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
