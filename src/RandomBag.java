import java.util.Random;

public class RandomBag extends AbstractBag{
	
	@Override
	public ISurprise takeOut() {
		Random random = new Random();
		int aux = random.nextInt(bag.size());
		ISurprise smallSurprise = bag.get(aux);
		bag.remove(aux);
		return smallSurprise;
	}
}
