package test;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import walkplay.Direction;

public class DirectionTest extends TestCase {
	Direction direction = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		direction = new Direction(new JLabel());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShow() {
		assertEquals(Direction.UP, direction.show(Direction.UP));
		assertEquals(Direction.DOWN, direction.show(Direction.DOWN));
		assertEquals(Direction.LEFT, direction.show(Direction.LEFT));
		assertEquals(Direction.RIGHT, direction.show(Direction.RIGHT));
		assertEquals(Direction.SPACE, direction.show(Direction.SPACE));
	}

}
