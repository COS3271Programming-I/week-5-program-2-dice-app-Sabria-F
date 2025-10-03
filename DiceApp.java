import java.util.Scanner;
public class DiceApp {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException{

        //Define a string called userchoice to store the user's choice.
        String userchoice = "r";

        //While the user types in capital or lowercase r continue executing the loop.
        while (userchoice.equalsIgnoreCase ("r")) {

            //Prompt the user to enter what they want to do.
            System.out.print("To roll the two dice type r or R. To exit the program type anything else --> ");
            userchoice = userinput.nextLine();

            //Add some space for formatting purposes.
            System.out.println("\n");

            //Add a 200 millisecond pause for dramatic effect.
            Thread.sleep(200);

            //Radomly choose a integer between 1 and 6 and set it equal to die 1.
            int die1 = (int)(Math.random()*6)+1;

            //Same thing, but this time we set it equal to die 2.
            int die2 = (int)(Math.random()*6)+1;
            

            //Print the values to both dice.
            System.out.println("The value of the first di is: "+ die1);
            System.out.println("The value of the second di is: "+ die2);

            //Print the sum of the dice.
            System.out.println("The sum of the two is: "+(die1+die2));

            //Again, adding space for formatting purposes.
            System.out.println("\n");

        }

        //If the user chooses any thing beside r or R then tell the user that the program is ending.
        System.out.println("\nProgram ending...");

        //Space for formatting purposes.
        System.out.println("\n");



    }


}
