
public class SalaryCalculator {

	public static double computeInHandSalary(int numberOfWorkedHours, double basePay) {
		double salary = 0;

		// Your Logic goes here
		double flexible_pay = flex_pay(basePay);
		double bonus = find_bonus(numberOfWorkedHours, basePay);
		double tax = find_tax(basePay + flexible_pay + bonus);
		salary = (basePay + flexible_pay + bonus) - tax;
		return salary;
	}
	public static double flex_pay(double base_sal) {
		if (base_sal <= 50000) {
			double flexi_pay = base_sal * 0.5;
			return flexi_pay;
		} else if (base_sal <= 75000) {
			double flexi_pay = base_sal * 0.6;
			return flexi_pay;
		} else if (base_sal <= 100000) {
			double flexi_pay = base_sal * 0.7;
			return flexi_pay;
		} else {
			double flexi_pay = Math.min((base_sal * 0.8), 100000);
			return flexi_pay;
		}

	}

	public static double find_bonus(int hours, double base) {
		if (hours >= 140 && hours <= 160) {
			double bonus_amount = 2000;
			return bonus_amount;
		} else if (hours >= 160 && hours <= 180) {
			double bonus_amount = 2000 + ((hours - 160) * (0.05 * base));
			return bonus_amount;
		} else if (hours >= 180 && hours <= 200) {
			double bonus_amount = 2000 + (20 * (0.05 * base)) + ((hours - 180) * (0.1 * base));
			return bonus_amount;
		} else if (hours > 200) {
			double bonus_amount = 2000 + (20 * (0.05 * base)) + (20 * (0.1 * base)) + ((hours - 200) * 0.15 * base);
			return bonus_amount;
		} else {
			return 0;
		}
	}

	public static double find_tax(double amount) {
		if (amount <= 50000) {
			return 0;
		} else if (amount >= 50000 && amount <= 75000) {
			double tax = 0.05 * (amount - 50000);
			return tax;
		} else if (amount >= 75000 && amount <= 100000) {
			double tax = (0.05 * 25000) + (0.075 * (amount - 75000));
			return tax;
		} else if (amount >= 100000 && amount <= 150000) {
			double tax = (0.05 * 25000) + (0.075 * (amount - 75000));
			return tax;
		} else if (amount >= 150000 && amount <= 300000) {
			double tax = (0.05 * 25000) + (0.075 * 25000) + (0.1 * 50000) + (0.2 * (amount - 150000));
			return tax;
		} else {
			double tax = tax = (0.05 * 25000) + (0.075 * 25000) + (0.1 * 50000) + (0.2 * 150000) + (0.3 * (amount - 300000));
			return tax;
		}
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
