public class HelloWorld {
	public static void main(String[] args) {
		if (args != null) {
			if (args.length == 1) {
				//ensure first letter is made capital
				if(args[0].length() > 0){
					args[0] = args[0].toUpperCase().substring(0, 1) + args[0].substring(1);
				}
				System.out.println("Hello, " + args[0] + "!");
				return;
			}
		}
		System.out.println("Hello, World!");
	}
}
