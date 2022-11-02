
public abstract class Logistics {
	public abstract Transport CreateTransport();

	public String PlanDelivery() {
		Transport transport = CreateTransport();
		String result = "Creator: The same creator's code has just worked with " + transport.delivery();

		return result;
	}

}
