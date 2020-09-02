public class SalaryCalculator {

	public static double computeInHandSalary(int numberOfWorkedHours, double basePay) {
		double salary = 0;

		// Your Logic goes here
                 double flexiblepay = 0,bonus = 0,tax = 0;
          if(basePay<=50000)
        	  flexiblepay = 0.5*basePay;
          else if((basePay > 50000) && (basePay <= 75000))
        	  flexiblepay = 0.6*basePay;
          else if((basePay > 75000) && (basePay <= 100000))
        	  flexiblepay = 0.7*basePay;
          else
        	  flexiblepay = Math.min(0.8*basePay,100000);
          salary = salary+basePay+flexiblepay;

          if(numberOfWorkedHours<140)
        	  bonus = 0;
          else if((numberOfWorkedHours >= 140) && (numberOfWorkedHours < 160))
        	  bonus = 2000;
          else if((numberOfWorkedHours >= 160) && (numberOfWorkedHours < 180))
        	  bonus = 2000+(numberOfWorkedHours-160)*0.05*basePay;
          else if((numberOfWorkedHours>=180) && (numberOfWorkedHours<200))
        	  bonus = 2000+20*0.05*basePay+(numberOfWorkedHours-180)*0.1*basePay;
          else
        	  bonus = 2000+20*0.05*basePay+20*0.1*basePay+(numberOfWorkedHours-200)*0.15*basePay;
           salary= salary+bonus;

          if(basePay <= 50000)
        	  tax = 0;
          else if((basePay > 50000) && (basePay<=75000))
        	  tax = 0.05*25000;
          else if((basePay > 75000) && (basePay <= 100000))
        	  tax = 0.05*25000+0.075*(basePay-75000);
          else if((basePay > 100000 && basePay <= 150000))
        	  tax = 0.05*25000+0.075*25000+0.1*(basePay-100000);
          else if(basePay > 150000 && basePay <= 300000)
        	  tax = 0.05*25000+0.075*25000+0.1*50000+0.2*(basePay-150000);
          else
        	  tax = 0.05*25000+0.075*25000+0.1*50000+0.2*150000+0.3*(basePay-300000);
		
          salary = salary - tax;
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
