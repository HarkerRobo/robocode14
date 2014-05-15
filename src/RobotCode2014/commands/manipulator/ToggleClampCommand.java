/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RobotCode2014.commands.manipulator;

import RobotCode2014.commands.CommandBase;

/**
 *
 * @author farzin
 */
public class ToggleClampCommand extends CommandBase {
    
    public ToggleClampCommand() {
        requires(manipClamp);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (manipClamp.isClampOpen())
            manipClamp.closeClamp();
        else
            manipClamp.openClamp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
