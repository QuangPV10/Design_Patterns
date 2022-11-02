
public class WoodFatory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		return new WoodTable();
	}

}
