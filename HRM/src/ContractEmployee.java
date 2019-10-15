
public class ContractEmployee extends Employee {
	private int hourlyWage;
	
	public int calculratePayment() {
		return getWorkTime() * getHourlyWage();
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public void setHourlyWage() {
		this.hourlyWage = 8350;
	}
}
