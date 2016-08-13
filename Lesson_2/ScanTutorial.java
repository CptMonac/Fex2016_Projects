package gwntutorial;
import robocode.Robot;
import robocode.*;
import java.awt.*;

/*
	This intro lesson will teach you how to use radar and gun of your robot.
	In the Robocode game, angles increase in a clockwise direction starting from "North". 
	This means the top wall is at 0 degrees, the right wall is at 90 degrees, and the left wall is at 270 degrees. 
	Take a look at 'RobocodeAngles.jpg' in the 'Lesson_2' folder for an overview of the angles. 

	Pre-flight Instructions:
	1. Follow the numbered instructions in order. E.g. #1 -- Move the radar in a 360 degree circle around your robot -> would be the first thing you do
   	2. In Java, lines must end with a semi-colon. Don't forget to add one at the end of each line.
   	3. In Java, functions are case-sensitive, make sure you are typing a function name exactly as it looks in the reference comment.
   	4. After finishing every comment, save the program (Ctrl+S), and then compile it (Ctrl+B).
   	5. You can add your robot to the battlefield after every save to see what you've just changed.

   	Testing your robot on the battlefield:
    1. If you don't have the Robocode program already open, double-click the 'robocode.bat' file in the Robocode folder
    2. Click the 'Battle' menu, then select New
    3. Under the 'Packages' column, select 'gwntutorial'. You should now see the list of GWN robots in the 'Robots' column on the right.
    4. Pick the robot you're working on from the left (e.g. ScanTutorial) and press 'Add' button.
    5. Pick another robot you want to battle against. (e.g. sample.Crazy) and press 'Add' button.
    6. Press the 'Start Battle' button.
    
    Additional reference information and documentation is available in the 'javadoc' folder under 'Robocode'
*/

public class ScanTutorial extends Robot
{
	/*
		Reference: This program is creating a regular type robot, not a 'JuniorRobot' like the earlier tutorial.
				    Functions will remain largely the same with some small variations. E.g. 'Color.green' instead of just 'green' to set the color to green
	*/
	public void run()
	{
		/*
			Reference: The 'run' function is the function that tells your robot what to do, and how to dress.
		*/

		setColors(Color.black, Color.blue, Color.orange, Color.white, Color.red); //Set robot's colors 

		while(true)
		{
		/*
	          Reference: The 'while' function allows the 'run' function above to run repeatedly. If you didn't 
	                      include it here, your robot would only do what you told it to do once, and then stop
      		*/
	
			turnRadarRight(360); //Move the radar in a 360 degree scan around your robot
		}
	}

	public void onScannedRobot(ScannedRobotEvent enemyRobot)
	{
		/*
			Reference: The 'onScannedRobot' function tells your robot what to do when the radar sees another robot.
		*/
		
		double enemyRadarAngle;		//This variable will store the angle to turn the radar to lock onto the enemy robot
		double enemyGunAngle;		//This variable will store the angle to turn the gun to lock onto the enemy robot
		
		enemyRadarAngle = getEnemyRadarHeading(enemyRobot); //Store the angle to turn the radar to face the enemy in the 'enemyRadarAngle' variable
		turnRadarRight(1.9*enemyRadarAngle); //Turn your radar to face the angle that the enemy robot was spotted. 
		
		enemyGunAngle = getEnemyGunHeading(enemyRobot); //Store the angle the angle to turn the gun to face the enemy in the 'enemyGunAngle' variable
		turnGunRight(enemyGunAngle); //Turn your gun to face the angle that the enemy robot was spotted.

		fire(2); //Fire an energy bullet of power 2 at the enemy robot
	}

	public void onHitByBullet(HitByBulletEvent bulletEvent)
	{
		/*
			Reference: The 'onHitByBullet' function tells the robot what to do when it's hit by a bullet
		*/

		turnRight(45); //Turn right by 45 degrees
		ahead(60); //Move ahead by 60px

	}
	
	public void onHitWall(HitWallEvent wallEvent)
	{
		/*
			Reference: The 'onHitWall' function tells the robot what to do when it hit a wall
		*/

		turnLeft(20);  // Turn left by 20 degrees
        	back(10); //Move back by 10px
	}

	public void onBulletHit(BulletHitEvent bulletEvent)
	{
		/*
			Reference: The 'onBulletHit' function tells the robot what to do when it hit an enemy robot with a bullet
						Feel free to modify this function to tell your robot what to do if it hits an enemy.
		*/

	}

	public double getEnemyRadarHeading(ScannedRobotEvent enemyRobot)
	{
		/*
			Reference: This function returns the angle that the radar should turn to face the enemy robot you specify
		*/

		return getHeading() + enemyRobot.getBearing() - getRadarHeading();
	}

	public double getEnemyGunHeading(ScannedRobotEvent enemyRobot)
	{
		/*
			Reference: This function returns the angle that the gun should turn to face the enemy robot you specify
		*/

		return getHeading() + enemyRobot.getBearing() - getGunHeading();
	}
	

}
