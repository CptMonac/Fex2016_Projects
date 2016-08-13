package gwntutorial;
import robocode.*;

/*
   This intro lesson will teach you how to create your first robot and move it around the battle field.
   Creating a robot can be easy, making your robot a winner is not :)
   Writing a robot can be addictive. Once you get going, you'll watch your creation as it goes through growing pains, making mistakes and missing critical shots
   As you learn, you'll be able to teach your robot how to act and what to do, where to go and who to avoid

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
   4. Pick the robot you're working on from the left (e.g. MoveTutorial) and press 'Add' button.
   5. Press the 'Start Battle' button.
   6. A dialog box will pop up telling you you've only selected one robot. If you're just testing, hit 'Yes' and continue.
      Otherwise, hit 'No' and select another robot to battle against.

   Additional reference information and documentation is available in the 'javadoc' folder under 'Robocode'

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
    
   setColors(black, yellow, blue, white, red); //Set your robot's colors to have black body, yellow gun, blue radar, white bullets, red radar-scans
   
    while(true)
    {
      /*
          Reference: The 'while' function allows the 'run' function above to run repeatedly. If you didn't 
                      include it here, your robot would only do what you told it to do once, and then stop
      */

      turnTo(0);     //This function starts the robot facing forward
      
      turnRight(90); //Turn your robot right by 90 degrees.
      
      ahead(100);    //Move your robot forward by 100 pixels.
      
      back(100);     //Move your robot backward by 100 pixels.

      turnLeft(180); //Turn your robot left by 180 degrees.

      /*
        Congratulations! You have learned how to move your robot around the battlefield. 
        Continue to the scanning tutorial to learn how to use the radar and gun on the robot.
      */
    }
  }
}
