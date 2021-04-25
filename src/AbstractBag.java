import java.util.ArrayList;

public abstract class AbstractBag implements IBag{

	ArrayList<ISurprise> bag = new ArrayList<ISurprise>();

	@Override
	public void put(ISurprise surprise) {
		bag.add(surprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while(!bagOfSurprises.isEmpty()) {
			ISurprise newSurprise = bagOfSurprises.takeOut();
			put(newSurprise);
		}
	}

	@Override
	public int size() {
		return bag.size();
	}

	@Override
	public boolean isEmpty() {
		if(bag.size() == 0) {
			return true;
		}
		return false;
	}

}
