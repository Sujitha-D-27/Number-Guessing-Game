import java.util.Scanner;
import java.util.Random;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String play="yes";
        while(play.equals("yes")){
            Random rand=new Random();
            int randnum=rand.nextInt(100);
            int guess=-1;
            int tries=0;
            while(guess != randnum){
                System.out.print("Guess a number between 1 and 100:");
                guess=sc.nextInt();
                tries++;
                if(guess==randnum){
                    System.out.println("Awesome!!!You guessed the number!");
                    System.out.println("It only took you"+tries+"guesses!");
                    System.out.println("Would you like to play again?:");
                    play=sc.next.toLowerCase();
                }
                else if(guess>randnum){
                    System.out.println("Your guess is too high.Try again!!!");
                }
                else{
                    System.out.println("Your guess is too low.Try again!!!");
                }
            }
            sc.close();
        }
        
    }
}