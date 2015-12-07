package gtg;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * GilbertTheGreat - a robot by (Gilbert)
 */
public class GilbertTheGreat2_0 extends AdvancedRobot
{
	double energyOld = 100;
	/**
	 * run: GilbertTheGreat's default behavior
	 */
	public void run() {
		setAdjustRadarForGunTurn(true);
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnRadarRight(360);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		setTurnRadarRight(getHeading() - getRadarHeading() + e.getBearing());
		setTurnGunRight(getHeading() - getGunHeading() + e.getBearing());
		fire(3);
		double energyNew = e.getEnergy();
		if(energyNew < energyOld){
		turnRight(90);
		ahead(50);
		}
		energyOld = energyNew;
		}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
