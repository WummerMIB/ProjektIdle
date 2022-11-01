package backend;

public class Hero extends Creature {

	private int level = 1;
	private int exp = 100;

	public Hero(String name, int max, int min) {
		super(name, max, min);
	}

	@Override
	public void gear() {
		
	}

	@Override
	public boolean checkAlive() {
		return true;
	}
	
	@Override
	public String toString() {
		return "Level: " + this.level + " "+super.toString() + " Erfahrung: " + this.exp;
	}

}
