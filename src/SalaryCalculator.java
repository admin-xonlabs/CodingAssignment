
public class SalaryCalculator {

	public static double computeInHandSalary(int numberOfWorkedHours, double basePay) {
		double salary = 0;

		// Your Logic goes here
		double flexiblePay = 0 ,bonus = 0 ,tax = 0;
		//Calculating Flexible Pay
		if(basePay <= 50000)
		{
			flexiblePay = (basePay * 50)/100;
			//System.out.println(flexiblePay);
		}
		if(basePay > 50000 && basePay <=75000)
		{
			flexiblePay = (basePay * 60)/100;
			//System.out.println(flexiblePay);
		}
		if(basePay > 75000 && basePay <= 100000)
		{
			flexiblePay = (basePay * 70)/100;
			//System.out.println(flexiblePay);
		}
		if(basePay > 100000)
		{
			flexiblePay = Math.min((basePay * 80)/100 , 100000);
			//System.out.println(flexiblePay);
		}
		
		//Caculating Bonus
		if(numberOfWorkedHours < 140)
		{
			bonus = 0;
			//System.out.println(bonus);
		}
		if(numberOfWorkedHours >= 140 && numberOfWorkedHours <=160)
		{
			bonus = 2000;
			//System.out.println(bonus);
		}
		if(numberOfWorkedHours > 160 && numberOfWorkedHours <=180)
		{
			bonus = 2000 + ((numberOfWorkedHours-160) * ((basePay * 5)/100));
			//System.out.println(bonus);
		}
		if(numberOfWorkedHours > 180 && numberOfWorkedHours <=200)
		{
			bonus = 2000 + ((numberOfWorkedHours-160) * ((basePay * 5)/100)) + ((numberOfWorkedHours-180) * ((basePay * 10)/100));
			//System.out.println(bonus);
		}
		if(numberOfWorkedHours > 180)
		{
			bonus = 2000 + ((numberOfWorkedHours-160) * ((basePay * 5)/100)) + ((numberOfWorkedHours-180) * ((basePay * 10)/100)) + ((numberOfWorkedHours-200) * ((basePay * 15)/100));
			//System.out.println(bonus);
		}
		
		double a = basePay + flexiblePay + bonus;
		//System.out.println(a);
		//Calculating Tax
		if(a < 50000)
		{
			tax = 0;
			//System.out.println(tax);
		}
		if(a > 50000 && a <= 75000)
		{
			tax = ((75000-a) * 5)/100;
			//System.out.println(tax);
		}
		if(a > 75000 && a <= 100000)
		{
			tax = 1250 + ((100000-a) * 7.5)/100;
			//System.out.println(tax);
		}
		if(a > 100000 && a <= 150000)
		{
			tax = 1250 + 1875 + ((150000-a) * 10)/100;
			//System.out.println(tax);
		}
		if(a > 150000 && a <= 300000)
		{
			tax = 1250 + 1875 + 5000 + ((300000-a) * 20)/100;
			//System.out.println(tax);
		}
		if(a > 300000)
		{
			tax = 1250 + 1875 + 5000 + 30000 + ((a - 300000) * 30)/100;
			//System.out.println(tax);
		}
		salary = a - tax;
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
