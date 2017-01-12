package partnerCode;

import simonHans.ButtonInterfaceHans;
import simonHans.MoveInterfaceHans;

public class moveJiayan implements MoveInterfaceHans {
	private ButtonInterfaceHans b;
	public moveJiayan(ButtonInterfaceHans b) {
		this.b = b;
	}

	@Override
	public ButtonInterfaceHans getButton() {
		return b;
	}

}
