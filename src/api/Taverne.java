package api;

import java.util.ArrayList;
import java.util.Collection;

import backend.Hero;
import backend.Party;

public class Taverne {

	private Party party;
	
	public Taverne() {
		this.party = new Party();
	}

	public void makeHero(String h) {
		party.addHero(h);
	}

	public String[] getParty() {
		Collection<Hero> fullParty = party.getHeros();
		String[] list = new String[fullParty.size()];
		
		int i = 0;
		for (Hero h : fullParty) {
			list[i++] = h.toString();
		}
		
		return list;
	}

	public int getIniParty() {
		Collection<Hero> fullParty = party.getHeros();
		int fast = 0;
		int i = 0;
		if(i < fullParty.size()) {
			fast = party.getInitHero(i);
			i++;
		}else {
			i = 0;
		}
		return fast;
	}

}
