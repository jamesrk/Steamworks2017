// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2876.Steamworks2017;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Relay;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.PWMSpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainFrontLeftTalon;
    public static CANTalon driveTrainFrontRightTalon;
    public static CANTalon driveTrainRearLeftTalon;
    public static CANTalon driveTrainRearRightTalon;
    public static Relay driveTrainLightSpike;
    public static CANTalon shooterTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static PWMSpeedController lightSpike;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFrontLeftTalon = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "FrontLeftTalon", driveTrainFrontLeftTalon);
        
        driveTrainFrontRightTalon = new CANTalon(8);
        LiveWindow.addActuator("DriveTrain", "FrontRightTalon", driveTrainFrontRightTalon);
        
        driveTrainRearLeftTalon = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "RearLeftTalon", driveTrainRearLeftTalon);
        
        driveTrainRearRightTalon = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "RearRightTalon", driveTrainRearRightTalon);
        
        driveTrainLightSpike = new Relay(0);
        LiveWindow.addActuator("DriveTrain", "LightSpike", driveTrainLightSpike);
        
        shooterTalon = new CANTalon(0);
        LiveWindow.addActuator("Shooter", "Talon", shooterTalon);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        lightSpike = new PWMSpeedController(0){
        	
        };
    }
}
