import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Factory factory = new Factory();
		IBag aLifoBag = factory.makeBag("LIFO");
		IBag aFifoBag = factory.makeBag("FIFO");
		IBag aRandomBag = factory.makeBag("Random");
		
		System.out.println(aLifoBag.isEmpty());
		System.out.println(aLifoBag.size());
		
		Random randomNumber = new Random();
		FortuneCookie fortuneCookie = FortuneCookie.generate(randomNumber);
		System.out.println(fortuneCookie.getFortuneMessage());
		aLifoBag.put(fortuneCookie);

		System.out.println(aLifoBag.isEmpty());
		
		fortuneCookie = FortuneCookie.generate(randomNumber);
		System.out.println(fortuneCookie.getFortuneMessage());
		aLifoBag.put(fortuneCookie);
		
		fortuneCookie = FortuneCookie.generate(randomNumber);
		System.out.println(fortuneCookie.getFortuneMessage());
		aLifoBag.put(fortuneCookie);
		
		MinionToy minion = MinionToy.generate(4);
		System.out.println(minion.getMinionName());
		aLifoBag.put(minion);
		
		System.out.println(aLifoBag.size());
		ISurprise surprise = aLifoBag.takeOut();
		surprise.enjoy();
		
		MinionToy minion2 = MinionToy.generate(2);
		System.out.println(minion.getMinionName());
		aLifoBag.put(minion2);
		surprise = aLifoBag.takeOut();
		surprise.enjoy();
		
		System.out.println(aLifoBag.size());
		System.out.println(aLifoBag.isEmpty());
		
		Candies aCandy = Candies.generate(randomNumber);
		aLifoBag.put(aCandy);
		ISurprise aNewSurprise = aLifoBag.takeOut();
		aNewSurprise.enjoy();
		
		fortuneCookie = FortuneCookie.generate(randomNumber);
		System.out.println(fortuneCookie.getFortuneMessage());
		aFifoBag.put(fortuneCookie);
		
		fortuneCookie = FortuneCookie.generate(randomNumber);
		System.out.println(fortuneCookie.getFortuneMessage());
		aFifoBag.put(fortuneCookie);
		
		aCandy = Candies.generate(randomNumber);
		aLifoBag.put(aCandy);
		surprise = aFifoBag.takeOut();
		surprise.enjoy();
		
		
		aCandy = Candies.generate(randomNumber);
		aRandomBag.put(aCandy);
		
		minion = MinionToy.generate(1);
		System.out.println(minion.getMinionName());
		aRandomBag.put(minion);
		
		surprise = aRandomBag.takeOut();
		surprise.enjoy();
		
		
		
		AbstractGiveSurprises giveSurprise = new GiveSurpriseAndSing(factory, "LIFO", 3);

		giveSurprise.put(aLifoBag);
		giveSurprise.giveAll();
	
		AbstractGiveSurprises newSurprises = new GiveSurpriseAndHug(factory, "FIFO", 2);
		newSurprises.put(aFifoBag);
		newSurprises.giveAll();
	}
}
