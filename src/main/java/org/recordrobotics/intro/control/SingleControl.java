package org.recordrobotics.intro.control;

import edu.wpi.first.wpilibj.XboxController;

public class SingleControl implements IControlInput {

	private static final double TRIGGER_THRESHOLD = 0.25;

	private XboxController _gamepad;
	// Toggles for buttons - inversed when button is pressed
	private boolean _btnX = false;
	private boolean _btnY;

	public SingleControl(int port) {
		_gamepad = new XboxController(port);
	}

	public boolean getFlagState() {
		if(_gamepad.getXButton()) _btnX = !_btnX;
		return _btnX;
	}
}
