
public class Main {

	public static void main(String[] args) {
		MessageSubscriberOne one = new MessageSubscriberOne();
		MessageSubscriberTwo two = new MessageSubscriberTwo();
		MessageSubscriberThree three = new MessageSubscriberThree();

		MessagePublisher publisher = new MessagePublisher();

		publisher.attach(one);
		publisher.attach(two);

		publisher.notifyAllObserver(new Message("First Message"));

		publisher.detach(one);
		publisher.attach(three);

		publisher.notifyAllObserver(new Message("Second Message"));

	}

}
