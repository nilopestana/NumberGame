import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        boolean hasWon = false;
        int numberRamdon = (int) (Math.random() * 100) +1;
        System.out.println("I have ramdonly chosen a number between 1 and 100.");
        System.out.println("Try to guess.");
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--){
            System.out.println("Choose:");
            int guess = scanner.nextInt();
            if (guess == numberRamdon){
                hasWon = true;
                break;
            }
            if (guess < numberRamdon){
                System.out.println("The number is Bigger!");
            }else {
                System.out.println("The number is smaller!");
            }
            System.out.print("You have "+(i - 1)+" guess(es) left. ");

        }
        if (hasWon){
            System .out.println("You Win!");
        }else {
            System.out.println("You Lose!");
        }
    }
}
