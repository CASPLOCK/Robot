// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc.team1701.robot.commands;

import org.usfirst.frc.team1701.robot.Robot;
import org.usfirst.frc.team1701.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TeleopDrive extends Command {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public TeleopDrive() {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.driveTrain.resetLeftEncoder();
		Robot.driveTrain.resetRightEncoder();
		// System.out.println("Teleop Drive Initialized.");
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
        Robot.lights.getTargetingLED().set(Relay.Value.kOn);
        
		SmartDashboard.putNumber("Left Encoder Reading: ", Robot.driveTrain.getLeftDistance());
		SmartDashboard.putNumber("Right Encoder Reading: ", Robot.driveTrain.getRightDistance());
		SmartDashboard.putNumber("Navx Reading: ", RobotMap.navx.getYaw());
		// Drivetrain control using joysticks

		double deadConst = .10; // can change the deadConst to make a larger or
								// smaller deadzone
		// double forwardsBackwardsInput =
		// checkDeadZone(oi.drive_Forwards_Backwards.getRawAxis(1), deadConst);
		double fBInput = checkDeadZone(Robot.oi.drive_FB.getY(), deadConst);
		double tInput = .75 * checkDeadZone(Robot.oi.drive_T.getX(), deadConst);

		// System.out.println("Input: FB: " + fBInput + " : " +
		// Robot.oi.drive_FB.getY());
		// System.out.println("Input: T: " + tInput + " : " +
		// Robot.oi.drive_T.getX());

		Robot.driveTrain.teleopControl(fBInput, tInput);

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}

	private double checkDeadZone(double input, double deadConst) {
		/*
		 * creates a deadzone: any input within the deadzone will be equal to
		 * zero. this is used to make sure that even if the joystick does not
		 * read zero when at rest, it will not move the robot
		 */
		if (input > 0) {
			if (deadConst >= input)
				input = 0;
		} else {
			if (-deadConst <= input)
				input = 0;
		}
		return input;
	}
}
