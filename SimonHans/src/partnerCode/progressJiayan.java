package partnerCode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import gui.components.Component;
import simonHans.ProgressInterfaceHans;

public class progressJiayan extends Component implements ProgressInterfaceHans {
	private int roundNumber;
	private int sequenceNum;
	public progressJiayan() {
		super(200,600,50,100);
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
		// TODO Auto-generated method stub
		g.setColor(new Color(200,220,255));
	//	g.drawRectangle();
	}

}
