
public class SalaryCalculator {

	public static double computeInHandSalary(int numberOfWorkedHours, double basePay) {
		double salary = 0;

		// Your Logic goes here
		
		double flexpay=0,bonus=0,tax=0;

		//flexible Pay
		if(basePay<=50000) {
			flexpay=(0.5)*basePay;
		}
		if(basePay>=50001 ) {
			flexpay=(0.6)*basePay;
		}
		if(basePay>=75001 ) {
			flexpay=(0.7)*basePay;
		}
		if(basePay>=100001) {
			flexpay=0.8*basePay;
			
			if(flexpay>100000)
				flexpay=100000;
		}
		
		//bonus
		if(numberOfWorkedHours<140) {
			bonus=0;
		}
		if(numberOfWorkedHours>=140 || (numberOfWorkedHours>=140 && numberOfWorkedHours<=160)) {
			bonus=2000;
			
			if(numberOfWorkedHours>160) {
				if(numberOfWorkedHours>180) {
					bonus +=(20)*((0.05)*basePay);
					if(numberOfWorkedHours>180 ) {
						if(numberOfWorkedHours>200) {
							bonus +=(20)*((0.1)*basePay);
							if(numberOfWorkedHours>200) {
								bonus +=(numberOfWorkedHours-200)*((0.15)*basePay);
							}
						}
						else
							bonus +=(numberOfWorkedHours-180)*((0.1)*basePay);
					}
				}
				else
					bonus +=(numberOfWorkedHours-160)*((0.05)*basePay);
			}
		}
		
		
		
		double amount=basePay+flexpay+bonus;
		
		//tax
		if(amount<=50000) {
			tax=0;
		}
		if(amount>50000) {
			if(amount>75000) {  
				tax +=(0.05)*25000;
				if(amount>75000) {
					if(amount>100000) {
						tax +=(0.075)*25000;
						if(amount>100000) {
							if(amount>150000) {
								tax +=(0.1)*50000;
								if(amount>150000) {
									if(amount>300000) {
										tax +=(0.2)*150000;
										if(amount>300000) {
											tax +=(0.3)*(amount-300000);
										}
									}
									else
										tax +=(0.2)*(amount-150000);
								}
							}
							else
								tax +=(0.1)*(amount-100000);
						}
					}
					else
						tax +=(0.075)*(amount-75000);
				}
			}
			else
				tax +=(0.05)*(amount-50000);
		}
		
		salary=amount-tax;
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
