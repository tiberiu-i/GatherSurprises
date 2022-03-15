package surprise.surprises;

import java.util.ArrayList;
import java.util.Arrays;

import surprise.ISurprise;

public class MinionToy implements ISurprise {
	private String name;
	private static int index;
	private static final ArrayList<String> minionsArray = new ArrayList<String>(
			Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));

	public MinionToy() {
		if (index == minionsArray.size()) {
			index = 0;
		}
		this.name = minionsArray.get(index++);
	}

	public static MinionToy generate() {
		return new MinionToy();
	}

	@Override
	public void enjoy() {
		System.out.println("You received a minion toy! It's name is: " + this.name);
	}
}