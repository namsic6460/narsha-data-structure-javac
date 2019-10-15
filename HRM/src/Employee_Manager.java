import java.util.LinkedList;

public class Employee_Manager {
	LinkedList<Employee> list = new LinkedList<Employee>();
	
	public void add(Employee e) {
		list.add(e);
	}
	
	public Employee get(int index) {
		return list.get(index);
	}
}
