package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends Command {
    public DriveCommand(DriveSubsystem driveSubsystem, double distance) {
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize() {
        // Initialize drive command
    }

    @Override
    public void execute() {
        // Drive the robot backward
    }

    @Override
    public boolean isFinished() {
        // Finish after driving specified distance
        return false; // Change to true when done
    }
}