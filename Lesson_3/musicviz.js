/**
 * @name Music Visualizer
 * @description 
 * <p>This lesson will teach you how to visualize the waveform in a music sample using p5.js</p>
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
  song = loadSound('assets/Mungopark.mp3');
}

function setup()
{
  /* 
    Reference: The 'setup' function is used for initialization and setting things up...
  */
  initializer();

  song.play();
  
    //Set the initial value of the diameter variable below this line (#3.3)
  diameter = 100;                      
}

function draw()
{
  /*
      Reference: The 'draw' function is used for animation...
  */ 
  
  background(0);

  //Add your 'fill' function below this line to color your circle (#2.3)
  fill(random(255), 0, 0);
  volume = getVolume();

  volume = diameter * volume;

  //Create your new ellipse function below this line (#4.3)
  ellipse(350,350, volume, volume);
  
  var samples = getWaveform();
  
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
