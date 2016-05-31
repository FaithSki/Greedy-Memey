
public class StrategyEvaluator {

	public static int evaluateStrategy(GreedStrategy theStrategy, int turns){
		ComputerGreedStrategyPlayer player 
		= new ComputerGreedStrategyPlayer(theStrategy);
		int score
		= (new GreedGame(false)).evaluatePlayer(player, turns);
		return score;
	}
	
	public static double practiceGreed(){
		Scroogey hereWeGo = new Scroogey();
		return (new GreedGame(true))
				.evaluatePlayer(new ComputerGreedStrategyPlayer(hereWeGo), 1);
	}
	
	public static void main(String[] args) {
		System.out.println(practiceGreed());
	}

}
Your choices are: