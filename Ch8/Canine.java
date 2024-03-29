abstract public class Canine extends Animal {
	public Canine() {
		this("defaultCanine");
	}

	public Canine(String nm) {
		super(nm);
		System.out.println("Making an canine");
	}	
	
	public abstract void makeNoise();
	public void eat() {
		hunger -= 5;
		if (hunger < 0) {
			hunger = 0;
		}
	}

	public void roam() {
		System.out.println("I'm roaming around with my family...");
	}
}