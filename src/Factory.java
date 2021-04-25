
public class Factory implements IBagFactory{

	@Override
	public IBag makeBag(String type) {
		switch(type) {
		
		case "FIFO": {
			return new FIFOBag();
		}
		case "LIFO": {
			return new LIFOBag();
		}
		case "Random": {
			return new RandomBag();
		}
		}
		return null;
	}

}

