size(800,800);
fill(#FF0329);
ellipse(400,400,100,100);
fill(#0039FF);
ellipse(400,400,50,50);
fill(#9CA8D3);
noStroke();
rect(380,380,40,40);
int b = 1;
for (int i = 100; i > 0; i--)
{
  switch(b)
  {
    case 1:
    fill(#0039FF);
    b = 2;
    break;
    case 2:
    fill(#9CA8D3);
    b = 1;
    break;
  }
  ellipse(400,400,i,i);
}