package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void dictionary(String[] checkStr) {
		
		HashMap<String, String> moji = new HashMap<String, String>();
		
		moji.put("apple", "りんご");
		moji.put("peach", "桃");
		moji.put("banana", "バナナ");
		moji.put("lemon", "レモン");
		moji.put("pear", "梨");
		moji.put("kiwi", "キウイ");
		moji.put("strawberry", "いちご");
		moji.put("grape", "ぶどう");
		moji.put("muscat", "マスカット");
		moji.put("cherry", "さくらんぼ");
		
		for (String word : checkStr) {
			
			if(moji.get(word) != null) {
				System.out.println(word + "の意味は" +  moji.get(word));
			}
			else {
				System.out.println(word +  "は辞書に存在しません");
			}
			
		}
		
	}
	
	

}
