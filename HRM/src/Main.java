
public class Main {
	public static void main(String[] args) {
		PermanentEmployee e = new PermanentEmployee();
		ContractEmployee ce = new ContractEmployee();
		
		e.setEmployeeData(1000, "전지수", "01053905355", Department.DEV, "대구시 수성구 지범로 21길 15", "2019/10/12", 10);
		ce.setEmployeeData(1000, "강다혁", "01012345678", Department.DESIGN, "대구시 달성군 구지면 구지로 16", "2019/10/13", 15);
		e.setSalary(5000);
		ce.setHourlyWage(8350);
		
		System.out.println("정규직 월급 : " + e.calculratePayment() + "만원");
		System.out.println("게약직 " + ce.getWorkTime() + "시간 시급 : " + ce.calculratePayment() + "원");
	}
}
