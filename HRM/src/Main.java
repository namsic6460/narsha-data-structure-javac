import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PermanentEmployee e = new PermanentEmployee();
		ContractEmployee ce = new ContractEmployee();
		Scanner scanner = new Scanner(System.in);
		
		e.setEmployeeData(1000, "aaa", "01053905355", Employee.Department.DEV, "대구시 수성구 지범로 21길 15", "2019/10/12", 10);
		ce.setEmployeeData(1001, "bbb", "01012345678", Employee.Department.DESIGN, "대구시 달성군 구지면 구지로 16", "2019/10/13", 15);
		e.setSalary();
		ce.setHourlyWage();
		
		System.out.println("정규직 월급 : " + e.calculratePayment() + "만원");
		System.out.println("게약직 " + ce.getWorkTime() + "시간 시급 : " + ce.calculratePayment() + "원");
		System.out.println("");
		
		Employee_Manager EM = new Employee_Manager();
		Employee getEmployee;
		
		EM.add(e);
		EM.add(ce);
		
		
		getEmployee = EM.get(0);
		System.out.print("변경전 - ");
		System.out.println(getEmployee.getName() + "(" + getEmployee.getCode() + ") : " + getEmployee.getDepartment());
		System.out.print("변경후 - ");
		EM.changeDepart(e.getCode(), Employee.Department.HR);
		System.out.println(getEmployee.getName() + "(" + getEmployee.getCode() + ") : " + getEmployee.getDepartment());
		System.out.println("");
		
		getEmployee = EM.get(1);
		System.out.print("변경전 - ");
		System.out.println(getEmployee.getName() + "(" + getEmployee.getCode() + ") : " + getEmployee.getDepartment());
		System.out.print("변경후 - ");
		EM.changeDepart(ce.getCode(), Employee.Department.DEV);
		System.out.println(getEmployee.getName() + "(" + getEmployee.getCode() + ") : " + getEmployee.getDepartment());
		System.out.println("");
		
		
		System.out.println("찾을 사원의 번호 입력 : ");
		int input = scanner.nextInt();
		getEmployee = EM.getEmployeeData(input);
		
		if(getEmployee == null)
			System.out.println("해당 번호의 사원을 찾을 수 없습니다");
		else
			System.out.println(getEmployee.getName() + "(" + getEmployee.getCode() + ") : " + getEmployee.getDepartment());
		
		
		scanner.close();
	}
}
