package numberPuzzle;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		 Scanner keysIn = new Scanner(System.in);

			   for (int x =1; x>0; x++)
			//Infinite loop to be exited when user quits
			   {
			   System.out.println("I'm thinking of a number between 1 and 1000.");
			   System.out.println("What is it?");
			   int num = (int) (Math.random()*1000+1);
			//Generate Random number between 1 and 100      
			   while(true)
			   {
			     int num2 = keysIn.nextInt();
			// initialize the variable num2 and set it to next integer input
			     System.out.println("Guess:" + num2);

			     if (num == num2) 
			//If the generated number is equal to the guess
			     {
			       System.out.println("You go it!");
			       System.out.println("Play Again? (Y = 1/N = 0)");
			       Scanner scan = new Scanner(System.in);
			       int desc = scan.nextInt();
			//Make a new scanner and take the "descion" input whether to continue or quit (1 or 0)           
			       if(desc != 0){
			       break;
			//If the input is not 0 break the loop and play perform actions again           
			       }
			       else{
			         System.out.println("Thanks for playing");
			         continue;
			  //If the input is 0 break the loop and continue the program post-loop             

			     }  
			     }
			     else if(num > num2){
			     System.out.println("Too Low.");
			//If the number generated is greater than the guessed number print "Too Low"        
			     }
			     else if (num <num2){
			     System.out.println("Too High.");
			  //If the number generated is less than the guessed number print "Too High"         
			     }
			   }
			}
			}
			}
	
	


