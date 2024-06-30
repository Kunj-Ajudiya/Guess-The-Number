import java.util.Random;
import java.util.Scanner;
class game {
   private int Cinput, Uinput,NoOfGuesses=0;
    public game() {
        Random random = new Random(); 
        Cinput = random.nextInt(10);
        // System.out.println(Cinput);
    }
    public void takeuserinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number (0 to 9):");
        Uinput = sc.nextInt();
    }
    public void iscorrectnumber() {
        if (Uinput<=9 && Uinput >=0) {
            while (Cinput!=Uinput) {
                ++NoOfGuesses;
                takeuserinput();
            }
        }
        else{
            System.out.println("Invalid Input!!!");
        }
        }
        public void NoOfGuesses() {
            if (Cinput==Uinput) {
                System.out.format("Your Input is %d : \nComputer Input is %d : \n", Uinput, Cinput);
                System.out.print("No Of Guesses : " + NoOfGuesses);
            }
    }
}
public class exercise_3 {
    public static void main(String[] args) {
        //guess the number
        game g = new game();
        g.takeuserinput();
        g.iscorrectnumber();
        g.NoOfGuesses();
    }
}
