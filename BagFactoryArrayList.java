package surprise;

public class BagFactoryArrayList implements IBagFactory {

	public IBag makeBag(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("RANDOM")) {
			return new RandomContainer();

		} else if (type.equalsIgnoreCase("FIFO")) {
			return new FIFOContainer();

		} else if (type.equalsIgnoreCase("LIFO")) {
			return new LIFOContainer();
		}
		return null;
	}
}