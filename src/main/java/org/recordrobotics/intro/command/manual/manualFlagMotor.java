// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.recordrobotics.intro.command.manual;

import org.recordrobotics.intro.control.SingleControl;
import org.recordrobotics.intro.subsystems.FlagMotor;

import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class manualFlagMotor extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final FlagMotor _motor;
  private final SingleControl _control;

  /**
   * Creates a new ExampleCommand.
   *
   * @param m_FlagMotor The subsystem used by this command.
   */
  public manualFlagMotor(FlagMotor m_FlagMotor, SingleControl control) {
    _motor = m_FlagMotor;
    _control = control;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(_motor);
  }


  private void addRequirements(manualFlagMotor subsystem) {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double motorSpeed = _motor.getSpeed();
    if(_control.turnMotor()) {
      if(motorSpeed > 0) {
        _motor.turn(0.2);
      }
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
