package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class FireIntakeCommand extends Command {
    private static final Subsystem intakeSubsystem = null;

    public FireIntakeCommand() {
        addRequirements(intakeSubsystem);
    }

	

	@Override
    public void initialize() {
        // Initialize firing intake
    }

    @Override
    public void execute() {
        // Fire the intake
    }

    @Override
    public boolean isFinished() {
        // Finish after firing once
        return true;
    }
}
