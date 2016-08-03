package gwntutorial;
import robocode.Robot;
import robocode.*;
import java.awt.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html
// This lesson will teach you how to use the radar to scan the battlefield. The scanner is the fastest moving part of your robot, so it's important to learn how to use it well.
// Your robot has a few senses: sense of touch, sense of sight, meta senses
// Sense of touch: Your robot knows when it's hit a wall, been hit by a bullet, or if it hit another robot
// Sense of sight: Your robot knows when it's seen another robot
// Meta senses: Your robot knows when it's died, or when another robot has died. It also knows if a bullet hits a wall or another bullet.

/**
 * ScanTutorial - a robot by (your team name here)
*/
public class ScanTutorial extends Robot
{
	/**
	 * run: ScanTutorial's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		setColors(Color.green, Color.blue, Color.orange, Color.white, Color.red);
		
		// Robot main loop
		while(true) {
			
			//Function: turnRadarRight(no. of degrees) - move the radar <no. of degrees> degrees
			// #1 -- Move the radar in a 360 degree circle around your robot
			turnRadarRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent enemyRobot) {
		//Lock the radar to the enemy robot location if there is an enemy robot seen.
		turnRadarRight(getHeading() - getRadarHeading() + enemyRobot.getBearing());
		
		// Function: enemyRobot.getBearing() - get the enemy robot location
		// #2 -- Turn your tank right to lock onto your enemy's location

		// Function: fire(no.) - fires with <no.> power at enemy robot. Number must be between 1 and 3
		// #3 -- Fire at enemy robot!
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// #4 -- Move 30px backward if hit by a bullet

	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// #5 -- Move 10px backward if the robot hits a wall. 

	}	
}
