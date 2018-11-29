package io.nodom.SpringIoC.patterns.decorator;

public class SavingAccount implements Account {

	@Override
	public String getTotalBenefits() {
		return String.format("This Account has %d% interest rate per day $%d withdrawal limit", 4, 5000);
	}
}
