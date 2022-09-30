package lesson08;

public class Main3 {

	public static void main(String[] args) {

		Func<String> strLengthCheck = s -> s.length() <= 10;

		System.out.print(">>");
		String s = new java.util.Scanner(System.in).nextLine();

		if(strLengthCheck.func(s)) {
			System.out.println("10文字以内");
		}else {
			System.out.println("時数超過");
		}
	}

}
