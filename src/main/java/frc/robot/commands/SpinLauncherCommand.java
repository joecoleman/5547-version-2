package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.LauncherSubsystem;

public class SpinLauncherCommand extends Command {
    public SpinLauncherCommand(LauncherSubsystem launcherSubsystem) {
        addRequirements(launcherSubsystem);
    }

    @Override
    public void initialize() {
        // Initialize launcher spinning
    }

    @Override
    public void execute() {
        // Spin the launcher
    }

    @Override
    public boolean isFinished() {
        // Finish after specified time or condition
        return false; // Change to true when done
    }
}
