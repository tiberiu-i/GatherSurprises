package surprise.surprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import surprise.ISurprise;

public class Candies implements ISurprise {
	private static final Random random = new Random();
	private int candyNo;
	private String type;
	private static final ArrayList<String> candyString = new ArrayList<String>(
			Arrays.asList("chocolate", "jelly", "fruit", "vanilla"));

	public Candies(int candyIndex, int candyNo) {
		this.candyNo = candyNo;
		this.type = candyString.get(candyIndex);
	}

	public static Candies generate() {
		return new Candies(randomNumber(candyString.size()), randomNumber(9) + 2);
	}

	public static int randomNumber(int limit) {
		return random.nextInt(limit);
	}

	@Override
	public void enjoy() {
		System.out.println("You received " + this.candyNo + " " + this.type + " flavoured candies!");
	}
}