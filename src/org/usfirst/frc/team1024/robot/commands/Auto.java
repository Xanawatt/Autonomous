package org.usfirst.frc.team1024.robot.commands;

import org.usfirst.frc.team1024.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

import java.util.Scanner;

/**
 * @author Cameron, Kylan, Allen, David, Lalit
 */

public class Auto extends Command {
	public int jobOne;
	public int jobTwoA;
	public int jobTwoB;
	public int jobTwoC;
	public int jobTwoD;
	public int jobTwoE;
	public int jobThreeA;
	public int jobThreeB;
	public int jobThreeC;
	public int jobThreeD;
	public int jobThreeE;
	public int jobThreeF;
	public int jobThreeG;
	public int jobThreeH;
	public int jobThreeI;
	public int jobThreeJ;
	public int jobThreeK;
	public int jobThreeL;
	public int jobThreeM;
	public int jobThreeN;
	public String type = "DoNothing";

	public static void main(String[] arguments) {
		Scanner position = new Scanner(System.in);
		int startPosition;

		do {
			System.out.println("GREETINGS, CARBON-BASED LIFEFORM. WHERE AM I AT THIS MOMENT IN TIME AND SPACE?");
			startPosition = position.nextInt();
			Auto autoCommand = new Auto();
			autoCommand.startingPosition = startPosition;
			autoCommand.execute();
		} while (startPosition == 1 || startPosition == 2 || startPosition == 3);

	}

	public int startingPosition;

	public Auto() {
		requires(Robot.exampleSubsystem);
		// startingPosition = blah;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		switch (startingPosition) {
		case 1: // Starting position 1
			switch (type) { //only go to peg W or S
			case "DoNothing":
				break;
			case "ShootWPeg":
				break;
			case "ShootSPeg":
				break;
			case "SPegShoot":
				break;
			case "WPegShoot":
				break;
			}
			break;
		case 2: // Starting position 2
			switch (type) {
			case "DoNothing":
				break;
			case "ShootNPeg":
				break;
			case "ShootSPeg":
				break;
			case "ShootWPeg":
				break;
			case "NPegShoot":
				break;
			case "WPegShoot":
				break;
			case "SPegShoot":
				break;
			}
			break;
		case 3: // Starting position 3
			switch (type) {
			case "DoNothing":
				break;
			case "ShootNPeg":
				break;
			case "ShootWPeg":
				break;
			case "NPegShoot":
				break;
			case "WPegShoot":
				break;
			}
			break;
		}
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			switch (jobOne) {
			case 1: // stay still --------- No auto programmed
				break;
			case 2: // shoot
				switch (jobTwoA) {
				case 1: // stay still
					break;
				case 2: // place gear in north
					switch (jobThreeA) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // place gear in east/west
					switch (jobThreeB) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 4: // place gear in south
					switch (jobThreeC) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 5: // use hopper
					switch (jobThreeD) {
					case 1: // stay still
						break;
					case 2: // place gear in north
						break;
					case 3: // place gear in east/west
						break;
					case 4: // place gear in south
						break;
					}
					break;
				}
				break;
			case 3: // place gear in north
				switch (jobTwoB) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeE) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // use hopper
					switch (jobThreeF) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				}
				break;
			case 4: // place gear in east/west
				switch (jobTwoC) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeG) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // use hopper
					switch (jobThreeH) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				}
				break;
			case 5: // place gear in south
				switch (jobTwoD) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeI) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // use hopper
					switch (jobThreeJ) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				}
				break;
			case 6: // use hopper ----- Not Priority ------
				switch (jobTwoE) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeK) {
					case 1: // stay still
						break;
					case 2: // place gear on north
						break;
					case 3: // place gear on east/west
						break;
					case 4: // place gear on south
						break;
					}
					break;
				case 3: // place gear in north
					switch (jobThreeL) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				case 4: // place gear in east/west
					switch (jobThreeM) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				case 5: // place gear in south
					switch (jobThreeN) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					default:
						break;
					}
					break;
				}
				break;
			}
			break;
		}
		*/


	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}