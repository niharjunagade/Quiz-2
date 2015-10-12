import java.util.Scanner;

public class StudentLoan {
	public static void main(String str[]) {
		float initial_fee;
		float total_fee;
		float increase_rate[] = new float[3];
		float repayment_apr;
		int month;
		float interest_rate;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of initial fee");

		initial_fee = input.nextFloat();
		System.out.println("Enter increase rate of next 3 years");

		for (int i = 0; i < 3; i++)
			increase_rate[i] = input.nextFloat();

		System.out.println("Enter Repayment APR");
		repayment_apr = input.nextFloat();

		System.out.println("Enter the no of months for repayment of loan");
		month = input.nextInt();

		total_fee = initial_fee;

		for (int i = 0; i < 3; i++) {
			initial_fee = initial_fee * (1 + increase_rate[i] / 100);
			total_fee = total_fee + initial_fee;
		}
		repayment_apr /= 1200;

		@SuppressWarnings("unused")

		float monthly_payment = (float) ((total_fee * repayment_apr * Math.pow(1 + repayment_apr, month))
				/ (Math.pow(1 + repayment_apr, month) - 1));

		System.out.println("Total fee after completing course = " + total_fee);

		System.out.println(
				"Monthly instalment of Loan on interest apr = " + monthly_payment + " for " + month + " months");
	}
}