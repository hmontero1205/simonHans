package partnerCode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import gui.components.Component;
import simonHans.ProgressInterfaceHans;

public class progressJiayan extends Component implements ProgressInterfaceHans {
	private int roundNumber;
	private int sequenceNum;
	private boolean gameOver;
	public progressJiayan() {
		super(200,60,200,100);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void updateInfo(int roundNum, int i) {
		roundNumber = roundNum;
		sequenceNum = i;
		update();
	}

	@Override
	public void setGameOver() {
		// TODO Auto-generated method stub
		gameOver = true;
		update();
	}
	@Override
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(gameOver){
			g.setColor(Color.red);
			g.fillRect(0, 0, 200, 100);
			g.setColor(Color.black);
			g.drawRect(0, 0, 199, 99);
			g.drawString("Game Over",5,35);

		}else{
			g.setColor(Color.pink);
			g.fillRect(0, 0, 200, 100);
			g.setColor(Color.black);
			g.drawRect(0, 0, 199, 99);
		}
		g.drawString("Round: "+roundNumber,5,55);
		g.drawString("Current Sequence Length: "+sequenceNum,5,75);
	}

}
