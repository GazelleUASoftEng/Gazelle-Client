package ModelClients;

import org.gazelle.models.TenderEntry;
import java.time.LocalDateTime;
import java.util.UUID;
import org.gazelle.enums.Paytype;

public class TenderEntryMain{

	public static void main(String[] args)
	{
		TenderEntry test = new TenderEntry();
		test.setAmount(10.01);
		test.setTime(LocalDateTime.now());
		test.setPaytype(Paytype.VISA);
		test.setTransID(UUID.fromString("1111-aaaa-2222-bbbb-3333"));

		test.save();
	}
}
