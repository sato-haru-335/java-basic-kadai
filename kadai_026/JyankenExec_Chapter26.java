package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 myChoice = new Jyanken_Chapter26();
		

		String myHand = myChoice.getMyChoice();
		String randHand = myChoice.getRandom();
		
		
		myChoice.playGame(myHand, randHand);
		
		
	}

}
