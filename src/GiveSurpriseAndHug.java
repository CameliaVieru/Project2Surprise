
public class GiveSurpriseAndHug extends AbstractGiveSurprises{

	public GiveSurpriseAndHug(Factory factory, String bagType, int waitTime) {
		super(factory, bagType, waitTime);
	}

	@Override
	public void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}

}
