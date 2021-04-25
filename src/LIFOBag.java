
public class LIFOBag extends AbstractBag{
	
	@Override
	public ISurprise takeOut() {
		ISurprise smallSurprise = bag.get(bag.size() - 1);
		bag.remove(bag.size() - 1);
		return smallSurprise;
	}
}

