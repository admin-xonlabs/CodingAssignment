import java.util.Arrays;
import java.util.Random;
import java.util.*;
public class NumberGame {

	public static void main(String[] args) {
            int[] solution = numberGenerator();
            Scanner sc =new Scanner(System.in);
            int i=0;
            
            
            System.out.println("------------------------------------------------------------------");
            System.out.println("WELCOME");
            System.out.println("------------------------------------------------------------------");
            System.out.println("RULES FOR PLAYING THE GAME");
            System.out.println("------------------------------------------------------------------");
            System.out.println("1. Guess a 3 digit Unique number \n"
            		+ "2. For each input you will be given hints MATCH, CLOSE, NONE\n"
            		+ "3. MATCH: if the digits match and are in correct positions.\n"
            		+ "4. CLOSE: if the digits match but are in different positions\n"
            		+ "5. NONE: if no digits match");
            
            System.out.println("Enter Your Guess:");
            while(true) 
            {
            	i++;
            	int j = 0, guess;
            	try 
            	{
            		int[] arr = new int[3];
            		String in = sc.next();
            		int num = in.length();
            		guess = Integer.parseInt(in);
        	    
            		if(num != 3)
	            	{
	            		System.out.println("Invalid: Please Enter a 3 Digit Unique Number");
	            		System.out.println("SECRET CODE WAS "+Arrays.toString(solution));
	            		System.exit(0);
	            	}
	            	else 
	            	{
	            		while(guess != 0)
		                {
		                	arr[3-j-1] = guess%10;
		                	guess=guess/10;
		                	j++;
		                }
	                }
            	 
            		if(num != 3)
	            	{
	            		System.out.println("Invalid: Please Enter a 3 Digit Unique Number");
	            		System.out.println("SECRET CODE WAS "+Arrays.toString(solution));
	            		System.exit(0);
	            	}
        
	                if(arr[1]==arr[2] || arr[0]==arr[1] || arr[0]==arr[2])
	                {
		            	System.out.println("Please Enter a non-Duplicate number");
		            	System.out.println("SECRET CODE WAS "+Arrays.toString(solution));
		            	System.exit(0);
	                }
         
	                if(solution[0]==arr[0])
		            {
		            	System.out.println("MATCH");
		            }
		            if(solution[1]==arr[1])
		            {
		            	System.out.println("MATCH");
		            }
		            if(solution[2]==arr[2])
		            {
		            	System.out.println("MATCH");
		            }
		            if(solution[0]==arr[1] || solution[0]==arr[2])
		            {
		            	System.out.println("CLOSE");
		            }
		            if(solution[1]==arr[0] || solution[1]==arr[2])
		            {
		            	System.out.println("CLOSE");
		            }
		            if(solution[2]==arr[0] || solution[2]==arr[1])
		            {
		            	System.out.println("CLOSE");
		            }
            
	            
		            if(solution[0]!=arr[0]&&solution[0]!=arr[1]&&solution[0]!=arr[2]&&
		            	solution[1]!=arr[0]&&solution[1]!=arr[1]&&solution[1]!=arr[2]&&
		            	solution[2]!=arr[0]&&solution[2]!=arr[1]&&solution[2]!=arr[2])
	            	{
		            	System.out.println("NONE");
	            		
	            	}
		            if(solution[0]==arr[0]&&solution[1]==arr[1]&&solution[2]==arr[2])
		            {
		            	System.out.println("Contributed by CODEBREWERS");
				System.out.println("Congragulations!!! YOU WON");
		            	System.out.println("SECRET CODE WAS "+Arrays.toString(solution));
		            	System.out.println("Total number of Attempts = " + i); 
		            	System.exit(0);
		            }
            	} 
            	catch( Exception e) 
            	{
		          	System.out.println("Please Enter a Valid Number");
		      		System.exit(0);	
            	}
         
            }
	}
  public static int[] numberGenerator() 
	  {
	      Random randy = new Random();//Generating the Secret code.
	      int[] randArray = new int[3];

	      int a = randy.nextInt(9);
	      int b = randy.nextInt(9);
	      int c = randy.nextInt(9);
	      
	      while (b == a) 
	      {
	            b = randy.nextInt(9);
	      }

	      while (c == a || c == b) 
	      {
	            c = randy.nextInt(9);
	      }
	     
	      randArray[0] = a;
	      randArray[1] = b;
	      randArray[2] = c;
	      //System.out.println(Arrays.toString(randArray));
	      return randArray;
	     
	  }
	//THIS CODE IS CONTIRIBUTED BY CODEBREWERS
}
