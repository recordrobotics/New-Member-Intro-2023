package org.recordrobotics.Mitocondrion.control;

import edu.wpi.first.wpilibj.XboxController;

public class SingleControl implements IControlInput {

	private static final double TRIGGER_THRESHOLD = 0.25;

	private XboxController _gamepad;
	// Toggles for buttons - inversed when button is pressed
	private boolean _btnX;
	private boolean _btnY;
	private double target = 0;

	public SingleControl(int port) {
		_gamepad = new XboxController(port);
	}

	public double arm(){
		if(_gamepad.getLeftTriggerAxis() > TRIGGER_THRESHOLD) target += 0.1;
		if(_gamepad.getRightTriggerAxis() > TRIGGER_THRESHOLD) target -= 0.1;
		return target;
	}
}
