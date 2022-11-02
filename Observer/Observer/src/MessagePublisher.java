import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);

	}

	@Override
	public void notifyAllObserver(Message message) {
		for (Observer observer : observers) {
			observer.update(message);

		}

	}

}
