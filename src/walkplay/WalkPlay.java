package walkplay;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WalkPlay extends JFrame {
	private static WalkPlay walkPlay = null;
	private JPanel displayPanel = null;
	private JLabel display = null;
	private Direction direction = null;

	private WalkPlay() {
		// TODO Auto-generated constructor stub
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		displayPanel = new JPanel();
		display = new JLabel(new ImageIcon(this.getClass().getResource("/img/down.gif")));
		displayPanel.add(display);
		displayPanel.setBounds(50, 55, 250, 250);
		add(displayPanel);
		revalidate();
		repaint();
		direction = new Direction(display);
		addKeyListener(new PlayerKeyListener(direction));
		System.out.println("123");
	}

	public static WalkPlay getInstance() {
		if (walkPlay == null) {
			walkPlay = new WalkPlay();
			return walkPlay;
		} else {
			return walkPlay;
		}
	}

}
