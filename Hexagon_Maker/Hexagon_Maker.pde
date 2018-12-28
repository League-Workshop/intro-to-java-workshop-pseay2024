int x, y;
int[][] i;
void setup()
{
  size(700,700);
  noStroke();
  x = 0;
  y = 0;
}

void draw()
{
  fill(255,random(150),random(150));
  Hex h = new Hex();
  i = h.makepoints(50,50,5);
  quad(i[0][0],i[0][1],i[1][0],i[1][1],i[2][0],i[2][1],i[3][0],i[3][1]);
  quad(i[3][0],i[3][1],i[4][0],i[4][1],i[5][0],i[5][1],i[2][0],i[2][1]);
  
  fill(255,random(150),random(150));
  i = h.makepoints(64,64,5);
  quad(i[0][0],i[0][1],i[1][0],i[1][1],i[2][0],i[2][1],i[3][0],i[3][1]);
  quad(i[3][0],i[3][1],i[4][0],i[4][1],i[5][0],i[5][1],i[2][0],i[2][1]);
  
  fill(255,random(150),random(150));
  i = h.makepoints(78,78,5);
  quad(i[0][0],i[0][1],i[1][0],i[1][1],i[2][0],i[2][1],i[3][0],i[3][1]);
  quad(i[3][0],i[3][1],i[4][0],i[4][1],i[5][0],i[5][1],i[2][0],i[2][1]);
  
}