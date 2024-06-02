import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int stop = 0;
        System.out.println("Welcome to the Student Database Application");
        System.out.println("\t \t ADMIN LOGIN \t \t");
        UserLogin userLoginObj = new UserLogin();
        int check = userLoginObj.userLogin();
        Scanner mainScanner = new Scanner(System.in);
        if (check == 1){
            while (stop != 1) {
                System.out.println(
                        "\n \n \n 1. VIEW ALL STUDENT " + "            " + "2. MODIFY STUDENT DETAILS \n" +
                                "3. SEARCH BY NAME" + "            " + "4. FILTER BY LANGUAGE \n" +
                                "5. ADD STUDENT" + "            " + "6.DELETE STUDENT \n" +
                                "7. SORT STUDENT" + "            " + "8. STATISTICS \n" +
                                "            " + "9.EXIT :)");
                int choice;
                System.out.print("Enter your choice :");
                choice = mainScanner.nextInt();
                LoopToContinue loop = new LoopToContinue();
                switch (choice) {
                    case 1:
                        ViewAllStudent viewAllStudentObj = new ViewAllStudent();
                        viewAllStudentObj.viewAllStudent();
                        stop = loop.loopForContinue();
                        break;
                    case 2:
                        System.out.println("------MODIFY STUDENT DETAILS------");
                        ModifyStudent modifyStudentObj = new ModifyStudent();
                        modifyStudentObj.modifyStudent();
                        stop = loop.loopForContinue();
                        break;

                    case 3:
                        System.out.println("------SEARCH STUDENT BY NAME------");
                        SearchStudent searchStudentByNameObj = new SearchStudent();
                        String name;
                        System.out.print("Enter the name to Search :");
                        name = mainScanner.next();
                        searchStudentByNameObj.searchStudent(name);
                        System.out.println();
                        stop = loop.loopForContinue();
                        break;
                    case 4:
                        System.out.println("------FILTER STUDENT BY PROGRAMMING LANGUAGE------");
                        FilterByProgrammingLanguage filterByProgrammingLanguageObj = new FilterByProgrammingLanguage();
                        String dept;
                        Scanner lan = new Scanner(System.in);
                        System.out.print("Enter the Programming language to Search :");
                        dept = lan.nextLine();
                        filterByProgrammingLanguageObj.filterByProgrammingLanguage(dept);
                        System.out.println();
                        stop = loop.loopForContinue();
                        break;

                    case 5:
                        System.out.println("------ADD STUDENT------");
                        AddStudent addStudentObj = new AddStudent();
                        addStudentObj.addStudent();
                        stop = loop.loopForContinue();
                        break;
                    case 6:
                        System.out.println("------DELETE STUDENT------");
                        DeleteStudent deleteStudentObj = new DeleteStudent();
                        deleteStudentObj.deleteStudent();
                        stop = loop.loopForContinue();
                        break;

                    case 7:
                        System.out.println("------SORTING STUDENT------");
                        SortStudent sortStudentObj = new SortStudent();
                        sortStudentObj.sortStudent();
                        System.out.println();
                        stop = loop.loopForContinue();
                        break;
                    case 8:
                        System.out.println("------STATISTICS------");
                        Statistics statisticsObj = new Statistics();
                        statisticsObj.statisticsOfStudent();
                        stop = loop.loopForContinue();
                        break;

                    case 9:
                        stop = 1;
                        break;
                }
            }
    }
    else{
        System.out.println("Check your password .... See you later :) ");
        }
    }
}