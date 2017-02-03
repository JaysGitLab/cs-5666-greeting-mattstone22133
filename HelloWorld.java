public class HelloWorld {
	private static String computerName = null;
	public static void main(String[] args) {
		if (args != null) {
			if (args.length == 1) {
				printName(args);
				return;
			} else {
				printNameAndComp(args);
				return;
			}
		}
		System.out.println("Hello, World!");

	}
	
	private static void printNameAndComp(String[] args) {
		if(args[0].equals("-me")){
			setComputerName(args[1]);
			printName(new String[]{args[2]});
		}else {
			System.out.println("Hello, World!");
		}
	}

	public static void printName(String[] args){
		//ensure first letter is made capital
		if(args[0].length() > 0){
			args[0] = capitalizeName(args[0]);
		}
		System.out.println("Hello, " + args[0] + "!");
	}
	
	public static String capitalizeName(String name){
		return name.toUpperCase().substring(0, 1) + name.substring(1);
	}

	public static String getComputerName() {
		return computerName;
	}

	public static void setComputerName(String computerName) {
		HelloWorld.computerName = computerName;
	}
	
	
}
