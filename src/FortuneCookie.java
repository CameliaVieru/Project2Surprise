import java.util.Random;

public class FortuneCookie implements ISurprise{
	private static String[] fortuneCookie = {"What you think, you become. What you feel, you attracts. What you imagine, you create. - Buddha",
											 "You create your thoughts, your thoughts create your intentions and your intentions create your reality- Wayne Dyer",
											 "Set your mind on a definite goal and observe how quickly the world stands aside to let you pass. – Napoleon Hill",
											 "The ancestor of every action is … thought. – Ralph Waldo Emerson",
											 "Everything you want is out there waiting for you to ask. Everything you want also wants you. But you have to take action to get it. – Jack Canfield",
											 "Though we travel the world over to find the beautiful, we must carry it within us, or we find it not. – Ralph Waldo Emerson",
											 "Thoughts become things. If you see it in your mind, you will hold it in your hand. – Bob Proctor",
											 "The idea is the first currency of the Universe, so pay attention to the ideas that are in harmony with your vision. – Mary Morrissey",
											 "For life makes no mistakes and always gives man that which man first gives himself. - Neville Goddard",
											 "If you judge after appearances, you will continue to be enslaved by the evidence of your senses. - Neville Goddard",
											 "The only person you are destined to become is… the person you decide to be. – Ralph Waldo Emerson " +
											 "Imagination and faith are the secrets of creation. -  Neville Goddard",
											 "See the things that you want as already yours. - Robert Collier",
											 "All that we are is a result of what we have thought. - Buddha",
											 "The subconscious is what a man is. The conscious is what a man knows. - Neville Goddard",
											 "Whether you think you can or think you can’t, either way you are right. – Henry Ford",
											 "If you don’t know where you are going, you’ll end up someplace else. - Yogi Berra",
											 "To accomplish great things we must not only act, but also dream; not only plan, but also believe. - Anatole France",
											 "That which is like unto itself is drawn. - Jerry and Esther Hicks ",
											 "Happiness is not a destination. It is a method of life. - Burton Hills"};
	private String fortuneMessage;
	
	public FortuneCookie(String message) {
		this.fortuneMessage = message;
		
	}
	
	public static FortuneCookie generate(Random randomObj) {
		int randomNumber = randomObj.nextInt(19);
		return new FortuneCookie(fortuneCookie[randomNumber]);
	}
	
	
	public String getFortuneMessage() {
		return fortuneMessage;
	}

	@Override
	public void enjoy() {
		System.out.println(this.fortuneMessage);
	}
	
	
}
