public class Person {
	private final String man = "MAN";
	private final String woman = "WOMAN";

	public static void main(String[] args) {
		String str = "WOMAN";
		if (str.equals("MAN")) {
			System.out.println("I'm a man");
		} else if (str.equals("WOMAN")) {
			System.out.println("I'm a woman");
		}
	}
}
