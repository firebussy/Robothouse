import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		Robot fire=new Robot();
		fire.miniaturize();
		fire.setSpeed(10);
		fire.move(-250);
		fire.turn(-90);
		fire.move(400);
		fire.turn(90);
		fire.setRandomPenColor();
		fire.penDown();
		fire.move(100);
		fire.turn(90);
		fire.move(50);
		fire.turn(90);
		fire.move(100);
		/*
		
		
		fire.move(10);
		fire.turn(90);
		fire.move(150);
		fire.turn(90);
		fire.move(10);
		fire.turn(90);
		fire.move(150);
		fire.penUp();
		fire.turn(150);
		fire.move(90);
		fire.setRandomPenColor();
		fire.penDown();
		fire.turn(45);
		fire.move(10);
		fire.turn(93);
		fire.move(150);
		*/
	}
}
