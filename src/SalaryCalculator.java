
public class SalaryCalculator {

	public static double computeInHandSalary(int numberOfWorkedHours, double basePay) {
		double salary = 0;
		double fexible_pay=0;double bonus=0;double tax=0;double temp=0;double TotalTax=0; double difftax1 =0;double difftax2 =0;double difftax3 =0;double difftax4=0;
    double b1=0;double b2=0;double b3=0;
    if(basePay<=50000){
      fexible_pay=0.5*basePay;
    }
    else if(basePay>50000 && basePay<=75000){
      fexible_pay=0.6*basePay;
    }
    else if(basePay>75000 && basePay<=100000){
      fexible_pay=0.7*basePay;
    }
    else if(basePay>100000){
      temp=0.8*basePay;
      if (temp<=100000){
        fexible_pay=temp;
      }
      else{
        fexible_pay=100000;
      }
    }
    else{
      fexible_pay=0;
    }

//bonus calculation
    if ((numberOfWorkedHours>=140) && (numberOfWorkedHours<=200))
    {
        if((numberOfWorkedHours>=140) &&(numberOfWorkedHours<=160))
        {
            bonus = 2000;
        }
        else if ((numberOfWorkedHours>160) &&(numberOfWorkedHours<=180))
        {
            b1 = (numberOfWorkedHours-160) * (0.05*basePay);
            bonus = b1+2000;
        }
        else if ((numberOfWorkedHours>180) &&(numberOfWorkedHours<=200))
        {
            b1 = (numberOfWorkedHours-160) * (0.05*basePay);
            b2 = (numberOfWorkedHours-180) * (0.1*basePay);
            bonus = b1+b2+2000;
        }
      }
    else if(numberOfWorkedHours>200)
            {
              b1 = (numberOfWorkedHours-160) * (0.05*basePay);
              b2 = (numberOfWorkedHours-180) * (0.1*basePay);
              b3 = (numberOfWorkedHours-200) * (0.15*basePay);
              bonus = b1+b2+b3+2000;
    }
    else{
      bonus=0;
    }

//tax

    if ((basePay>0) && (basePay<=300000))
    {
        if(basePay<=50000)
        {
            TotalTax = 0;
        }
        else if ((basePay>50000) && (basePay<=75000))
        {
            tax = (basePay - 50000) * 0.05;
            TotalTax = tax;
        }
        else if ((basePay>75000) && (basePay<=100000))
        {
            tax = (basePay - 50000) * 0.05;
            difftax1 = (basePay - 75000) * .075;
            TotalTax = tax + difftax1 ;
        }
        else if ((basePay>100000) && (basePay<=150000))
        {
            tax = (basePay - 50000) * 0.05;
            difftax1 = (basePay - 75000) * .075;
            difftax2 = (basePay - 100000) * 0.1;
            TotalTax = tax + difftax1 + difftax2 + difftax3;
        }
        else if ((basePay>150000) && (basePay<=300000))
        {
            tax = (basePay - 50000) * 0.05;
            difftax1 = (basePay - 75000) * .075;
            difftax2 = (basePay - 100000) * 0.1;
            difftax3 = (basePay - 150000) * 0.2;

            TotalTax = tax + difftax1 + difftax2 + difftax3 + difftax4;
        }
      }
    else if(basePay > 300000)
            {
              tax = (basePay - 50000) * 0.05;
              difftax1 = (basePay - 75000) * .075;
              difftax2 = (basePay - 100000) * 0.1;
              difftax3 = (basePay - 150000) * 0.2;
              difftax4 = (basePay - 300000) * 0.3;
              TotalTax = tax + difftax1 + difftax2 + difftax3 + difftax4;
    }

		// Your Logic goes here
    salary = basePay +bonus+ fexible_pay  - TotalTax;
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
