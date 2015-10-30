package ModelClients;

import org.gazelle.models.TransactionEntry;
import org.gazelle.models.Transaction;
import java.time.LocalDateTime;

public class TransactionEntryMain {

	public static void main (String[] args) {
		TransactionEntry testTransactionEntry = new TransactionEntry();
		testTransactionEntry.setPrice(10.05);
		testTransactionEntry.setQuantity(5);
		testTransactionEntry.setCreatedOn(LocalDateTime.now());
		testTransactionEntry.setTransactionID(new Transaction().getCashierId());
		
		testTransactionEntry.save();
	}
}
