// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.recordrobotics.Mitocondrion.subsystems;

import org.recordrobotics.Mitocondrion.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private static final double gear_ratio = 20;

  private static final double kP = 0.1;
  private static final double kI = 0.1;
  private static final double kD = 0.1;

  private static final double tolerance = 0.5;

  private double target;

  private WPI_TalonFX _motor = new WPI_TalonFX(0);

  private PIDController PID = new PIDController(kP, kI, kD);

  public ExampleSubsystem() {
    _motor.set(0);
    PID.setTolerance(tolerance);
    resetEncoder();
  }

  public void resetEncoder(){
    _motor.getSelectedSensorPosition(0);
  }

  public double encoder(){
    return _motor.getSelectedSensorPosition() * Math.PI / 1024;
  }

  public void setTarget(double _angle){
    target = _angle;
  }

  @Override
  public void periodic() {
    PID.setSetpoint(target);
    _motor.set(PID.calculate(encoder()));
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
