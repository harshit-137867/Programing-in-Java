// Arguments
class MethodDemo {

	void SquareWithoutArgs() {
		int x = 5;
		System.out.println("Square without arguments : " + (x * x));
	}
	
	void SquareWithArgs(int x) {
		System.out.println("Square with arguments : " + (x * x));
	}

	int SquareWithArgsRet(int x) {
		return x * x;
	}

	int SquareWithoutArgsRet() {
			int x = 7;
			return x * x;
	}

	public static void main(String args[]) {
		MethodDemo m = new MethodDemo();
		m.SquareWithoutArgs();
		m.SquareWithArgs(3);
		System.out.println("Square with arguments and return : " + m.SquareWithArgsRet(4));
		System.out.print("Square without argument but return : " + m.SquareWithoutArgsRet());
	}
}