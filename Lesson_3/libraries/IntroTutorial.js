/*
   Pre-flight Instructions:
   1. Click the gear icon on the top right of the program.
   2. Go to the 'Show sidebar' option and make sure it's set to 'On'
   3. You should now see 'index.html', 'libraries', and 'sketch.js' on the left of the program
   4. Follow the instructions in the comments with numbers in them in order. E.g. #1 -- Draw an ellipse
   5. When you are finished with the comment, delete the comment block, switch with your partner and move to the next comment block.
*/

var x = 0;

function setup() {
  /*
      Reference: The setup() function runs once, and is used for setting things up. It's also used
                 for creating a program that does not need a loop running code repeatedly.
  */
  
  //Add your 'createCanvas' function below this line (#3.2)
  createCanvas(200, 200);

  //Add your 'background' function below this line (#4)
  background(200);

  ellipse(30, 50, 70, 32);

  line(10, 10, 50, 60);

}

function draw() {
  /*
      Reference: The draw() function runs repeatedly in a loop, and is typically used for animation.
  */
  
  ellipse(x, 50, 20, 20);

  x = x + 1;
}