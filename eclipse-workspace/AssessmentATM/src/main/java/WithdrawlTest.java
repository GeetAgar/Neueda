import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class WithdrawlTest {

	member m = new member();
	String am;
	@Before
	void setup()
	{
		m.setAccno("111111111");
		m.setPin("1111");
		am = "200";
	}
	@After
	void tearDown()
	{
		
	}
	@Test
	void testcheck() {
		fail("Not yet implemented");
	}
	@Test
	void testcheckNoIteam()
	{
		int val = (new WithdrawlDAO()).check(m, am);
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
	
	@Test
	void testwithdraw() {
		fail("Not yet implemented");
	}
	@Test
	void testwithdrawNoIteam()
	{
		int val[] = (new WithdrawlDAO()).withdraw(m, am);
		boolean b = false;
		for(int i =0; i<val.length; i++)
		{
			if(val[i]>=0)
			{
				b= true;
			}
			else
			{
				b= false;
			}
		}
		assertFalse(b);
	}
}
