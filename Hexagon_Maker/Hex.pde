public class Hex
{
  int[][] makepoints(int centerX, int centerY, int sizeCoefficient)
  {
    int[][] points = new int[6][2];
    points[0][0] = centerX - (1 * sizeCoefficient);// upleft
    points[0][1] = centerY - (2 * sizeCoefficient);
    points[1][0] = centerX + (1 * sizeCoefficient);//upright
    points[1][1] = centerY - (2 * sizeCoefficient);
    points[2][0] = centerX + (2 * sizeCoefficient);//right
    points[2][1] = centerY;
    points[3][0] = centerX - (2 * sizeCoefficient);//left
    points[3][1] = centerY;
    points[4][0] = centerX - (1 * sizeCoefficient);
    points[4][1] = centerY + (2 * sizeCoefficient);
    points[5][0] = centerX + (1 * sizeCoefficient);
    points[5][1] = centerY + (2 * sizeCoefficient);
    return points;
  }
}