package backend;

import java.util.Collection;
import java.util.HashMap;

import ui.UI;

public class Party {

	private HashMap<Integer, Hero> heroParty = new HashMap<>();
	private int partyNum = -1;

	public Party() {
	}

	public void addHero(String name) {
		Hero h = new Hero(name, 16, 15);
		heroParty.put(++partyNum, h);
	}

	public Collection<Hero> getHeros() {
		return heroParty.values();
	}

	public int getInitHero(int i) {
		Collection<Hero> party = heroParty.values();
		int[] list = new int[party.size()];
		int x = 0;
		for(Hero h : party) {
			list[x++] = h.getInititiv();
		}
		
		int temp;
		for (int y = 0; y < list.length; y++) {
			for(int z = y; z < list.length; z++) {
				if(list[y] < list[z]) {
					temp = list[y];
					list[y] = list[z];
					list[z] = temp;
				}
			}
		}
		
		
		return list[i];
	}

}
