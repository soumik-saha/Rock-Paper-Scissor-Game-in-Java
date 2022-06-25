package Exercise;
import java.util.Scanner;
import java.util.Random;
//import java.util.Timer;
public class RockPaperScissor {
    public static void main(String[] args) {
        char user, pc;
        int result;
        Random random = new Random();
        int r =  random.nextInt(3);
        System.out.println(r);
        if (r==1){
            pc = 'r';
        }
        else if (r==2){
            pc = 'p';
        }
        else {
            pc = 's';
        }
        Scanner userInput  = new Scanner(System.in);
        System.out.println("Enter\nr for ROCK\ns for SCISSOR\np for PAPER");
        user = userInput.next().charAt(0);
        result = PlayGame(user,pc);
        System.out.println("You have chosen "+user+" & Our PC has chosen "+pc+"\n");
        if (result == 0){
            System.out.println("The Match is Drawn.");
        }
        else if (result == 1) {
            System.out.println("Congrats, You have won the match.");
        }
        else if (result == -1) {
            System.out.println("Oops, You have lost the match.");
        }
    }

    private static int PlayGame(char user, char pc) {
        if (user == pc){
            return 0;
        }
        else if (user == 'r' && pc == 's'){
            return 1;
        }
        else if (user == 'r' && pc == 'p'){
            return -1;
        }
        else if (user == 'p' && pc == 'r'){
            return 1;
        }
        else if (user == 'p' && pc == 's'){
            return -1;
        }
        else if (user == 's' && pc == 'r'){
            return -1;
        }
        else if (user == 's' && pc == 'p'){
            return 1;
        }
        else {
            return 0;
        }
    }
}