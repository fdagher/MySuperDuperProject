import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DoSomethingTest
{
	@Test
	public void TestCanPlay()
	{
		DoSomething var = new DoSomething();

		assertEquals(true, var.Playfootball(20));
	}

	@Test
	public void TestCanNotPlay()
	{
		DoSomething var = new DoSomething();
		
		assertEquals(false, var.Playfootball(42));
	}
}