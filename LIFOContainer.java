package surprise;

import java.util.ArrayList;

public class LIFOContainer implements IBag {

	private final ArrayList<ISurprise> LIFOBag = new ArrayList<ISurprise>();

	@Override
	public void put(ISurprise newSurprise) {
		this.LIFOBag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			this.LIFOBag.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if (!this.LIFOBag.isEmpty()) {
			return this.LIFOBag.remove(this.LIFOBag.size() - 1);
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.LIFOBag.isEmpty();
	}

	@Override
	public int size() {
		return this.LIFOBag.size();
	}
}