package walkplay;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class PlayerKeyListener implements KeyListener {
	final static int UP = 0;
	final static int DOWN = 1;
	final static int LEFT = 2;
	final static int RIGHT = 3;
	final static int SPACE = 4;

	private Direction direction;

	PlayerKeyListener(JLabel display) {
		direction = new Direction(display);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			direction.show(LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			direction.show(RIGHT);
			break;
		case KeyEvent.VK_UP:
			direction.show(UP);
			break;
		case KeyEvent.VK_DOWN:
			direction.show(DOWN);
			break;
		case KeyEvent.VK_SPACE:
			direction.show(SPACE);
			break;
		default:
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
