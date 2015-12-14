package walkplay;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Direction {
	public final static int UP = 0;
	public final static int DOWN = 1;
	public final static int LEFT = 2;
	public final static int RIGHT = 3;
	public final static int SPACE = 4;

	private JLabel display = null;
	private int direction = 1;
	private URL fileURL = null;
	private ImageIcon upImage, downImage, leftImage, rightImage;

	public Direction(JLabel display) {
		// TODO Auto-generated constructor stub
		this.display = display;
		assert display != null : "display Label null";
		fileURL = this.getClass().getResource("/img/up.jpg");
		upImage = new ImageIcon(fileURL);
		fileURL = this.getClass().getResource("/img/down.jpg");
		downImage = new ImageIcon(fileURL);
		fileURL = this.getClass().getResource("/img/left.jpg");
		leftImage = new ImageIcon(fileURL);
		fileURL = this.getClass().getResource("/img/right.jpg");
		rightImage = new ImageIcon(fileURL);
	}

	public int show(int directionIn) {

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
			return direction;
		}
		return 9999;
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
	}

	private void displayStopJpg() {
		switch (direction) {
		case 0:
			display.setIcon(upImage);
			break;
		case 1:
			display.setIcon(downImage);
			break;
		case 2:
			display.setIcon(leftImage);
			break;
		case 3:
			display.setIcon(rightImage);
			break;
		default:
			System.out.println("Display Stop JPG ERROR!!");
			break;
		}
	}
}
