// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc.team1701.robot;

import com.ctre.CANTalon;

//import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
//import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import com.kauailabs.navx.frc.AHRS;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static Encoder shooterSystemShootingEncoder;
	public static DoubleSolenoid shooterSystemShooterLoader;
	public static AnalogInput gearArmGearDistanceSensor;
	public static DoubleSolenoid gearArmGearPusher;
	public static Relay lightsLED1;
	public static Relay lightsLED2;
	public static Relay lightsLED3;
	public static Relay lightsTargeting;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static SpeedController driveTrainLeft_1;
	public static SpeedController driveTrainLeft_2;
	public static SpeedController driveTrainRight_1;
	public static SpeedController driveTrainRight_2;
	public static SpeedController climberMotor1;
	public static SpeedController climberMotor2;
	public static SpeedController pickupBottomMotor;
	public static RobotDrive driveTrainRobotDrive41;
	public static SpeedController shoot1;
	public static SpeedController hopperMotor;

	public static final int VERSAPULSES = 1024;

	// NavX Micro, acting as NavX MXP over USB
	public static AHRS navx;

	public static void init() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		shooterSystemShootingEncoder = new Encoder(8, 9, false, EncodingType.k4X);
		LiveWindow.addSensor("ShooterSystem", "ShootingEncoder", shooterSystemShootingEncoder);
		shooterSystemShootingEncoder.setDistancePerPulse(1.0);
		shooterSystemShootingEncoder.setPIDSourceType(PIDSourceType.kRate);
		shooterSystemShooterLoader = new DoubleSolenoid(0, 0, 1);
		LiveWindow.addActuator("ShooterSystem", "ShooterLoader", shooterSystemShooterLoader);

		gearArmGearDistanceSensor = new AnalogInput(0);
		LiveWindow.addSensor("GearArm", "GearDistanceSensor", gearArmGearDistanceSensor);

		gearArmGearPusher = new DoubleSolenoid(0, 2, 3);
		LiveWindow.addActuator("GearArm", "GearPusher", gearArmGearPusher);

		lightsLED1 = new Relay(0);
		LiveWindow.addActuator("Lights", "LED1", lightsLED1);

		lightsLED2 = new Relay(1);
		LiveWindow.addActuator("Lights", "LED2", lightsLED2);

		lightsLED3 = new Relay(2);
		LiveWindow.addActuator("Lights", "LED3", lightsLED3);

		lightsTargeting = new Relay(3);
		LiveWindow.addActuator("Lights", "Targeting", lightsTargeting);

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		driveTrainLeft_1 = new CANTalon(2);
		LiveWindow.addActuator("DriveTrain", "Left_1", (CANTalon) driveTrainLeft_1);

		driveTrainLeft_2 = new CANTalon(3);
		LiveWindow.addActuator("DriveTrain", "Left_2", (CANTalon) driveTrainLeft_2);

		driveTrainRight_1 = new CANTalon(12);
		LiveWindow.addActuator("DriveTrain", "Right_1", (CANTalon) driveTrainRight_1);

		driveTrainRight_2 = new CANTalon(13);
		LiveWindow.addActuator("DriveTrain", "Right_2", (CANTalon) driveTrainRight_2);

		// driveTrainRobotDrive41 = new RobotDrive(driveTrainLeft_1,
		// driveTrainLeft_2,
		// driveTrainRight_1, driveTrainRight_2);

		// driveTrainRobotDrive41.setSafetyEnabled(true);
		// driveTrainRobotDrive41.setExpiration(0.1);
		// driveTrainRobotDrive41.setSensitivity(0.5);
		// driveTrainRobotDrive41.setMaxOutput(1.0);

		shoot1 = new CANTalon(1);
		climberMotor1 = new CANTalon(15);// top climber motor
		((CANTalon) climberMotor1).configEncoderCodesPerRev(VERSAPULSES);

		climberMotor2 = new CANTalon(14); // bottom climber motor

		pickupBottomMotor = new CANTalon(11);
		((CANTalon) pickupBottomMotor).configEncoderCodesPerRev(VERSAPULSES);

		hopperMotor = new CANTalon(0);

		// navx instantiated in robotInit()
	}
}
