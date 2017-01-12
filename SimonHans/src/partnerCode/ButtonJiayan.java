package partnerCode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import gui.components.Action;
import gui.components.Component;
import simonHans.ButtonInterfaceHans;

public class ButtonJiayan extends Component implements ButtonInterfaceHans {
	private boolean highlight;
	private Color color;
	private Action action;
	
	public ButtonJiayan(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x,y,60,60);
	}

	@Override
	public boolean isHovered(int x, int y) {
		return ((x>this.getX() && x<(this.getX()+this.getWidth())) && (y>this.getY() && y<(this.getY()+this.getHeight())));
	}
	
	@Override
	public void setAction(Action a) {
		this.action = a;

	}

	@Override
	public void turnOn() {
		highlight = true;
		update();

	}

	@Override
	public void turnOff() {
		highlight =false;
		update();

	}

	@Override
	public void setColor(Color c) {
		// TODO Auto-generated method stub
		this.color = c;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(highlight) 
		{
			g.setColor(this.color);
		}
		else g.setColor(Color.gray);
		g.fillOval(0, 0, 60, 60);
		g.setColor(Color.black);
		g.drawOval(0, 0, 59, 59);
		
	}

	@Override
	public void act() {
		this.action.act();
		
	}

}
