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
            System.out.println("Would you like to see a dog, cat, fish, bear, or bat?");
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
            else if(animalChoice.equalsIgnoreCase("fish"))
            {
                System.out.println("      /`·.¸\n     /¸...¸`:·\n ¸.·´  ¸   `·.¸.·´)\n: © ):´;      ¸  {\n `·.¸ `·  ¸.·´\\`·¸)\n     `\\\\´´\\¸.·´");
                validInput = true;
            }
            else if(animalChoice.equalsIgnoreCase("bear"))
            {
                System.out.println(" __         __\n/  \\.-\"\"\"-./  \\\n\\    -   -    /\n |   o   o   |\n \\  .-\'\'\'-.  /\n  \'-\\__Y__/-\'\n     `---`");
                validInput = true;
            }
            else if(animalChoice.equalsIgnoreCase("bat"))
            {
                System.out.println("    =/\\                 /\\=\n    / \\\'._   (\\_/)   _.\'/ \\n   / .\'\'._\'--(o.o)--\'_.\'\'. \\\n  /.\' _/ |`\'=/ \" \\=\'`| \\_ `.\\\n /` .\' `\\;-,\'\\___/\',-;/` \'. \'\\\n/.-\'       `\\(-V-)/`       `-.\\\n\"`            \"   \"            `\"");
                validInput = true;
            }
            else
            {
                System.out.println("Error: Invalid Option");
            }
        }
    }
}
