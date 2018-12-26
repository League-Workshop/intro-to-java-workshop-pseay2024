PImage smile;
PImage mustache;
PImage hat;
boolean keyPress = false;
void setup()
{
  if (keyPress == false)
  {
  smile = loadImage("Smile.jpeg");
  size(800,500);
  smile.resize(800,500);
  mustache = loadImage("Moustache.png");
  mustache.resize(400,80);
  hat = loadImage("Hat.png");
  hat.resize(120,100);
  }
}

void draw()
{
  background(smile);
  if (mousePressed == true)
  {
    if (mouseButton == LEFT)
    {
      image(mustache, mouseX - 200, mouseY - 40);
    }
    else if (mouseButton == RIGHT)
    {
      image(hat,340,10);
    }
    
  }
  
}

void keyPressed()
{
  background(0,0,0);
  
}

void keyReleased()
{
  b = true;
}