
public class DemoSingleThread {

	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getInstance();
		singleton1.printDetail("Singleton 1");
		Singleton singleton2 = Singleton.getInstance();
		singleton2.printDetail("Singleton 2");

	}

}
