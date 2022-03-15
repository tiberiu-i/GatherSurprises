package surprise.giveSurprises;

import java.util.concurrent.TimeUnit;

import surprise.BagFactoryArrayList;
import surprise.IBag;
import surprise.IBagFactory;
import surprise.ISurprise;

public abstract class AbstractGiveSurprises {
	private static final IBagFactory factory = new BagFactoryArrayList();

	private IBag container;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		this.container = factory.makeBag(type);
		this.waitTime = waitTime;
	}

	public void put(ISurprise newSurprise) {
		this.container.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.container.put(surprises);
	}

	public void give() {
		if (!this.container.isEmpty()) {
			ISurprise yourSurprise = this.container.takeOut();
			yourSurprise.enjoy();
			giveWithPassion();
		} else {
			System.out.println("Sorry, there are no more surprises.");
		}
	}

	public void giveAll() {
		while (!this.container.isEmpty()) {
			give();
			try {
				TimeUnit.SECONDS.sleep(waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Sorry, there are no more susprises.");
	}

	public boolean isEmpty() {
		return this.container.isEmpty();
	}

	abstract void giveWithPassion();
}
