package surprise;

import java.util.ArrayList;
import java.util.Random;

import surprise.surprises.Candies;
import surprise.surprises.FortuneCookie;
import surprise.surprises.MinionToy;

public final class GatherSurprises {
	private static final Random random = new Random();

	private GatherSurprises() {
	}

	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> bagWithGatheredSurprises = new ArrayList<ISurprise>();
		for (int i = 0; i < n; i++) {
			bagWithGatheredSurprises.add(GatherSurprises.gather());
		}
		return bagWithGatheredSurprises;
	}

	public static ISurprise gather() {
		int index = random.nextInt(3);
		switch (index) {
		case 0:
			ISurprise cookie = FortuneCookie.generate();
			return cookie;
		case 1:
			ISurprise candy = Candies.generate();
			return candy;
		case 2:
			ISurprise toy = MinionToy.generate();
			return toy;
		default:
			return null;
		}
	}
}