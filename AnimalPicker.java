package AnimalPicker;

import java.util.Scanner;

public class AnimalPicker 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        boolean validInput = false;

        while(validInput == false)
        {
            System.out.println("Would you like to see a dog or cat?");
            String animalChoice = input.next();

            if(animalChoice.equalsIgnoreCase("dog"))
            {
                System.out.println("DOG ASCII ART HERE");
                validInput = true;
            }
            else if(animalChoice.equalsIgnoreCase("cat"))
            {
                System.out.println("CAT ASCII ART HERE");
                validInput = true;
            }
            else
            {
                System.out.println("Error: Invalid Option");
            }
        }
    }
}
