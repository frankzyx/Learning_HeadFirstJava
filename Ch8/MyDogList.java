// polymorphism

public class MyAnimalList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;
	
	public void add(Animal d) {
		if (nextIndex < animals.length) {
			System.out.println("Animal added at " + nextIndex);
			animals[nextIndex++] = d;			
		}
	}
}
