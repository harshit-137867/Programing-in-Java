class HelloWorld {

	void display() {
		System.out.println("Hello World Display Method.");
	}

	void show(int x) {
		System.out.println("Show Method : " + x);
	}

	HelloWorld() {
		System.out.println("This is default constructor.");
	}

	HelloWorld(int x) {
		System.out.println("This is parameterised : " + x);
	}

	public static void main(String args[]) {

		HelloWorld ob = new HelloWorld();
		HelloWorld ob2 = new HelloWorld(30);
		ob.display();
		ob.show(10);
	}
}