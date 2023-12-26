import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {
    String path = "C:/Users/Dell/IdeaProjects/student-database-application/src/TextFile/UserLoginPage.txt";
    File adminLoginFile = new File(path);
    UserData data =new UserData();
    String username,password;
    void userLogin() throws FileNotFoundException {
        int flag =0;
        Scanner inputBufferForUserLogin = new Scanner(adminLoginFile);
        Scanner userLoginPageScanner = new Scanner(System.in);
        System.out.print("Enter your Username :");
        username = userLoginPageScanner.nextLine();
        data.setUsername(username);
        System.out.print("Enter your Password :");
        password = userLoginPageScanner.next();
        data.setPassword(password);
        while (inputBufferForUserLogin.hasNextLine()){
            String line = inputBufferForUserLogin.nextLine();
            String[] fetchData = line.split(" ");
            if(fetchData[0].equals(data.getUsername()) && fetchData[1].equals(data.getPassword())){
                System.out.println("-------Login Successful------");
                 flag = 1;
                break;
            }
        }
        if(flag ==0){
            System.out.println("------Login Failed Try Again Later------");
        }
    }
}
