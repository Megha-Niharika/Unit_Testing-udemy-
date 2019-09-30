import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
public class Main {
	
	
@Test
	public void add_TwoPlusTwo_ReturnFour()
	{
	final int expected = 4;
	final int actual =Math.add(2, 2);
	assertEquals(actual, expected);
	}

@Test
public void multiply_twoNumbers()
{
	final int expected= 4;
	final int actual = Math.multiply(2, 2);
	assertEquals(actual, expected);
}

}
