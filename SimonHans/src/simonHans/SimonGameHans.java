package simonHans;

import gui.GUIApplication;
import gui.Screen;

public class SimonGameHans extends GUIApplication {
	public static SimonScreenHans ss;
	public SimonGameHans(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		ss =  new SimonScreenHans(getWidth(),getHeight());
		setScreen(ss);
	}

	public static void main(String[] args) {
		SimonGameHans simonGame = new SimonGameHans(800,600);
		Thread app = new Thread(simonGame);
		app.start();

	}

}
