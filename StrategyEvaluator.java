
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
				.evaluatePlayer(new ComputerGreedStrategyPlayer(hereWeGo), 10000);
	}
	
	public static void main(String[] args) {
		//System.out.println(practiceGreed());
		double score1 = practiceGreed();
		double score2 = practiceGreed();
		double score3 = practiceGreed();
		double avg = ((score1 + score2 + score3) / 3);
		System.out.println("\naverage between three sets of ten-thousand rounds: " + avg);
	}

}
