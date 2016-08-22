package gwntutorial;
import robocode.Robot;
import robocode.*;
import java.awt.*;

public class championBot extends Robot
{
	public void run()
	{
		//Set the champion bot's colors --#1

		while(true)
		{
			
			//Move the radar in a 360 degree scan --#2
	        
		}
	}

	public void onScannedRobot(ScannedRobotEvent enemyRobot)
	{
		
		
		//Store the enemy robot angle in a new variable called enemyRadarAngle --#3a

		//Turn the radar to face the enemy robot --#3b
				
		//Store the angle to turn the gun in a new variable called enemyGunAngle --#4a

		//Turn the gun to face the enemy robot --#4b
		
		//Fire an energy bullet of power 2 at the enemy robot --#5		

	}

	public void onHitByBullet(HitByBulletEvent bulletEvent)
	{
		//Tell the robot to turn right by 45 degrees and move ahead by 60 px, if it's hit --#6

	}
	
	public void onHitWall(HitWallEvent wallEvent)
	{
		
		//Tell the robot to tur left by 20 degrees and move back by 10px if it hits a wall --#7
	
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

		double angle = getHeading() + enemyRobot.getBearing() - getGunHeading();
		return normalizeGunBearing(angle);
	}

	public double normalizeGunBearing(double inputAngle)
	{
		/*
			Reference: This function normalizes the input angle to be between -180 and 180 degrees, so that the robot gun can turn efficiently
		*/
		while (inputAngle > 180)
			inputAngle -=360;

		while (inputAngle < -180)
			inputAngle +=360;

		return inputAngle;
	}
	

}
