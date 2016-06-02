
public class Scroogey extends GreedStrategy{

	public int choose(GreedOption[] options, int[] dice, int bank) {
		for(GreedOption o : options){
			if(o.optionType() == GreedOption.SCORE){
				if ((dice.length) >= 4){
					if (bank >= 300){
						return (options.length + 2);
					}
					else{
						return 1;
					}
				}
				else{
					return (options.length + 2);
				}
			}
		}
		return (options.length + 2);
	}

	public String playerName() {
		return "Scrooge McDuck";
	}

	public String author() {
		return "Chris, Ivan, Jeffery, and Allan";
	}

}
