
public class PermanentEmployee extends Employee {
	private int salary;

	public int calculratePayment() {
		return (int)Math.ceil(getSalary() / 12);
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setSalary() {
		this.salary = 5000;
	}
}
