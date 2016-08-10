package gwntutorial;
import robocode.*;

/*
   This intro lesson will teach you how to create your first robot and move it around the battle field.
   Additional reference information and documentation is available at: http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html

   Pre-flight Instructions:
   1. Follow the numbered instructions in order. E.g. #2 -- Set your robot's colors would be the second thing you do
   2. In Java, lines must end with a semi-colon. Don't forget to add one at the end of each line.
   3. After finishing every comment, save the program (Ctrl+S), and then compile it (Ctrl+B).
   4. You can add your robot to the battlefield after every save to see what you've just changed.
*/


public class MoveTutorial extends JuniorRobot
{
  /*
      Reference: This program is creating a 'JuniorRobot' type robot. It provides some simple functions
                  and defaults that allow us to quickly create a robot.
  */

  public void run()
  {
    /*
       Reference: The 'run' function is the function that tells your robot what to do, and how to dress.
    */
    
    /*
       #1 -- Set your robot's colors to have the following properties:
              black body, yellow gun, blue radar, white bullets, red radar-scans
        
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

      turnTo(0);     //This function starts the robot facing forward
      
      /*
         #2 -- Turn your robot right by 90 degrees.

          Reference: turnRight(<no. of degrees>)
                     This function turns the robot right by the number of degrees you specify.
                     E.g. turnRight(12) -> turn the robot right by 12 degrees 
      */
      
      /*
         #3 -- Move your robot forward by 100 pixels.
               A pixel is the unit of measurement in the battle-field.

          Reference: ahead(<no. of pixels>)
                     This function moves the robot ahead by the number of pixels you specify.
                     E.g. ahead(500) -> move the robot ahead by 500 pixels
      */
      
      /*
         #4 -- Move your robot backward by 100 pixels.

         Reference: back(<no. of pixels>)
                    This function moves the robot backward by the number of pixels you specify.
                    E.g. back(500) -> move the robot backward by 500 pixels
      */
      
      /*
         #5 -- Turn your robot left by 180 degrees.

          Reference: turnLeft(<no. of degrees>)
                     This function turns your robot left by the number of degrees you specify.
                     E.g. turnleft(12) -> turns the robot left by 12 degrees
      */
      
      /*
        Congratulations! You have learned how to move your robot around the battlefield. 
        Continue to the scanning tutorial to learn how to use the radar and gun on the robot.
      */
    }
  }
}
