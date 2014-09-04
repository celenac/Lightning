import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=0;
  int startY=150;
  int endX=0;
  int endY=150;

public void setup()
{
  size(500,400);
  frameRate(500);
  background(0);
  startX=250;
	startY=0;
}
public void draw()
{
	stroke(255, (int)(Math.random()*4)+232, (int)(Math.random()*255));
  strokeWeight((int)(Math.random()*3));
	endX=startX+((int)(Math.random()*10)+(int)(Math.random()*-10));
	endY=startY+((int)(Math.random()*-10)+10);
	line(startX, startY,endX,endY);
	startX=endX;
	startY=endY;
}

public void mousePressed()
{

startX=(int)(Math.random()*500);
 startY=0;
 endX=0;
endY=150;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
