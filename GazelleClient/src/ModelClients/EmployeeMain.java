package ModelClients;

import org.gazelle.enums.EmployeeClassification;
import org.gazelle.models.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee testEmployee = new Employee();
		testEmployee.setPassword("idon'tlikeyou");
		testEmployee.setManagerId(null);
		testEmployee.setClassification(EmployeeClassification.SHIFT_MANAGER);
		testEmployee.setActive(true);
		testEmployee.setEmployeeId("010256749");
		testEmployee.setFirstName("Christopher");
		testEmployee.setLastName("Robin");
		
		testEmployee.save();
	}

}
