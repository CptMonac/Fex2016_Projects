/**
 * @name  Audio visualizer
 * @description <p>Visualize the waveform in a music sample using Processing.</p>
 * 
 */
var song, analyzer, sampleSize, radius, innerRadius;
var samples = [];
var circleColor, peakDetection;

function preload() {
  song = loadSound('assets/Oluwani.mp3');
}

function setup() {
  createCanvas(700, 700);
  colorMode(HSB, 360, 100, 100);
  ellipseMode(RADIUS);
  circleColor = color(315, 84, 93);

  sampleSize = 1024;
  radius = 100;
  innerRadius = 20;
  song.loop();

  // create a new FFT analyzer
  analyzer = new p5.FFT(0, sampleSize);
  //peakDetection = new p5.Amplitude();
  peakDetection = new p5.PeakDetect();

  // Patch the input to an volume analyzer
  analyzer.setInput(song);
}

function draw() {
  background(0, 0, 7);

  //Get waveform samples
  samples = analyzer.waveform();
  analyzer.analyze();
  var bufLen = samples.length;
  //var vol = peakDetection.getLevel();
  peakDetection.update(analyzer);
  
  //Move coordinate system to cartesian coordinates
  push();
  translate(width/2, height/2);
  
  for (var i =0; i<bufLen - 1;i++)
  {
    var angle_degrees = map(i, 0, bufLen, 0, 360);
    var angle_radians = radians(angle_degrees);
    var song_power = samples[i] * radius;
    var xlocation= (radius+song_power)*cos(angle_radians);
    var ylocation = (radius+song_power)*sin(angle_radians);
    stroke(circleColor);
    point(xlocation, ylocation);
  }

  //if (vol > 0.5)
  if (peakDetection.isDetected)
    innerRadius = 100;
  else
    innerRadius *= 0.80;
  noStroke();
  fill(circleColor);
  
  if (innerRadius > 40)
  {
  
    ellipse(0, 0, innerRadius, innerRadius);
    if (hue(circleColor) < 269)
      circleColor = color(315, 84, 93);
    else
      circleColor = color(hue(circleColor) - 1, 84, 93);
  }
  pop();
}
