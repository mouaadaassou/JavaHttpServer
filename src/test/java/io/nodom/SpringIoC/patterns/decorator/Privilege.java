package io.nodom.SpringIoC.patterns.decorator;

public class Privilege extends AccountDecorator{
	
	private Account account;
	
	public Privilege(Account account) {
		this.account = account;
	}

	@Override
	public String getTotalBenefits() {
		return String.format("This is the Total Befenits from %s", account.getClass().getName());
	}

	@Override
	String applyOtherBenefits() {
		return String.format("This is the Apply Benifits from %s", account.getClass().getName());
	}

}
