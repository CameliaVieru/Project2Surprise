
public class GiveSurpriseAndSing extends AbstractGiveSurprises{

	public GiveSurpriseAndSing(Factory factory, String bagType, int waitTime) {
		super(factory, bagType, waitTime);
	}

	@Override
	public void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
	}

}
