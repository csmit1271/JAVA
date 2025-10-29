
public class AnnoObject {

	
	public static void main(String[] args) {
		Rocket r  = new Rocket();
		r.add();
		r.add();
		r.add(); 
		
		new Rocket().add();//instance -> anno 
		new Rocket().add();
		
	}
}

class Rocket {
	private void blastOff() {
		System.out.print("bang ");
	}
	
	void add() {
		System.out.println("add");
	}
}

 class Shuttle extends Rocket {
	public static void main(String[] args) {
		new Shuttle().go();
	}

	void go() {
		blastOff(); // Calls Shuttle's blastOff()
		// Rocket.blastOff(); // line A
	}

	private void blastOff() {
		System.out.print("sh-bang ");
	}
}