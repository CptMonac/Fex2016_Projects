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
   	6. When you are finished with the comment, switch with your partner and move to the next comment block.

   	Testing your robot on the battlefield:
    1. If you don't have the Robocode program already open, double-click the 'robocode.bat' file in the Robocode folder
    2. Click the 'Battle' menu, then select New
    3. Under the 'Packages' column, select 'gwntutorial'. You should now see the list of GWN robots in the 'Robots' column on the right.
    4. Pick the robot you're working on from the left (e.g. ScanTutorial) and press 'Add' button.
    5. Pick another robot you want to battle against. (e.g. sample.Crazy) and press 'Add' button.
    6. Press the 'Start Battle' button.
    
    Additional reference information and documentation is available in the 'javadoc' folder under 'Robocode'
*/
// This lesson will teach you how to use the radar to scan the battlefield. The scanner is the fastest moving part of your robot, so it's important to learn how to use it well.
// Your robot has a few senses: sense of touch, sense of sight, meta senses
// Sense of touch: Your robot knows when it's hit a wall, been hit by a bullet, or if it hit another robot
// Meta senses: Your robot knows when it's died, or when another robot has died. It also knows if a bullet hits a wall or another bullet.

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

		/*
       		Setting the robot's colors.
        
            Reference: setColors(<body color>, <gun color>, <radar color>, <bullet color>, <radar-scan color>)
                   This function sets the colors for your robot's body, gun, radar, bullets, and radar-scans.
            E.g. setColors(orange, red, yellow, blue, pink) -> orange body, red gun, yellow radar, blue bullets, pink radar-scans
    	*/

		while(true)
		{
			/*
	          Reference: The 'while' function allows the 'run' function above to run repeatedly. If you didn't 
	                      include it here, your robot would only do what you told it to do once, and then stop
      		*/
			
	        /*
				#1 -- Move the radar in a 360 degree scan around your robot

				Reference: turnRadarRight(<no. of degrees>)
							This function turns the radar to the right by the number of degrees you specify
						E.g. turnRadarRight(20) -> Move the radar in a 20 degree scan around the robot
	        */
		}
	}

	public void onScannedRobot(ScannedRobotEvent enemyRobot)
	{
		/*
			Reference: The 'onScannedRobot' function tells your robot what to do when the radar sees another robot.
		*/
		
		double enemyRadarAngle;		//This variable will store the angle to turn the radar to lock onto the enemy robot
		double enemyGunAngle;		//This variable will store the angle to turn the gun to lock onto the enemy robot
		
		/*
			#2.1 -- Let's lock the radar to the enemy robot's position
				  	Store the angle to turn the radar to face the enemy in the 'enemyRadarAngle' variable

			Reference example: magicJohnson = 32;
 					In this example, you store the number 32 in the magicJohnson variable.

			Reference: getEnemyRadarHeading(enemyRobot)
					This function returns the angle that the radar should turn to lock onto the enemy robot you specify
					E.g. getEnemyRadarHeading(enemyRobot) -> returns 10 degrees to lock onto enemyRobot 			
		*/

		/*
			#2.2 -- Turn your radar to face the angle that the enemy robot was spotted. 
					This will be the angle in your 'enemyRadarAngle' variable above
		*/
		
		
		/*
			#3.1 -- Let's lock the gun of the robot to the enemy robot's position. Otherwise, the robot will shoot in the wrong direction
					Store the angle the angle to turn the gun to face the enemy in the 'enemyGunAngle' variable
			
			Reference: getEnemyGunHeading(enemyRobot)
					This function returns the angle that the gun should turn to face the enemy robot you specify
					E.g. getEnemyGunHeading(enemyRobot) -> returns 20 degrees to face the enemyRobot
		*/

		/*
			#3.2 -- Turn your gun to face the angle that the enemy robot was spotted.
					This will be the angle in your 'enemyGunAngle' variable above.

			Reference: turnGunRight(<no. of degrees>)
						This function turns the gun to the right by the number of degrees you specify
					E.g. turnGunRight(20) -> Turn the gun right by 20 degrees

		*/


		/*
			#4 -- Fire an energy bullet of power 2 at the enemy robot

			Reference: fire(<no.>)
						This function will immediately fire a bullet with power equal to the number you specify in the direction the gun is pointing.
						You can only specify a number between 1 and 3. The higher numbers you specify, the longer the gun takes to recharge before it can fire again.
				E.g. fire(2) -> fires a bullet with power 2 at the enemy robot
		*/
	}

	public void onHitByBullet(HitByBulletEvent bulletEvent)
	{
		/*
			Reference: The 'onHitByBullet' function tells the robot what to do when it's hit by a bullet
		*/

		/* 
			#5 -- If the robot is hit by a bullet, tell the robot to do the following:
				  Turn right by 45 degrees
				  Move ahead by 60px
			
			Reference: turnRight(<no. of degrees>)
                     This function turns the robot right by the number of degrees you specify.
                     E.g. turnRight(12) -> turn the robot right by 12 degrees 

            Reference: ahead(<no. of pixels>)
                     This function moves the robot ahead by the number of pixels you specify.
                     E.g. ahead(500) -> move the robot ahead by 500 pixels

		*/

	}
	
	public void onHitWall(HitWallEvent wallEvent)
	{
		/*
			Reference: The 'onHitWall' function tells the robot what to do when it hit a wall
		*/

		/* 
			#6 -- If the robot hit a wall, tell the robot to do the following:
				  Turn left by 20 degrees
				  Move back by 10px

			Reference: turnLeft(<no. of degrees>)
	                This function turns your robot left by the number of degrees you specify.
	                E.g. turnleft(12) -> turns the robot left by 12 degrees 

	        Reference: back(<no. of pixels>)
                    This function moves the robot backward by the number of pixels you specify.
                    E.g. back(500) -> move the robot backward by 500 pixels

		*/
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
