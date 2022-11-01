package ui;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import api.Taverne;
import backend.Party;

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
			System.out.println("0 -> Spiel testen");
			System.out.println("1 -> Schaue alle Helden an");
			System.out.println("3 -> In den Dungeon gehen");
			System.out.println("9 -> Spiel verlassen");

			int input = Integer.parseInt(sc.nextLine());

			switch (input) {
			case 0: test(); break;
			case 1:
				showAllHeros();
				break;
			case 3:
				exploreDungeon();
			case 9:
				break mainloop;
			}
		}
	}

	private void test() {
		Party pt = new Party();
		int i = pt.getInitHero(0);
		int i1 = pt.getInitHero(1);
		System.out.println(i);
		System.out.println(i1);
	}

	private void firstStart() {
		tv = new Taverne();
		String[] party = tv.getParty();
		if (party.length == 0) {
			tv.makeHero("King Arthur");
			tv.makeHero("Sir Camelot");
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

	private void exploreDungeon() {
		Timer tm = new Timer();
		tv = new Taverne();
		MultiThreadTimer mt = new MultiThreadTimer();
		mt.start();
		tm.scheduleAtFixedRate(new TimerTask() {
			int i = -1;
			@Override
			public void run() {
				
				if (i == 10) {
					tm.cancel();
				}
			}
		},2000 - tv.getIniParty(), 1000);

	}
}
