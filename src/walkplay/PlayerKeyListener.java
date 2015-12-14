package walkplay;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class PlayerKeyListener implements KeyListener {

	private Direction direction;

	PlayerKeyListener(Direction direction) {
		this.direction = direction;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			direction.show(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			direction.show(Direction.RIGHT);
			break;
		case KeyEvent.VK_UP:
			direction.show(Direction.UP);
			break;
		case KeyEvent.VK_DOWN:
			direction.show(Direction.DOWN);
			break;
		case KeyEvent.VK_SPACE:
			direction.show(Direction.SPACE);
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
