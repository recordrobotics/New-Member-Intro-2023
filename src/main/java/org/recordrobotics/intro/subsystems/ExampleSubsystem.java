
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.recordrobotics.intro.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
// import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class ExampleSubsystem extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */

  // private CANSparkMax motorName = new CANSparkMax(5, MotorType.kBrushless);

  private WPI_TalonFX motorName = new WPI_TalonFX(500);


  public ExampleSubsystem() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    motorName.set(0.2);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation

  }
}
