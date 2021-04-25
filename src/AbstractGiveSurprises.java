import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises{
	IBag bag;
	int waitTime = 3;

	public AbstractGiveSurprises() {

	}

	public AbstractGiveSurprises(Factory factory, String bagType, int waitTime) {
		this.bag = factory.makeBag(bagType);
		this.waitTime = waitTime;
	}

	public void put(ISurprise newSurprise) {
		bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		bag.put(surprises);
	}

	public ISurprise give() {
		return bag.takeOut();
	}
	
	public ArrayList<ISurprise> giveAll() {
		ArrayList<ISurprise> newArrayListSurprise = new ArrayList<ISurprise>();
		while(!bag.isEmpty()) {
			newArrayListSurprise.add(bag.takeOut());
			giveWithPassion();
			try {
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return newArrayListSurprise;
	}

	public boolean isEmpty() {
		return bag.isEmpty();
	}

	public abstract void giveWithPassion();

}

