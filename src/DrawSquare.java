import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
	public static void main(String[] args) {
		Robot bb8 = new Robot();
		bb8.penDown();
		bb8.setSpeed(500);
		for (int i = 4; i > 0; i--)
		{
			bb8.move(100);
			bb8.turn(90);
		}
	}

}
