package ModelClients;

import org.gazelle.models.TransactionEntry;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionEntryMain {

	public static void main (String[] args) {
		TransactionEntry testTransactionEntry = new TransactionEntry();
		testTransactionEntry.setPrice(20.02);
		testTransactionEntry.setQuantity(2);
		testTransactionEntry.setCreatedOn(LocalDateTime.now());
		testTransactionEntry.setTransactionID(UUID.fromString("5fa8f1d3-7291-4996-b009-b233ca7cfd18"));
		testTransactionEntry.setProductID(UUID.fromString("bd7c1334-abfe-4693-bc6a-6fe6bdbbfa38"));
		
		testTransactionEntry.save();
	}
}
 