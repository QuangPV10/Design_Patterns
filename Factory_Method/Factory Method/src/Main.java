
public class Main {

	public static void main(String[] args) {
		String config = "Ship";

		Logistics Logistics;

		switch (config) {
		case "Truck":
			Logistics = new RoadLogistics();
			break;
		case "Ship":
			Logistics = new SeaLogistics();
			break;
		default:
			Logistics = null;
			break;
		}

		System.out.println(Logistics.PlanDelivery());
//		Transport transport = Logistics.CreateTransport();
//		System.out.println(transport.delivery());
	}

}
