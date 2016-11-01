package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import spil.Cup;

public class CupTest {

	@Test
	public void test() {

        Cup instance = new Cup();
        int result = instance.sum();
        if (result > 12 || result < 1) {
            fail("terning er er ikke begrænset ");
        }
    
	
	}

}
