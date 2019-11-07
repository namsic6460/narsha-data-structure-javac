import java.util.LinkedList;

public class Employee_Manager {
	LinkedList<Employee> list = new LinkedList<Employee>();
	
	public void add(Employee e) {
		list.add(e);
	}
	
	public Employee get(int index) {
		return list.get(index);
	}
	
	public void changeDepart(int code, Employee.Department depart) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getCode() == code)
				list.get(i).setDepartment(depart);
		}
	}
	
	public Employee getEmployeeData(int code) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getCode() == code)
				return list.get(i);
		}
		
		return null;
	}
}
