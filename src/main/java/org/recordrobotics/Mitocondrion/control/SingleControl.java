package org.recordrobotics.Mitocondrion.control;

import edu.wpi.first.wpilibj.XboxController;

public class SingleControl implements IControlInput {

	private static final double TRIGGER_THRESHOLD = 0.25;

	private XboxController _gamepad;
	// Toggles for buttons - inversed when button is pressed
	private boolean _btnX;
	private boolean _btnY;

	public SingleControl(int port) {
		_gamepad = new XboxController(port);
	}
}
