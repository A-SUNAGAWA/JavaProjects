package lesson08;

public class Cleric {
	int hp = 50;
	int MAX_HP = 50;
	int mp = 10;
	int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}

	public int pray(int sec) {

		ClericInter<Integer> min = (a,b) -> Math.min(a, b);
		int aidMp = min.func(this.MAX_MP-this.mp, sec + new java.util.Random().nextInt(3));

		this.mp += aidMp;

		return aidMp;
	}

}
