package gwntutorial;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html
// This lesson will teach you how to move your robot around the field

/**
 *  #1 -- MoveTutorial - a robot by (your team name here)
 */
public class MoveTutorial extends JuniorRobot
{
	/**
	 * run: MoveTutorial's default behavior
	 */
	public void run() {
		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Function: setColors(body color, gun color, radar color, bullet color, radar scan color)
		// #2 -- Set your robot's colors

		// Robot main loop
		while(true) {
			
			turnTo(0);
			
			// Function: turnRight(no. of degrees)
			// #3 -- Turn your robot right by 90 degrees
			
			// Function: ahead(no. of pixels)
			// #4 -- Move your robot forward by 100 pixels
			
			// Function: back(no. of pixels)
			// #5 -- Move your robot backward by 100 pixels 
			
			// Function: turnLeft(no. of degrees)
			// #6 -- Turn your robot left by 180 degrees 
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
