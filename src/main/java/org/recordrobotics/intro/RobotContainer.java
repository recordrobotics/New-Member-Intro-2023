// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.recordrobotics.intro;

import org.recordrobotics.intro.command.manual.ExampleManual;
import org.recordrobotics.intro.control.*;
import org.recordrobotics.intro.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

	private IControlInput _controlInput;

	private SingleControl m_singleControl = new SingleControl(RobotMap.Control.LEGACY_GAMEPAD);

	// The robot's subsystems and commands are defined here...
	private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

	private final ExampleManual m_teleopCommand = new ExampleManual(m_exampleSubsystem, m_singleControl);

	/**
	 * The container for the robot. Contains subsystems, OI devices, and commands.
	 */
	public RobotContainer() {
		// Configure the button bindings
		_controlInput = new SingleControl(RobotMap.Control.LEGACY_GAMEPAD);
		configureButtonBindings();
		System.out.println(_controlInput != null);
	}

	/**
	 * la dee da dee da
	 * Use this method to define your button->command mappings. Buttons can be
	 * created by
	 * instantiating a {@link GenericHID} or one of its subclasses ({@link
	 * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
	 * it to a {@link
	 * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
	 */
	private void configureButtonBindings() {
	}

	public Command getTeleopCommand() {
		// An ExampleCommand will run in autonomous
		return m_teleopCommand;
	}

	public void teleopInit() {
		m_exampleSubsystem.setDefaultCommand(m_teleopCommand);
	}

	/**
	 * Clear commands
	 */
	public void resetCommands() {
		CommandScheduler.getInstance().cancelAll();
	}
}
