
public abstract class Employee {
	enum Department{
		HR,
		DEV,
		DESIGN;
	}
	
	private int code;
	private String name;
	private String phoneNumber;
	private Department department;
	private String address;
	private String date;
	private int workTime;
	
	public abstract int calculratePayment();
	
	public void setEmployeeData(int code, String name, String phoneNumber, Department department, String address, String date, int workTime) {
		setCode(code);
		setName(name);
		setPhoneNumber(phoneNumber);
		setDepartment(department);
		setAddress(address);
		setDate(date);
		setWorkTime(workTime);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
}
