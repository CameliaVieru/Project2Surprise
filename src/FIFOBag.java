
public class FIFOBag extends AbstractBag{
	
	@Override
	public ISurprise takeOut() {
		ISurprise aSurprise = bag.get(0);
		bag.remove(0);
		return aSurprise;
	}
}
