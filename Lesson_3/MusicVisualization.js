/**
 * @name Music Visualizer
 * @description 
 * <p>This lesson will teach you how to visualize the waveform in a music sample using p5.js</p>
*/

/* 
  Pre-Flight Instructions
  1. On the left, you should see two folders - 'assets', and 'libraries'. 
     Don't see them?
      * Click on the gear icon on the top right. 
      * Scroll to the 'Show sidebar' option, then click 'On'. 
  
  2. Follow the comments with numbers in order and delete the comments once you are finished with them.

  3. Any functions you need will be called out in a 'reference' comment. Some of these reference comments
     will also include examples to show you how to use the function.
*/

//Variables used for initialization
var songAnalyzer, frequencies;

//Create your song variable below this line (#1.1)
var song;

//Create your volume variable below this line (#3.1)
var volume;

//Create your diameter variable below this line (#3.2)
var diameter;

function preload()
{
  /*
     Reference: The preload function allows you to load files and objects before the 'setup' function is called.
                We will be using this function to load our songs before the 'setup' function is called.
  */
    
  /*
     #1.1 -- Create a variable called 'song' before the 'preload' function. 
             We'll use this variable to store our song.
      
      Reference example: create a variable called 'hamet' -> var hamet
  */

  /*
     #1.2 -- Let's load a song you can play into the canvas
             Load the 'Mungopark' song from the assets folder into your song variable.
     
      Reference: loadSound('<enter your mp3 filename path>') 
                 e.g.: hamet = loadSound('assets/example.mp3')
  */
  song = loadSound('assets/Mungopark.mp3');

}

function setup()
{
  /* 
    Reference: The 'setup' function is used for initialization and setting things up...
  */
  initializer();

  /*
     #1.3 -- Let's play the song you loaded in the 'preload' function.
      
      Reference: play(). The 'play' function lives inside a song variable. It cannot be called unless you have a song variable
                 e.g. hamet.play()
  */
  song.play();
  
  
  //Set the initial value of the diameter variable below this line (#3.3)
  diameter = 100;                      
}

function draw()
{
  /*
      Reference: The 'draw' function is used for animation...
  */ 
  
  /* 
     #2.1 -- Draw a black background for the canvas
      
      Reference: background(<number>). This function draws a background color between black and white. 0 is black, 255 is white
                  e.g. background(255) will draw a white background
  */
  background(0);

  //Add your 'fill' function below this line to color your circle (#2.3)
  fill(random(255), 0, 0);

  /*
     #2.2 -- Draw a circle on the canvas. Make sure the circle is centered in the canvas (700px by 700px).
             The circle should be 100px wide.
      
      Reference: ellipse(<x-coordinate>,<y-coordinate>, <width>, <height>) e.g. ellipse(20, 20, 40, 40);
  */

  /*
     #2.3 -- Color your circle red.
             Make sure to call the 'fill' function before you draw your circle, so you can change the color.
      
      Reference: fill(<red value>, <green value>, <blue value>). 
                 Computers can generate any color using combinations of red, green and blue values. 
                 All the values must be between 0 and 255
                 e.g. fill(0,0,255) creates the color blue
  */

  
  /*
      #3.1 -- Create a variable called 'volume' before the 'preload' function. 
             We'll use this variable to store the volume of the song.
  */

  
  /*
      #3.2 -- Create a variable called 'diameter' before the 'preload' function. 
             We'll use this variable to store the width of the circle you're going to draw.
  */

  /*
      #3.3 -- In the 'setup' function above, set the initial value of the diameter variable to 100
        
        Reference example: dynamite = 50 -> sets the value of the dynamite variable to 50
  */

  /*
      #3.4 -- Replace the width and height of your ellipse function above with the dynamite variable.
              Using a variable instead of numbers allows you to easily adjust the size of your circle.
  */

  /*
      #3.5 -- Let's make the circle use a random red color each time it's drawn.
        
        Reference: random(<number>). This function will give you a random number between 0 and the number you enter.
          E.g. random(100) -> gives a random number between 0 and 100 each time it's called
  */


  /*
      #4.1 -- We're now going to make your circle respond to the music.
              Store the current volume of your song in the 'volume' variable you created earlier.
        
        Reference: getVolume(). This returns the current volume of the song that is playing.
                    e.g. marker = getVolume();
  */
  volume = getVolume();

  /*
      #4.2 -- Let's change the size of your circle according to how loud the song is. This should get you a boombox effect.
              Multiply the 'diameter' variable with the 'volume' variable and store the result in the 'volume' variable.

        Reference: Multiplication in p5.js is done using '*'. E.g. answer = 15 * answer
  */
  volume = diameter * volume;

  /*
      #4.3 -- Now, that you have a diameter affected by volume, let's draw a circle boombox.
              Delete your ellipse function from above.
              Draw a new circle on the canvas. Make sure the circle is centered in the canvas. 
              The width of your circle should be the 'volume' variable above.
  */

  //Create your new ellipse function below this line (#4.3)
  ellipse(350,350, volume, volume);
  
  /*
      #5.1 -- For the final piece, we will display a waveform of the song, so you can see as it plays in realtime.
              Get the waveform for the song and store this waveform in a new variable called 'samples'

        Reference: getWaveform(). This returns the waveform of the song that is playing.
                    e.g. marker = getWaveform();
  */
  var samples = getWaveform();
  
  /*
      #5.2 -- Draw the waveform to the canvas
      
        Reference: drawWaveform(<input waveform>). This function draws the waveform for the input song
                    e.g. drawWaveform(inputSamples)
  */
  drawWaveform(samples);
  
  //You can try changing the song you load into the sketch to see a different visualization

  
}

function initializer()
{
  /*
    Reference: This function initializes variables and sets up the canvas for the Music visualization sketch
  */
  
  createCanvas(700,700);             //Create a window that is 700px by 700px
  ellipseMode(RADIUS);               //Set ellipses and circles to draw outward from their centers
  songAnalyzer = new p5.Amplitude();     //Create a new sound amplitude analyzer 
  frequencies = new p5.FFT(0, 1024); //Create a new sound frequency analyzer that takes in samples in 1024 sample chunks
  stroke(255, 255, 255);             //Set the line color to white when drawing shapes

  //Load the selected song for amplitude and frequency analysis
  if (song !== null)
  {
    songAnalyzer.setInput(song);
    frequencies.setInput(song);
  }
}

function getVolume()
{
  /* 
    Reference: This function returns the volume (amplitude) of the song that is playing
  */
  return songAnalyzer.getLevel();
}

function getWaveform()
{
   /*
     Reference: This function returns the waveform of the song that is playing
   */
   return frequencies.waveform();
}

function drawWaveform(inputSound)
{
    /*
      Reference: This function draws the waveform for the sound that is input
    */

  noFill();
  beginShape();
  for (var i =0; i<inputSound.length; i++)
  {
    var xCoord = map(i, 0, inputSound.length, 0, width);    //Map the input range to the width of the sketch
    var yCoord = inputSound[i]* 200 + height/2;             //Map the amplitude values to the height of the sketch
    vertex(xCoord, yCoord);
  }
  endShape();
}