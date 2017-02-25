public class DoSomethingTest extends junit.framework.TestCase {
	public void testCanPlay()
	{
		DoSomething var = new DoSomething();

		assertEquals(true, var.Playfootball(20));
	}

	public void testCanNotPlay()
	{
		DoSomething var = new DoSomething();
		
		assertEquals(false, var.Playfootball(42));
	}
}