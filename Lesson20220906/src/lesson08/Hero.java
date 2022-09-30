package lesson08;

public class Hero{

	String name;
	int hp;

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.printf("%sは%d秒座った！\n",this.name,sec);
		System.out.printf("HPが%dポイント回復した\n",sec);
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.printf("最終HPは%dでした\n",this.hp);
	}

}
