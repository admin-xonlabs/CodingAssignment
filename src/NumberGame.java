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
						System.out.println("Enter Valid Input");
						System.exit(0);
						return false;
					}
				}
			}
			else 
			{System.out.println("Enter Valid Input");
			System.exit(1);
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
		
		while(true) {
			
			/*Taking input*/
			System.out.println("Enter a 3 digit number:: ");
			String user_number = user_inp.nextLine();
			attempts++;
			int matches = 0, close = 0;
			
			/*Validating input*/
			if(my_game.validate_input(user_number))
			{
				System.out.println("Input = " + user_number + "\nGenerated Number = " + generated_number);
				
				/*Checking the 2 numbers*/
				if(user_number.equals(generated_number)) {System.out.println("\nSuccess!! \nAttempts = " + attempts);user_inp.close();System.exit(3);}
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
