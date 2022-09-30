package lesson08;

public class Main2 {

	public static void main(String[] args) {

		Cleric cle = new Cleric();
		cle.hp -= 5;
		System.out.println("現在HP:"+cle.hp);
		System.out.println("現在MP:"+cle.mp);
		cle.selfAid();
		cle.selfAid();
		System.out.println("現在HP:"+cle.hp);
		System.out.println("現在MP:"+cle.mp);
		System.out.println("MP回復:"+cle.pray(5));
		System.out.println("現在MP:"+cle.mp);
	}

}
