package ModelClients;

import org.gazelle.models.TenderEntry;
import java.util.UUID;
import org.gazelle.enums.Paytype;

public class TenderEntryMain{

	public static void main(String[] args)
	{
		TenderEntry test = new TenderEntry();
		test.setAmount(10.01);
		test.setPaytype(Paytype.VISA);
		test.setTransID(UUID.fromString("7dd45050-da06-47a2-99be-c079ae9d5816"));

		test.save();
	}
}
