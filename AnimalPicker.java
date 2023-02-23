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
                System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
                validInput = true;
            }
            else if(animalChoice.equalsIgnoreCase("cat"))
            {
                System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-\n");
                validInput = true;
            }
            else
            {
                System.out.println("Error: Invalid Option");
            }
        }
    }
}
