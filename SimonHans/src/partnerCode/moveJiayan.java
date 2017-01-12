package partnerCode;

import simonHans.ButtonInterfaceHans;
import simonHans.MoveInterfaceHans;

public class moveJiayan implements MoveInterfaceHans {
	private ButtonInterface b;
	public moveJiayan(ButtonInterface b) {
		this.b = b;
	}

	@Override
	public ButtonInterfaceHans getButton() {
		return b;
	}

}
