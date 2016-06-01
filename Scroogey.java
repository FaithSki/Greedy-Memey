
public class Scroogey extends GreedStrategy{

	public int choose(GreedOption[] options, int[] dice, int bank) {
		boolean is300 = false;
		for(GreedOption o : options){
			if(o.optionType() == GreedOption.SCORE){
				if ((dice.length) >= 3){
					
				}
				else{
					// take all available combos, in descending order of value, then re-roll
				}
			}
		}
	}

	public String playerName() {
		return "Scrooge McDuck";
	}

	public String author() {
		return "Chris, Ivan, Jeffery, and Allen";
	}

}
