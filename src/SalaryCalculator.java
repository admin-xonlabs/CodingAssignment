public class SalaryCalculator
{
    public static double computeInHandSalary(int numberOfWorkedHours, double basePay)
    {
        double FlexiblePay=0;
        double Bonus=0; 
        double salary=0;
        double Tax=0;
        if(basePay>100000)
        {
            double Pay=0;
            Pay=0.8*basePay;
           double i=100000;
            FlexiblePay=Math.min(Pay,i);
        }
        else if(basePay>75000 && basePay<=100000)
        {
            FlexiblePay=0.7*basePay;
        }
        else if(basePay>50000 && basePay<=75000)
        {
            FlexiblePay=0.6*basePay;
        }
        else
        {
           FlexiblePay=0.5*basePay; 
        }
          
        if(numberOfWorkedHours>=140 && numberOfWorkedHours<=160)
        {
          Bonus=2000;
        }
        else if (numberOfWorkedHours>160 && numberOfWorkedHours<=180)
        {
            double AdditionalHours=0;
            AdditionalHours=(numberOfWorkedHours-160)+20;
          Bonus=2000+(AdditionalHours*0.05*basePay);
            
        }
        else if(numberOfWorkedHours>180 && numberOfWorkedHours<=200)
        {
            double AdditionalHours=0;
            AdditionalHours=(numberOfWorkedHours-160)+40;
             Bonus=2000+(20*0.05*basePay)+(AdditionalHours*0.1*basePay);
            
        }
        else if(numberOfWorkedHours>200)
        {
            double AdditionalHours=0;
            AdditionalHours=(numberOfWorkedHours-200)+60;
           Bonus=2000+(20*0.05*basePay)+(20*0.1*basePay)+(AdditionalHours*0.15*basePay);
            
        }
        else
        {
           Bonus=0;
        }
        double total=0;
        total=basePay+FlexiblePay+Bonus;
        if(total>300000)
        {
            Tax= 0.3*total;
        }
        else if(total>150000 && total<=300000)
        {
            Tax=0.2*total;
        }
        else if(total>100000 && total<=150000)
        {
            Tax=0.1*total;
        }
        else if(total>75000 && total<=100000)
        {
            Tax=0.075*total;
        }
        else if(total>50000 && total<=75000)
        {
            Tax=0.05*total;
        }
        else
        {
            Tax=0;
        }
        salary=total-Tax;
        return salary;
    }
    
    public static void main(String args[])
    {
        System.out.println(computeInHandSalary(80,150000));
        System.out.println(computeInHandSalary(160,200000));
        System.out.println(computeInHandSalary(175,300000));
        System.out.println(computeInHandSalary(200,180000));
        System.out.println(computeInHandSalary(220,140000));
        System.out.println(computeInHandSalary(240,190000));
    }
  }