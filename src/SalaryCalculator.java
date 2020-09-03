
public class SalaryCalculator {

	public static double computeInHandSalary(int numberOfWorkedHours, double basePay) {
		double salary = 0;

		 double FlexiblePay=0;
        double Bonus=0;
        double Tax=0;
		if(basePay <=50000) {
			FlexiblePay =(50*basePay)/100;
		}
		else if((basePay > 50000)  && (basePay <=75000)) {
			  FlexiblePay =(60*basePay)/100;
		}
		else if((basePay > 50000)  &&  (basePay<=100000)) {
			  FlexiblePay =(70*basePay)/100;
		}
		else{
			  FlexiblePay =(Math.min(((80*basePay)/100),100000));
		        
		} 
		System.out.println("FlexiblePay="+FlexiblePay);
		if(numberOfWorkedHours<140)
			 Bonus=0;
		else if(numberOfWorkedHours>=140 && numberOfWorkedHours<=160)
			 Bonus=2000;
		else if(numberOfWorkedHours>160 && numberOfWorkedHours<=180)
			Bonus=2000+((numberOfWorkedHours-160)*((5*basePay)/100));
		else if(numberOfWorkedHours>180 && numberOfWorkedHours<=200)
		    Bonus=2000+(20*((5*basePay)/100))+((numberOfWorkedHours-180)*((10*basePay)/100));	
		else
			Bonus=2000+(20*((5*basePay)/100))+(20*((10*basePay)/100))+((numberOfWorkedHours-200)*((15*basePay)/100));
		  
		System.out.println("bonus="+Bonus);
		double Amount = basePay+FlexiblePay+Bonus;
		System.out.println("Amount:"+Amount);
		if(Amount <=50000)
		   Tax = 0;
		else if(Amount>50000 && Amount <= 75000 )
			Tax = 25000*0.05;
		else if(Amount>75000 && Amount <= 100000)
			Tax=(25000*0.05)+( 25000*0.075);
		else if(Amount>100000 && Amount <= 150000)
			Tax= (25000*0.05)+( 25000*0.075)+(50000*0.1);
		else if(Amount>150000 && Amount <= 300000)
			Tax= (25000*0.05)+( 25000*0.075)+(50000*0.1)+(150000*0.2);
		else 
			Tax= (25000*0.05)+( 25000*0.075)+(50000*0.1)+(150000*0.2)+((Amount-300000)*0.3);
		System.out.println("Tax:"+Tax);
		salary=Amount-Tax;
	

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
