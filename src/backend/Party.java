package backend;

import java.util.Collection;
import java.util.HashMap;

import ui.UI;


public class Party {
	
	private HashMap<Integer, Hero> heroParty = new HashMap<>();
	private int partyNum;
	
	public Party() {
		this.partyNum = -1;
	}
	
	
	public void addHero(String name) {
		Hero h = new Hero(name, 16, 15);
		heroParty.put(++partyNum, h);
	}
	
	public Collection<Hero> getHeros() {
		return heroParty.values();
	}

}
