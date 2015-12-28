package testGame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import game.Player;
public class PlayerTest {

	private Player player;
	
	@Before
	public void setUp() throws Exception {
		
		player=new Player();
	}


	// Test case 1: if self-esteem is positive, it returns false.
	@Test
	public void testIsEND() {
	boolean result;
	int input=10;
	player.setSelfEsteem(input);
	
	result = player.isEND();
	assertEquals(result, false);
	}
	
	// Test case 2: if self-esteem is zero, it returns true.
	@Test
	public void testIsEND2() {
	boolean result;
	int input=0;
	player.setSelfEsteem(input);
	result = player.isEND();
	assertEquals(result, true);
	}

	// Test case 3: if self-esteem is negative, it returns true.
	@Test
	public void testIsEND3() {
	boolean result;
	int input=-1;
	player.setSelfEsteem(input);
	result = player.isEND();
	assertEquals(result, true);
	}


}
