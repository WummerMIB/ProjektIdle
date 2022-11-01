package ui;

import java.util.Scanner;

import api.Taverne;

public class UI {

	private Scanner sc = new Scanner(System.in);
	private Taverne tv;

	public UI() {
		mainMenue();
	}

	private void mainMenue() {

		firstStart();
		mainloop: while (true) {
			System.out.println("Hero Party Idler");
			System.out.println("----------------");
			System.out.println("1 -> Schaue alle Helden an");

			int input = Integer.parseInt(sc.nextLine());

			switch (input) {
			case 1:
				showAllHeros();
				break;
			case 9:
				break mainloop;
			}
		}
	}

	private void firstStart() {
		tv = new Taverne();
		String[] party = tv.getParty();
		if (party.length == 0) {
			tv.makeHero("King Arthur");
		}
	}

	private void showAllHeros() {
		String[] party = tv.getParty();
		if (party.length > 0) {
			System.out.println("Ihre ganzen Helden sind");
			for (String s : party) {
				System.out.println(s);
			}
		} else {
			System.out.println("Sie haben noch keine Helden");
		}
	}
}
