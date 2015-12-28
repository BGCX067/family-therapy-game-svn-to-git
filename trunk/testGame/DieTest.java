package testGame;

import static org.junit.Assert.*;
import game.Die;

import org.junit.Before;
import org.junit.Test;

public class DieTest {
	
	private Die die;
	@Before
	public void setUp() throws Exception {
		
		die=new Die();
	}


	// Test case 1: if the value of  2 dice is between 2 and 12, it returns true.
	@Test
	public void testGetRoll() {
	boolean result;
	int value = die.getRoll();
	if(value>=2&& value<=12)
		result=true;
	else result=false;
	assertEquals(result,true);
	}

}
