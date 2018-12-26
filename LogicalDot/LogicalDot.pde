void setup()
{
  size(800,800);
}
void draw()
{
  background(100,100,100);
  ellipse(50,50,100,100);
}
void mousePressed() {
  if (mouseButton == LEFT) {
    fill(0);
  } else if (mouseButton == RIGHT) {
    fill(255);
  } else if (mouseButton == CENTER){
    fill(126);
  }
}