
public class GiveSurpriseAndApplause extends AbstractGiveSurprises{

	public GiveSurpriseAndApplause(Factory factory, String bagType, int waitTime) {
		super(factory, bagType, waitTime);
	}

	@Override
	public void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");
	}
}
