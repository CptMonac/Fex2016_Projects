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
    
    setColors(black, yellow, blue, white, red);
   
    while(true)
    {
      /*
          Reference: The 'while' function allows the 'run' function above to run repeatedly. If you didn't 
                      include it here, your robot would only do what you told it to do once, and then stop
      */

      turnTo(0);     //This function starts the robot facing forward
      
      turnRight(90);
      
      ahead(100);
      
      back(100);

      turnLeft(180);
      
      /*
        Congratulations! You have learned how to move your robot around the battlefield. 
        Continue to the scanning tutorial to learn how to use the radar and gun on the robot.
      */
    }
  }
}
