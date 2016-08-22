package gwntutorial;
import robocode.Robot;
import robocode.*;
import java.awt.*;

public class championBot extends Robot
{
	public void run()
	{
		setColors(Color.black, Color.blue, Color.orange, Color.white, Color.red);

		while(true)
		{
			turnRadarRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent enemyRobot)
	{
		
		double enemyRadarAngle;		//This variable will store the angle to turn the radar to lock onto the enemy robot
		double enemyGunAngle;		//This variable will store the angle to turn the gun to lock onto the enemy robot
		
		
		enemyRadarAngle = getEnemyRadarHeading(enemyRobot);

		
		turnRadarRight(1.9*enemyRadarAngle);
		
		
		enemyGunAngle = getEnemyGunHeading(enemyRobot);

		
		turnGunRight(enemyGunAngle);


		fire(2);
	}

	public void onHitByBullet(HitByBulletEvent bulletEvent)
	{
		turnRight(45);
		ahead(60);

	}
	
	public void onHitWall(HitWallEvent wallEvent)
	{
		
        turnLeft(20);
        back(10);
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
