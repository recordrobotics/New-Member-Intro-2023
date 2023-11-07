// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.recordrobotics.intro.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
CanSparkMax private CANSparkMax [motor name] = new CANSparkMax([motor port], MotorType.kBrushless);

Falcon500 private WPI_TalonFX [motor name] = new WPI_TalonFX(1);
public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    new WPI_TalonFX(1).set([50]);
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
