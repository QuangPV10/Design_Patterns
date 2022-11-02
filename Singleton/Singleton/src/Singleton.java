
public final class Singleton {

	private static Singleton instance;
	private static int counter = 0;

	private Singleton() {
		counter++;
		System.out.println("Counter Value " + counter);
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}

	public void printDetail(String message) {
		System.out.println(message);

	}

}
