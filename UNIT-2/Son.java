class Father {
	void house() {
		System.out.println("Fahter's House.");
	}
}

class Son extends Father {
	void bike() {
		System.out.println("Its my bike.");
	}

	public static void main(String args[]) {
		Son d = new Son();
		d.bike();
		d.house();
	}
}