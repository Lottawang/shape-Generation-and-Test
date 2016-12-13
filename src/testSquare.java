/** 
 * 
 * @author Danfeng Wang
 *
 */

import junit.framework.TestCase;

public class testSquare extends TestCase{
	public void testCSquare()
	{
		CSquare s1 = new CSquare(20, 10);
		assertEquals("square", s1.shapename);// to test the shape name is square or not
		// if the length is not as same as width, then the square is not valid, and side should be 1
		assertEquals(1, s1.getSide());
	}
	
	public void testCSquare1()
	{
		CSquare s2 = new CSquare(20, 20);
		assertEquals("square", s2.shapename);
		//if the length equals to width, then the square is valid and the side should be 20
		assertEquals(20, s2.getSide());
	}

	public void testsetSide()
	{
		CSquare s3 = new CSquare(20, 10);
		// if the length is not as same as width, then the square is not valid, and side should be 1
		assertEquals(1, s3.getSide());
	}
	
	public void testsetSide1()
	{
		CSquare s4 = new CSquare(20, 20);
		//if the length equals to width, then the square is valid and the side should be 20
		assertEquals(20, s4.getSide());
	}

	public void testCalculateArea() 
	{
		CSquare s5 = new CSquare(20, 20);	
		//to test the area is right or not
		assertEquals(s5.CalculateArea(), 400, 0);
	}


}
