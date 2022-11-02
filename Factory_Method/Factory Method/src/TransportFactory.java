
public class TransportFactory {

	public static final Transport getTransport(TransportType transportType) {
		switch (transportType) {

		case SHIP:
			return new Ship();

		case TRUCK:
			return new Truck();

		default:
			throw new IllegalArgumentException("This bank type is unsupported");
		}
	}
}
