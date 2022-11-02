
public class Main {

	public static void main(String[] args) {
		 Transport transport = TransportFactory.getTransport(TransportType.TRUCK);
	        System.out.println(transport.delivery());

	}

}
