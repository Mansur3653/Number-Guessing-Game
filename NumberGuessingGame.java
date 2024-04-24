import java.util.*;
class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int maxRange = 100;
        int attempts = 0;
        int randnum = random.nextInt(maxRange);
        System.out.println("Welcome to Number Guessing Game......!");
        System.out.println("I have selected a number between 1 and "+maxRange+" . Try to guess it!");
        boolean hasGuessedCorrect = true;
        while(hasGuessedCorrect)
        {
            System.out.print("Enter your Guess : ");
            int guess = sc.nextInt();
            if(guess == randnum)
            {
                System.out.println("Congratulations! You have guessed the number "+randnum+" correctly in "+attempts+" attempts...");
                hasGuessedCorrect = false;
            }
            else if(guess < randnum)
            {
                System.out.println("The correct number should be higher than "+guess+" number. Try again...!");
                attempts++;
            }
            else
            {
                System.out.println("The correct number should be lower than "+guess+" number. Try again...!");
                attempts++;
            }
        }
    }
}