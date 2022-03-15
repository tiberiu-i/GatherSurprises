package surprise;

import surprise.giveSurprises.GiveSurpriseAndApplause;
import surprise.giveSurprises.GiveSurpriseAndHug;
import surprise.giveSurprises.GiveSurpriseAndSing;

public class Main {

	public static void main(String[] args) {

		GiveSurpriseAndApplause give1 = new GiveSurpriseAndApplause("LIFO", 1);
		give1.put(GatherSurprises.gather());
		give1.put(GatherSurprises.gather());
		give1.put(GatherSurprises.gather());

		GiveSurpriseAndHug give2 = new GiveSurpriseAndHug("RANDOM", 1);
		give2.put(GatherSurprises.gather());
		give2.put(GatherSurprises.gather());
		give2.put(GatherSurprises.gather());

		GiveSurpriseAndSing give3 = new GiveSurpriseAndSing("FIFO", 1);
		give3.put(GatherSurprises.gather());
		give3.put(GatherSurprises.gather());
		give3.put(GatherSurprises.gather());

		give1.giveAll();
		System.out.println();
		give2.giveAll();
		System.out.println();
		give3.giveAll();
	}
}