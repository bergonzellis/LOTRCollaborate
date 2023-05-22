import java.util.Scanner;

public class LOTRAdventureGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Lord of the Rings Adventure Game!");
        System.out.println("You are Frodo Baggins on a quest to destroy the One Ring.");
        System.out.println("You find yourself in the Shire.");

        while (true)
        {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Go on an adventure");
            System.out.println("2. Quit the game");

            int choice = scanner.nextInt();

            if (choice == 1) 
            {
                goOnAdventure();
            } 
            else if (choice == 2) 
            {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            } 
            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void goOnAdventure() 
    {
        System.out.println("\nYou set out on an adventure!");

        // Simulating a random encounter
        boolean isEnemyEncountered = Math.random() < 0.5;

        if (isEnemyEncountered) 
        {
            System.out.println("You encounter an enemy!");
            System.out.println("What do you want to do?");
            System.out.println("1. Fight");
            System.out.println("2. Run away");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 1) 
            {
                System.out.println("You fight bravely but are overpowered. Game over!");
            } 
            else if (choice == 2) 
            {
                System.out.println("You run away and live to fight another day.");
            } 
            else 
            {
                System.out.println("Invalid choice. You hesitate and the enemy attacks. Game over!");
            }
        } 
        else 
        {
            System.out.println("You have a peaceful journey and move closer to Mordor.");
        }
    }
}
