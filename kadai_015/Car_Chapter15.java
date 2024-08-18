package kadai_015;

public class Car_Chapter15 {
	//フィールド（内部データ）
	private int gear = 1;
	private int speed = 10;

	//コンストラクタ（初期化処理）
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	//【メソッド】
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
	}

	public void run() {
		switch (this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
