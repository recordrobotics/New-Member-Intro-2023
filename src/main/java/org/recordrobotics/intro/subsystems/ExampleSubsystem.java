// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.recordrobotics.intro.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  
  private static final double GEAR_RATIO = 1;
  private CANSparkMax _motor = new CANSparkMax(5, MotorType.kBrushless);
  
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    _motor.set(0);
    _motor.getEncoder().setPositionConversionFactor(GEAR_RATIO);
  }

  public void spin(double speed){
    _motor.set(speed);
  }

  public double encoder(){
    return _motor.getEncoder().getPosition();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
