import java.util.Scanner;

public class LoopToContinue {
    String userOpinion;
    int loopForContinue(){
        while (true) {
            Scanner loopScanner = new Scanner(System.in);
            System.out.print("Do you want to continue? (yes/no) : " );
            userOpinion = loopScanner.next();
            if (userOpinion.equals("yes")) {
                return 0;
            } else if (userOpinion.equals("no")) {
                break;
            } else {
                System.out.print("Check you spelling \n");
            }
        }
        return 1;
    }
}
