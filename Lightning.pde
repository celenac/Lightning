int startX=0;
  int startY=150;
  int endX=0;
  int endY=150;

void setup()
{
  size(500,400);
  frameRate(500);
  background(0);
  startX=250;
	startY=0;
}
void draw()
{
	stroke(255, (int)(Math.random()*4)+232, (int)(Math.random()*255));
  strokeWeight((int)(Math.random()*3));
	endX=startX+((int)(Math.random()*10)+(int)(Math.random()*-10));
	endY=startY+((int)(Math.random()*-10)+10);
	line(startX, startY,endX,endY);
	startX=endX;
	startY=endY;
}

void mousePressed()
{

startX=(int)(Math.random()*500);
 startY=0;
 endX=0;
endY=150;
}

