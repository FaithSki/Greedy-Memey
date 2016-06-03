
public class Scroogey extends GreedStrategy{
	
	public static boolean reroll = false;

	public int choose(GreedOption[] options, int[] dice, int bank) {
		if (bank >= 300){
			System.out.println("Bank is more than 300");
			reroll = false;
			if (options.length > 2){
				System.out.println("Taking highest valued combo");
				return(findType(options,3));
			}
			else{
				System.out.println("Ending turn");
				return(findType(options,0));
			}
		}
		if (reroll == true){
			reroll = false;
			System.out.println("Rerolling");
			return(findType(options,1));
		}
		if (dice.length > 3){
			reroll = true;
			System.out.println("Taking highest valued combo");
			return(findType(options,3));
		}
		System.out.println("Ending turn");
		return(findType(options,0));
	}
	
	private int findType(GreedOption[] options, int desiredType){
		for (int count = 0; count < options.length; count++ ){
			if (options[count].optionType() == desiredType){
				return count;
			}
		}
		return 0;
	}

	public String playerName() {
		return "Scrooge McDuck";
	}

	public String author() {
		return "Chris, Ivan, Jeffery, and Allan";
	}

}
