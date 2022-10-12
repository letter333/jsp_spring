package que;

public interface Pokemonable extends Animalable, Plantable {
	public void fight();
	
	@Override
	default void grow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void charming() {
		// TODO Auto-generated method stub
		
	}
}
