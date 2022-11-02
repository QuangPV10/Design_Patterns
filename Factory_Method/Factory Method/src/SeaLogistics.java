
public class SeaLogistics extends Logistics {

	@Override
	public Transport CreateTransport() {
		return new Ship();
	}

}
