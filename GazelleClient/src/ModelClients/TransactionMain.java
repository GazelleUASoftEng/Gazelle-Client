package ModelClients;

import org.gazelle.enums.EmployeeClassification;
import org.gazelle.enums.TransactionType;
import org.gazelle.models.Employee;
import org.gazelle.models.Transaction;

public class TransactionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee testEmployee = new Employee();
		testEmployee.setPassword("whatsorude");
		testEmployee.setManagerId(null);
		testEmployee.setClassification(EmployeeClassification.CASHIER);
		testEmployee.setActive(true);
		testEmployee.setEmployeeId("010874852");
		testEmployee.setFirstName("Dustin");
		testEmployee.setLastName("Brown");
		testEmployee.save();
		
		Transaction testTransaction = new Transaction();
		testTransaction.setParentId(null);
		testTransaction.setType(TransactionType.SALE);
		testTransaction.setAmount(11.45);
		testTransaction.setCashierId(testEmployee.getId());
		
		
		testTransaction.save();
	}

}
