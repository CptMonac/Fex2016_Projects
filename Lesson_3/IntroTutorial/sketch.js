/*
   Pre-flight Instructions:
   1. Click the gear icon on the top right of the program.
   2. Go to the 'Show sidebar' option and make sure it's set to 'On'
   3. You should now see 'index.html', 'libraries', and 'sketch.js' on the left of the program
   4. Follow the instructions in the comments with numbers in them in order. E.g. #1 -- Draw an ellipse
   5. When you are finished with the comment, delete the comment block, switch with your partner and move to the next comment block.
*/

// Variable 'x' goes below this line (#3.1)

function setup() {
  /*
      Reference: The setup() function runs once, and is used for setting things up. It's also used
                 for creating a program that does not need a loop running code repeatedly.
  */
  
  //Add your 'createCanvas' function below this line (#3.2)

  //Add your 'background' function below this line (#4)

  /* #1 -- Draw an ellipse using the ellipse function
      Reference: ellipse(<x-coordinate>, <y-coordinate>, <width>, <height>) E.g. ellipse(20, 40, 80, 50)
  */

  /* #2 -- Draw a line using the line function
      Reference: line(<starting x-coordinate>, <starting y-coordinate>, <ending x-coordinate>, <ending y-coordinate>) 
                 E.g. line(10, 10, 30, 40)
  */

  /* #3.1 -- By default, the drawing canvas has a size of 100 pixels by 100 pixels. Let's set a custom size.
             Set the canvas size to 400 pixels by 400 pixels
      Reference: createCanvas(<canvas width>, <canvas height>) E.g. createCanvas(200, 200) for a 200px by 200px canvas
  */
  

  /* #3.2 -- It's a good idea to always make the 'createCanvas' function the first line in your 'setup' function. You won't see anything you draw otherwise.
             Cut and paste your createCanvas function to the location indicated above.
  */
  
  /* #4 -- Let's add a background color to the canvas.
           Add a gray background to the canvas.
           Make sure you put this function right below the createCanvas function or you won't see anything you draw.
      Reference: background(<number>). The background function allows you to specify a value between black and white. 0 is black, 255 is white.
                 E.g. background(0) draws a black background
  */
}

function draw() {
  /*
      Reference: The draw() function runs repeatedly in a loop, and is typically used for animation.
  */
  
  /* #5.1 -- Let's create a variable that can store numbers so you don't have to think of numbers to put into your functions every time.
             Create a variable called 'x' and put it before the 'setup' function above. The starting value of 'x' should be 0
      
      Reference example: create a variable called 'fade' with a starting value of 10 -> var fade = 10
  */
  
  /* #5.2 -- Draw an ellipse below. Use the 'x' variable you created as the x-coordinate. 
             The y-coordinate should be 50 pixels. The width and the height should be 20 pixels.
  */

  /* #6 -- Let's animate your ellipse. Add the number 1 to your variable 'x' so that it gets bigger every time the 'draw' function is run
      
      Reference example: add 50 to a variable called 'fade' -> fade = fade + 50
  */

}