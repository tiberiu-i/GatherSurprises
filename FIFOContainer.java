package surprise;

import java.util.ArrayList;

public class FIFOContainer implements IBag {

	private final ArrayList<ISurprise> FIFOBag = new ArrayList<ISurprise>();

	@Override
	public void put(ISurprise newSurprise) {
		this.FIFOBag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			this.FIFOBag.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if (!this.FIFOBag.isEmpty()) {
			return this.FIFOBag.remove(0);
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.FIFOBag.isEmpty();
	}

	@Override
	public int size() {
		return this.FIFOBag.size();
	}
}