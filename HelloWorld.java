public class HelloWorld {
	public static void main(String[] args) {
		if (args != null) {
			if (args.length == 1) {
				System.out.println("Hello, " + args[0] + "!");
			}
		} else {
			System.out.println("Hello, World!");
		}
	}
}
