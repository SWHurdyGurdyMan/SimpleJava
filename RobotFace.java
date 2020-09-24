//This program draws a robots face in the center of the program window
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class RobotFace extends GraphicsProgram {
	private static final double HEAD_WIDTH = 100.0;
	private static final double HEAD_HEIGHT = 150.0;
	private static final double EYE_RADIUS = 10.0;
	private static final double MOUTH_WIDTH = 60.0;
	private static final double MOUTH_HEIGHT = 20.0;
	

	public void run() {
		double width = (getWidth()/2);
		double height =  (getHeight()/2);
		robotHead(width, height);
	}
	//draws robot's head from other methods
	private void robotHead(double x, double y) {
		robotFace(x, y);
		leftRobotEye(x - HEAD_WIDTH / 4, y - HEAD_HEIGHT / 4);
		rightRobotEye(x + HEAD_WIDTH / 4, y - HEAD_HEIGHT / 4);
		robotMouth(x, y + HEAD_HEIGHT/4);
	}
	//draws robot's face
	private void robotFace(double x, double y) {
		GRect head = new GRect(x - HEAD_WIDTH/2, y - HEAD_HEIGHT/2, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);		
		add(head);
	}
	//draws robot's left eye(your left)
	private void leftRobotEye(double x, double y) {
		double a = x - EYE_RADIUS;
		double b = y - EYE_RADIUS;
		GOval lefteye = new GOval(a, b, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		lefteye.setFilled(true);
		lefteye.setFillColor(Color.YELLOW);
		add(lefteye);
	}
	//draws robot's right eye(your right)
	private void rightRobotEye(double x, double y) {
		double a = x - EYE_RADIUS;
		double b = y - EYE_RADIUS;
		GOval righteye = new GOval(a, b, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		righteye.setFilled(true);
		righteye.setFillColor(Color.YELLOW);
		add(righteye);
	}
	//draws robot's mouth
	private void robotMouth(double x, double y) {
		double a = x - MOUTH_WIDTH/2;
		double b = y - MOUTH_HEIGHT/2;
		GRect mouth = new GRect(a, b, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);		
		add(mouth);
	}
}