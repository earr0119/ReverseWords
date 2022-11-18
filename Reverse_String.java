package reverse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reverse_String {
    static Scanner in = new Scanner(System.in);
    static String answer = "";

	public static void main(String[] args) {
		String words = "";
        boolean words_Num = false;

       do{
           do  {
               System.out.println("Write the words You would like to Reverse: ");
               words = in.nextLine().toUpperCase();
               if(words.length() >= 5 && words.length() <= 25){
                   words_Num = true;
               }
               else
               {
                   System.out.println("The Words length must be between 5 and 25 character");
                   words_Num = false;
               }
           } while (!words_Num);

           for (int i = words.length()-1; i >= 0; i--) {
               System.out.print(words.charAt(i));
           }
           System.out.println("");


           do{
               try {
                   questionRepeat(answer);

               } catch(InputMismatchException myMistake){
                   System.out.println("Invalid Option");
               }
           }while(!answer.equalsIgnoreCase("Yes"));

       }while(answer.equalsIgnoreCase("Yes"));
    }

	
    private static void questionRepeat(String answer) throws InputMismatchException{
        System.out.println("Would You like to Reverse Anothers Words? (Yes / No)");
        Reverse_String.answer = in.nextLine();
        if (Reverse_String.answer.equalsIgnoreCase("Yes"))
            System.out.println("Great, Let's Start Again");
        else if (Reverse_String.answer.equalsIgnoreCase("No"))
            System.out.println("Thank You For Playing");
        else{
            throw new InputMismatchException("You Must Type a Valid Option");
        }
    }	
}
