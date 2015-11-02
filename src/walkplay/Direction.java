package walkplay;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Direction {
	final static int UP = 0;
	final static int DOWN = 1;
	final static int LEFT = 2;
	final static int RIGHT = 3;
	final static int SPACE = 4;

	private JLabel display = null;
	private int direction = 1;
	private URL fileURL = null;

	public Direction(JLabel display) {
		// TODO Auto-generated constructor stub
		this.display = display;
	}

	public void show(int directionIn) {

		if (!directionStateIsSame(directionIn)) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			switch (directionIn) {
			case LEFT:
				direction = LEFT;
				displayDirection("left");
				break;
			case RIGHT:
				direction = RIGHT;
				displayDirection("right");
				break;
			case UP:
				direction = UP;
				displayDirection("up");
				break;
			case DOWN:
				direction = DOWN;
				displayDirection("down");
				break;
			case SPACE:
				displayStopJpg();
				direction = SPACE;
				break;
			default:
				break;
			}
		}
	}

	private boolean directionStateIsSame(int direction) {
		if (this.direction == direction) {
			return true;
		}
		return false;
	}

	private void displayDirection(String direction) {
		fileURL = this.getClass().getResource("/img/" + direction + ".gif");
		display.setIcon(new ImageIcon(fileURL));
		System.out.println(direction);
	}

	private void displayStopJpg() {
		switch (direction) {
		case 0:
			fileURL = this.getClass().getResource("/img/up.jpg");
			display.setIcon(new ImageIcon(fileURL));
			break;
		case 1:
			fileURL = this.getClass().getResource("/img/down.jpg");
			display.setIcon(new ImageIcon(fileURL));
			break;
		case 2:
			fileURL = this.getClass().getResource("/img/left.jpg");
			display.setIcon(new ImageIcon(fileURL));
			break;
		case 3:
			fileURL = this.getClass().getResource("/img/right.jpg");
			display.setIcon(new ImageIcon(fileURL));
			break;
		case 4:
			break;
		default:
			System.out.println("Display Stop JPG ERROR!!");
			break;
		}
		System.out.println("Space");

	}
}
