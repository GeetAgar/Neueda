import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class BalanceTest {

	member m = new member();
	@Before
	void setup()
	{
		m.setAccno("111111111");
		m.setPin("1111");
	}
	@After
	void tearDown()
	{
		
	}
	@Test
	void testcred() {
		fail("Not yet implemented");
	}
	@Test
	void testcredNoIteam()
	{
		int val = (new BalanceDAO()).cred(m);
		boolean b;
		if(val>0)
		{
			b= true;
		}
		else
		{
			b= false;
		}
		assertFalse(b);
	}
}
