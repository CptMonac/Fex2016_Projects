/**
 * @name  Audio visualizer
 * @description 
 * <p>This lesson will teach you how to visualize the waveform in a music sample using the Javascript language.</p>
 * <p>We'll be using a Javascript library called p5.js that was built to teach computer programming in a visual context.
 * It is used in a lot of new media art installations and in many visual design communities. </p>
 * 
 */

/* Before starting, make sure you can see all files needed for this project. On the left you should see
   two folders - 'assets', and 'libraries'. There should also be two files available - 'index.html' and 'sketch.js'
   If you don't see these, click on the gear icon on the top right. Scroll to the 'Show sidebar' option and then click 'On'.
   
   Delete comments with numbers on them once you are finished with them.
*/
var song, analyzer, radius
var samples = [];
var volume, frequencies;

function preload(){
  // This function allows you to preload files before the program has started
  
  // Expand the 'assets' folder on the left and take a look at the files in there.
  // Function: loadSound('<enter your mp3 filename path') e.g. loadSound('assets/example.mp3');
  //#1 -- Pre-load a song from the assets folder into the program

  // Variables allow you to store values so you can use them later
  // E.g. radius = 10
  //#2 -- Pre-load the same song from the assets folder into the 'song' variable
  song = loadSound('assets/Mungopark.mp3');
  
  //You don't need to load the song twice. Delete the first pre-loading so the program loads a bit faster.

}

function setup() {
  //This function sets up the things the program needs to run properly
  
  createCanvas(700,700);             //Create a window that is 700px by 700px
  ellipseMode(RADIUS);               //Set ellipses and circles to draw outward from their centers
  analyzer = new p5.Amplitude();     //Create a new sound amplitude analyzer 
  frequencies = new p5.FFT(0, 1024); //Create a new sound frequency analyzer that takes in samples in 1024 sample chunks
  stroke(255, 255, 255);             //Set the line color to white when drawing shapes
  radius = 100;                      //Set the default value of radius variable
  
  // Function: play() e.g. monitor.play();
  //#3 -- Use the song variable from earlier to play the song you just loaded
  song.play();
  
  // Function: background(<number>).The function uses number between 0 and 255. 0 is very black, 255 is very white.
  // E.g. background(20);
  //#4 -- The page is blank. Add a grey background to the page. 
  background(100);
  
  // p5.js provides a function that can analyze the volume (amplitude) of any song you give it.
  // Function: setInput(<song variable>) e.g. monitor.setInput(songza);
  //#6.2 -- Set the input for the 'analyzer' variable as your song.
  analyzer.setInput(song);
  
  // p5.js also provides a function that can analyze the frequency components of any song you give it.
  //#8.1 -- Set the input for the 'frequencies' variable as your song
  frequencies.setInput(song);
}

function draw() {
  // You may have noticed that when you draw circles, they all draw on top of each other.
  //#7.4 -- To prevent this from happening, set the background color of the page.
  background(0);
  
  // Function: getLevel() e.g. monitor.getLevel();
  //#6.3 -- Use the analyzer variable to get the volume of your song and store it in the 'volume' variable
  volume = analyzer.getLevel();
  
  // Multiplication in p5.js is done using '*'. E.g. b = 5 * 3;
  //#6.4 -- Multiply the 'radius' variable with the 'volume' variable. And store this result in the 'volume' variable.
  volume = radius * volume;
  
  // p5.js has a function that allows you to set the color for any objects that will be drawn to the screen.
  // Computer colors are generated using combinations of red, green and blue. By giving different combinations of each, you can generate any color.
  // Function: fill(<red value>, <green value>, <blue value>). All the values must be between 0 and 255. E.g. fill(45,89, 255)
  //#7.2 -- Color your circle red.
  fill(random(255), 0, 0);
  
  // p5.js has a function that can give you a random number every time you call it.
  // Function: random(<number>). The function will give you a random number between 0 and the number you enter. E.g. random(31);
  //#7.3 -- Modify your color selection above to use a random shade of red to draw the circle
  
  //Function: ellipse(<x-location>,<y-location>, <width>, <height>) e.g. ellipse(20,20, 40, 40);
  //#5 -- Let's draw something to the page. Draw a circle on the page with a radius of 100
  ellipse(350,350, volume, volume);
 
  // Let's make your circle more interactive
  //#6.1 -- Use the 'radius' variable for the width, and height of your ellipse above.
  
  //#6.5 -- Use the 'volume' variable for the width, and height of your ellipse above.

  // The program has been set to display in a window 700px wide, 700px high.
  //#7.1 -- Modify your circle above to draw in the center.
  
  // For the final piece, we will display a waveform of your song, so you can see it as it plays in realtime
  // Function: waveform(). This function will return a list of the frequencies and their corresponding values in your song.
  // E.g. monitor.waveform();
  //#8.2 -- Get the waveform for your song from the 'frequencies' variable and store this waveform in the 'samples' variable. 
  samples = frequencies.waveform();
  
  //Go through every frequency in the 'samples' variable and draw a sound waveform for all present frequencies
  for (var i =0; i<samples.length; i++)
  {
    //p5.js stores the values for all the frequencies of your song in a list.
    //To get a particular value from the list, for example the value for frequency 0, you would use samples[0]
    //9.1 --Create a variable called 'singleFreq' that stores the frequency value for variable 'i' above
    var singleFreq = samples[i];
    
    //Function: point(<x-location>, <y-location>). This function draws a point at the (x,y) location you specify. E.g. point(40, 100)
    //#9.2 -- Draw a point for every frequency in the 'samples' variable. Use 'i', as the x-coordinate, and the 'singleFreq' variable as the y-coordinate
    point(i, singleFreq * 90 + 350 );
    
    // You may have noticed that the lines appear all the way at the top. Let's fix this.
    // 9.3 -- Add 350 to the y-coordinate of your point function above.
    
    // Great! The line is now visible, but it looks a little bit small. Let's magnify the line.
    //#9.4 -- To make the lines bigger, multiply the value of the 'singleFreq' variable in your point function above by 90
    
    //Feel free to add any more visualizations you would like to see for your song.
    //You can add more lines, circles, ellipses, triangles... the sky is the limit.
  }

  
}
