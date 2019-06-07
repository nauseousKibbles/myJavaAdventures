//package hello;

public class helloprogram {

	public static void main(String[] args) {
		
		System.out.println("Hello " + args[0]);
		System.out.println("Hello again" + args[0]);

		helloprogram x = new helloprogram();
		x.other();


	}
	
	public void other() {
		System.out.println("Oh hello there...");
	}


}
