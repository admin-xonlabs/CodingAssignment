import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberGame {

	public class play_game 
	{
		/*Using Arraylist to generate distinct 3 digit numbers*/
		String generate_rand_number() 
		{
			String rand_number = "";
			ArrayList<Integer> list = new ArrayList<Integer>();
	        
			for(int i=1; i<10; i++) {list.add(new Integer(i));}
	        Collections.shuffle(list);
	        for(int i=0; i<3; i++) {rand_number = rand_number + list.get(i);}
	        
			return rand_number;
		}
		
		/*Checking if length of input is 3 and if they are all numbers.*/
		Boolean validate_input(String user_number)
		{
			if (user_number.length() == 3)
			{
				char[] chars = user_number.toCharArray();
				for(char c : chars) 
				{
					if (Character.isDigit(c)) {;}
					else 
					{
						System.out.println("Please Enter Valid Input");
						System.exit(1);
						return false;
					}
				}
				
				for (int i = 0; i < user_number.length(); i++) {
		            for (int j = i + 1; j < user_number.length(); j++) {
		                if (user_number.charAt(i) == user_number.charAt(j)) {
		                	System.out.println("Input number must be unique");
		                	//System.exit(0);
		                	return false; }
		            }
				}
			}
			else 
			{
			System.out.println("Please Enter Valid Input");
			System.exit(2);
			return false;
			}
			return true;
		}
	}
	public static void main(String[] args) {

		/*Creating objects and initializing variables.*/
		NumberGame game = new NumberGame();
		play_game my_game = game.new play_game();
		String generated_number = my_game.generate_rand_number();
		Scanner user_inp = new Scanner(System.in);
		int attempts = 0;
		String menu = "The computer will generate a number, you will have to guess it according to the clues given.\n";
		String clues = "Clues: \nCLOSE - Correct number, wrong position.\nNONE - Wrong number, wrong position\nMATCH - Correct number, correct position\n";
		String rules = "Rules: \n1. Enter a 3 digit number\n2. If invalid input is given, game will end.\n**(Example for invalid inputs are letters, length of input not equal to 3)**\n";
		
		System.out.println("Team Name: CodeBlooded.\n");
		System.out.println(menu + clues + rules);
		
		while(true) {
			
			/*Taking input*/
			System.out.println("Enter a 3 digit number:: ");
			String user_number = user_inp.nextLine();
			attempts++;
			int matches = 0, close = 0;
			
			/*Validating input*/
			if(my_game.validate_input(user_number))
			{
				
				/*Checking the 2 numbers*/
				if(user_number.equals(generated_number)) {System.out.println("\nSuccess!! Generated Number = " + generated_number + "\nAttempts = " + attempts);user_inp.close();System.exit(3);}
				char[] user_number_char = user_number.toCharArray();
				
				for (char c : user_number_char)
				{
					if(generated_number.contains(String.valueOf(c)) && user_number.indexOf(c) == generated_number.indexOf(c)) {matches++;}
					else if(generated_number.contains(String.valueOf(c))) {close++;}
				}
				
				if(matches != 0 || close !=0)
				{
					for(int count=0;count<matches;count++) {System.out.println("MATCH");}
					for(int count=0;count<close;count++) {System.out.println("CLOSE");}
				}
				else {System.out.println("NONE");}
			} //END IF
		} //END WHILE
	}

}
