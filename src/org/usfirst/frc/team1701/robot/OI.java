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

import org.usfirst.frc.team1701.robot.commands.ForceClimb;
import org.usfirst.frc.team1701.robot.commands.GyroReset;
import org.usfirst.frc.team1701.robot.commands.HopperForward;
import org.usfirst.frc.team1701.robot.commands.HopperIdle;
import org.usfirst.frc.team1701.robot.commands.HopperRev;
import org.usfirst.frc.team1701.robot.commands.OverrideHighShot;
import org.usfirst.frc.team1701.robot.commands.Preciseify;
import org.usfirst.frc.team1701.robot.commands.RunAutoGear;
import org.usfirst.frc.team1701.robot.commands.RunAutoShoot;
import org.usfirst.frc.team1701.robot.commands.RunClimb;
import org.usfirst.frc.team1701.robot.commands.RunGearArm;
import org.usfirst.frc.team1701.robot.commands.RunIntake;
import org.usfirst.frc.team1701.robot.commands.RunIntakeReverse;
import org.usfirst.frc.team1701.robot.commands.RunTargetLight;
import org.usfirst.frc.team1701.robot.commands.StopClimb;
import org.usfirst.frc.team1701.robot.commands.StopIntake;
import org.usfirst.frc.team1701.robot.commands.ToggleReverse;
import org.usfirst.frc.team1701.robot.commands.Turboify;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton gearMode;
    public JoystickButton resetGyro;
    public JoystickButton preciseMode;
    public JoystickButton turboMode;
    public Joystick drive_FB;
    public Joystick drive_T;
    public JoystickButton autoShoot;
    public JoystickButton autoGear;
    public JoystickButton overrideGear;
    public JoystickButton overrideShot;
    public JoystickButton climbOn;
    public JoystickButton climbOff;
    public JoystickButton intakeOn;
    public JoystickButton intakeOff;
    public JoystickButton intakeReverse;
    public JoystickButton targetLightOn;
    public JoystickButton revHopper;
    public JoystickButton idleHopper;
    public JoystickButton forwardHopper;
    public JoystickButton bumpClimb;
    public Joystick operation;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	public OI() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        operation = new Joystick(2);
        
        bumpClimb = new JoystickButton(operation, 6);
        bumpClimb.whileHeld(new ForceClimb());
        forwardHopper = new JoystickButton(operation, 3);
        forwardHopper.whileHeld(new HopperForward());
        idleHopper = new JoystickButton(operation, 2);
        idleHopper.whileHeld(new HopperIdle());
        revHopper = new JoystickButton(operation, 1);
        revHopper.whileHeld(new HopperRev());
        targetLightOn = new JoystickButton(operation, 5);
        targetLightOn.whileHeld(new RunTargetLight());
        intakeReverse = new JoystickButton(operation, 12);
        intakeReverse.whileHeld(new RunIntakeReverse());
        intakeOff = new JoystickButton(operation, 15);
        intakeOff.whenPressed(new StopIntake());
        intakeOn = new JoystickButton(operation, 11);
        intakeOn.whileHeld(new RunIntake());
        climbOff = new JoystickButton(operation, 5);
        climbOff.whenPressed(new StopClimb());
        climbOn = new JoystickButton(operation, 9);
        climbOn.whileHeld(new RunClimb());
        overrideShot = new JoystickButton(operation, 10);
        overrideShot.whileHeld(new OverrideHighShot());
        overrideGear = new JoystickButton(operation, 15);
        overrideGear.whenPressed(new RunGearArm());
        autoGear = new JoystickButton(operation, 15);
        autoGear.whenPressed(new RunAutoGear());
        autoShoot = new JoystickButton(operation, 15);
        autoShoot.whileHeld(new RunAutoShoot());
        drive_T = new Joystick(1);
        
        drive_FB = new Joystick(0);
        
        turboMode = new JoystickButton(drive_FB, 2);
        turboMode.whileHeld(new Turboify());
        preciseMode = new JoystickButton(drive_FB, 1);
        preciseMode.whileHeld(new Preciseify());
        resetGyro = new JoystickButton(drive_FB, 4);
        resetGyro.whenPressed(new GyroReset());
        gearMode = new JoystickButton(drive_FB, 3);
        gearMode.whenPressed(new ToggleReverse());


        // SmartDashboard Buttons

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	}

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDrive_FB() {
        return drive_FB;
    }

    public Joystick getDrive_T() {
        return drive_T;
    }

    public Joystick getOperation() {
        return operation;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
