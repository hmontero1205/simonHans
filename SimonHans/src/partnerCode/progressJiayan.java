package partnerCode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import gui.components.Component;
import simonHans.ProgressInterfaceHans;

public class progressJiayan extends Component implements ProgressInterfaceHans {
	private int roundNumber;
	private int sequenceNum;
	private boolean gameOver;
	public progressJiayan() {
		super(60,60,50,100);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void updateInfo(int roundNum, int i) {
		roundNumber += roundNum;
		sequenceNum += i;
		update();
	}

	@Override
	public void setGameOver() {
		// TODO Auto-generated method stub
		gameOver = true;
		update();
	}


	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		FontMetrics fm = g.getFontMetrics();
		if(gameOver){
			g.setColor(Color.blue);
			g.fillRect(0, 0, 50, 100);
			g.setColor(Color.black);
			//draw strings

		}else{
			g.setColor(Color.red);
			g.fillRect(0, 0, 50, 100);
			g.setColor(Color.black);
			g.drawRect(0, 0, 45, 95);
			//draw strings
		}

	}

}
