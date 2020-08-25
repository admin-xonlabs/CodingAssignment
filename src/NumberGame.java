import java.util.*;

public class NumberGame {
	public static void check(int x[],int input[]) {
		int match=0,close=0,i,j;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(input[i]==x[j]) {
					if(i==j) match++;
					else close++;
				}
			}
		}
		if(match==3) System.out.println("Success");
		else if(match>0 && match<3) {
			for(i=0;i<match;i++)
				System.out.println("Match");
		}
		
		if(close>0) {
			for(i=0;i<close;i++)
				System.out.println("close");
		}
		
		if(match==0 && close==0) System.out.println("None");
	}
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random rand =new Random();
		int[] x =new int[3] ;
		int r ,num,temp,count=0;
		int j=1,attempt=0;
		for(int i=0;i<3;i++) {
			r=rand.nextInt(10);
			if(i==0) x[i]=r;
				
			else if(i==1) {
					if(r!=x[0]) x[i]=r; 
			}
			
			else if(i==2) {
					if(r!=x[0] && r!=x[1]) x[i]=r;
			}
		}
		
		
		
		int input[]=new int[3];
		
		for( j=1;j<=20;j++) {
			
			/*for(int i=0;i<3;i++)
				input[i]=in.nextInt();*/
			num=in.nextInt();
			temp=num;
			while(num > 0)
	        {
	            num = num / 10;
	            count++;
	        }
			int i=2;
			
			while(temp > 0)
	        {
	            input[i] = temp % 10;
	           
	            temp = temp / 10;
	            i--;
	        }
			
			
			
			check(x,input);
			System.out.println("number of attempts:"+j);
		}


	}

}
