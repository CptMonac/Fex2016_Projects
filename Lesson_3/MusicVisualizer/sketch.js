/**
 * @name Music Visualizer
 * @description 
 * <p>This lesson will teach you how to visualize the waveform in a music sample using p5.js</p>
*/

//Variables used for initialization
var songAnalyzer, frequencies;

//Create a song variable --#1a

//Create a volume variable --#6a

//Create a diameter variable --#6b

function preload()
{
  //Load the song variable into the canvas --#1b
}

function setup()
{
  initializer();

  //Play the song you loaded into the canvas --#1c
  

  //Set the initial value of the diameter variable below this line (#3.3)

  
}

function draw()
{
  
  //Draw a black background for the canvas --#2
  
  //Color the circle red --#4
  
  //Make the circle use a random red color each time it's drawn --#5
  
  //Draw a 100px wide circle --#3

  //Get the current volume and store it in the song variable --#6c
  
  //Multiply the diameter variable by the volume variable --#6d
  
  //Draw a new circle that simulates boombox effect --#6e

  //Get waveform of currently playing song --#7a
  
  //Draw waveform --#7b
  
}

function initializer()
{
  /*
    Reference: This function initializes variables and sets up the canvas for the Music visualization sketch
  */
  
  createCanvas(700,700);             //Create a window that is 700px by 700px
  ellipseMode(RADIUS);               //Set ellipses and circles to draw outward from their centers
  songAnalyzer = new p5.Amplitude(); //Create a new sound amplitude analyzer 
  frequencies = new p5.FFT(0, 1024); //Create a new sound frequency analyzer that takes in samples in 1024 sample chunks
  stroke(255, 255, 255);             //Set the line color to white when drawing shapes

  //Load the selected song for amplitude and frequency analysis
  if ((typeof song !== 'undefined') && (song !== null))
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
