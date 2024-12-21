package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		
		while(true){
			String input = (String) scanner.next();
			
			if(input.equals("r")  || input.equals("s") || input.equals("p")) {
				scanner.close();
				return input;
			}else {
				System.out.println("もう一度入力してください");
			}
			
		}
	}

		
		
	
	public String getRandom() {
		String[] arr = {"r","s","p"};
		Random rand = new Random();
		int num = rand.nextInt(3);
		return arr[num];
		
	}
	
	public void playGame(String myChoice,String randChoice) {
		HashMap<String, String> choiceMap = new HashMap<String, String>();
		choiceMap.put("r", "グー");
		choiceMap.put("s", "チョキ");
		choiceMap.put("p", "パー");
				
		String myHand = choiceMap.get(myChoice);
		String matchHand = choiceMap.get(randChoice);
		
		System.out.println("自分の手は" + myHand + ",対戦相手の手は" + matchHand);
		
		if(myHand.equals(matchHand)) {
			System.out.println("あいこです");
		}else if(0 > myHand.compareToIgnoreCase(matchHand) || (myHand.equals("パー") && myHand.equals("グー"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}	
	}
}
