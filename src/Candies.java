import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise{
	private String typeCandy;
	private int numberOfCandies;
	static private ArrayList<String> candies = new ArrayList<String>(Arrays.asList("chocolate", "vanilla", "strawberry", "jelly", "fruits", "gummybears"));
	
	public Candies(String type, int numberOfCandies) {
		this.typeCandy = type;
		this.numberOfCandies = numberOfCandies;
	}

	static public Candies generate(Random randomObj) {
		int randomNumber = randomObj.nextInt(5);
		int secondRandomNumber = randomObj.nextInt(10);
		return new Candies(candies.get(randomNumber), secondRandomNumber);
	}
	
	@Override
	public void enjoy() {
		System.out.println("Enjoy your " + this.typeCandy + ". You got " + this.numberOfCandies + " of them.");
	}
}
