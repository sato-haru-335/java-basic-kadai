package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 checkStr = new Dictionary_Chapter21();

		String arr[] = {"apple","banana","grape","orange"};
		
		for (int i = 0; i < arr.length; i++) {
			checkStr.dictionary(arr[i]);
			
		}
		
	}

}