package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		KatoTaro_Chapter18 kato = new KatoTaro_Chapter18();
		
		KatoTaro_Chapter18 name1 = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 name2 = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 name3 = new KatoHanako_Chapter18();
		
		name1.setGivenName();
		name1.execIntroduce();
		name2.setGivenName();
		name2.execIntroduce();
		name3.setGivenName();
		name3.execIntroduce();
	}
}
