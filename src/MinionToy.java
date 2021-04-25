import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
	private String minionName;
	static private ArrayList<String> minions = new ArrayList<String>(Arrays.asList("Carl", "Dave", "Stuart", "Tom", "Tim", "Phil", "Jerry"));
	static private int minionNumber = 0;
	
	public MinionToy(String minionName) {
		minionNumber = minionNumber + 1;
		this.minionName = minionName;
	}

	static public MinionToy generate(int minionNumber) {
		MinionToy minion = new MinionToy(minions.get(minionNumber));
		return minion;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Enjoy your new minion " + this.minionName);
		
	}

	public String getMinionName() {
		return minionName;
	}
	
}


