package kadai_018;

abstract public class Kato_Chapter18 {
//	各フィールド
	String familyName = "加藤";
	String givenName = "";
	String address ="東京都中野区〇×";
	
	public void commonIntroduce() {
		System.out.println(address);
	}
	
	abstract public void eachIntroduce() ;
	
	public void execIntroduce() {
		System.out.println(familyName+givenName);
		commonIntroduce();
		eachIntroduce();
		
		
	}
}
