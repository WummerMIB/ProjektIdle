package backend;

import ui.UI;

public abstract class Creature {

	private String name;
	private int hp;
	private int stamina;
	private int mana;
	private int defence;
	private int atk;
	private int spzDef;
	private int spzAtk;
	private int inititiv;

	public Creature(String name, int max, int min) {
		this.name = name;
		this.genarateStats(max, min);
	}

	public void genarateStats(int max,int min) {
		this.hp = generateNumber(max, min);
		this.stamina = generateNumber(max, min);
		this.mana = generateNumber(max, min);
		this.defence = generateNumber(max, min);
		this.atk = generateNumber(max, min);
		this.spzDef = generateNumber(max, min);
		this.spzAtk = generateNumber(max, min);
		this.inititiv = generateNumber(max, min);
	}

	public abstract void gear();

	public abstract boolean checkAlive();

	public int generateNumber(int max, int min) {
		int random = (int) (Math.random() * max) + min;
		return random;
	}
	
	public String toString() {
		return "Name: " + this.name + " Leben: " + this.hp + " Stamina: " + this.stamina + " Mana: " + this.mana + " Attacke: " + this.atk + " Defense: " + this.defence + " Spezial Attacke: " + this.spzAtk + " Spezial Defense: " + this.spzDef + " Initative: " + this.inititiv;
	}

}
