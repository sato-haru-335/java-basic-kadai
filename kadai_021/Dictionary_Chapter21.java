package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void dictionary(String checkStr) {
		
		HashMap<String, String> moji = new HashMap<String, String>();
		
		moji.put("apple", "りんご");
		moji.put("peach", "桃");
		moji.put("banana", "バナナ");
		moji.put("lemon", "レモン");
		moji.put("pear", "ピーチ");
		moji.put("kiwi", "キウイ");
		moji.put("strawberry", "いちご");
		moji.put("grape", "ぶどう");
		moji.put("muscat", "マスカット");
		moji.put("cherry", "さくらんぼ");
		
		if(moji.get(checkStr) != null) {
			
			System.out.println(moji.get(checkStr));
		}
		else {
			System.out.println("辞書に存在していません");
		}
		
	}
	
	

}
