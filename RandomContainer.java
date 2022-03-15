package surprise;

import java.util.ArrayList;
import java.util.Random;

public class RandomContainer implements IBag {

	private final ArrayList<ISurprise> randomBag = new ArrayList<ISurprise>();
	private static final Random random = new Random();

	@Override
	public void put(ISurprise newSurprise) {
		this.randomBag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			this.randomBag.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if (!this.randomBag.isEmpty()) {
			return this.randomBag.remove(RandomContainer.random.nextInt(randomBag.size()));
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.randomBag.size() == 0;
	}

	@Override
	public int size() {
		return this.randomBag.size();
	}
}