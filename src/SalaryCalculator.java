
public class SalaryCalculator {

	public static double computeInHandSalary(int numberOfWorkedHours, double basePay) {
		double salary = 0;
		double FlexiblePay = 0,bonus = 0, tax = 0,rem = 0,amount = 0;
		/ Your Logic goes here
		if(basePay <= 50000)
		{
			FlexiblePay = basePay * 0.5;
		}
		else if(basePay>50000 && basePay <=75000)
		{
			FlexiblePay = basePay * 0.6;
		}
		else if(basePay>75000 && basePay <=100000)
		{
			FlexiblePay = basePay * 0.7;
		}
		else
		{
			double a= basePay * 0.8;
			FlexiblePay = Math.min(a, 100000);
		}
			
		

		
		if(numberOfWorkedHours < 140)
		{
		    bonus = 0;
		}
		else if(numberOfWorkedHours >140 && numberOfWorkedHours <=160)
		{
			bonus = 2000;
		}
		else if(numberOfWorkedHours >160 && numberOfWorkedHours <=180)
		{
			rem = numberOfWorkedHours-160;
			bonus = 2000 + rem* (basePay * 0.05);	
		}
		else if(numberOfWorkedHours >180 && numberOfWorkedHours <=200)
		{
			rem = numberOfWorkedHours-180;
			bonus = 2000 + 20*(basePay * 0.05) + rem*(basePay * 0.10);	
		}
		else
		{
			rem = numberOfWorkedHours-200;
			bonus = 2000 + 20*(basePay * 0.05) + 20*(basePay * 0.10)+rem*(basePay * 0.15) ;	
		}
			


		
		amount= basePay+FlexiblePay+bonus;
		
		if(amount<=50000)
		{
		tax = 0;
		}
		else if(amount>50000 && amount<=75000)
		{
			tax = amount * 0.05;
		}
		else if(amount>75000 && amount <=100000)
		{
			tax = amount * 0.075;
		}
		else if(amount > 100000 && amount <=150000)
		{
			tax = amount * 0.1;
		}
		else if(amount > 150000 && amount <=30000)
		{
			tax = amount * 0.2;
		}
		else
		{
			tax = amount * 0.3;
		}
			
			
		salary = basePay+FlexiblePay+bonus-tax;
		return salary;
	}

	public static void main(String[] args) {

		System.out.println(computeInHandSalary(80, 150000));
		System.out.println(computeInHandSalary(160, 200000));
		System.out.println(computeInHandSalary(175, 300000));
		System.out.println(computeInHandSalary(200, 180000));
		System.out.println(computeInHandSalary(220, 140000));
		System.out.println(computeInHandSalary(240, 190000));

	}

}
