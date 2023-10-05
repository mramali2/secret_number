import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args){
//        Set variable for the secret number
        int secret_number = 12;

//        Use scanner to take input of number guess
        Scanner reader = new Scanner(System.in);
        int guess_number = reader.nextInt();

//        Create conditions to decide if the guessed number is too high, too low, or correct
        if(guess_number > secret_number){
            System.out.println("Your guess is too high");
        } else if(guess_number < secret_number){
            System.out.println("Your guess is too low");
        } else{
            System.out.println("Your guess is correct!");
        }
    }
}
