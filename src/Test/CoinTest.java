package Test;
import spil.Coin;
import static org.junit.Assert.*;

import org.junit.Test;

public class CoinTest {

	@Test
	public void Cointest() {
	Coin test = new Coin();
	int result = test.getFeltEffect();
	assertEquals(1000, result);
	
	}

}
