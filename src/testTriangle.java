import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class testTriangle extends TestCase{
	public void testCTriangle()
	{
		CTriangle t1 = new CTriangle(3, 4, 5 );
		assertEquals("triangle", t1.shapename);// to test the shape name is triangle or not
		//t1.setSIDE1(3);
		//if setSIDE is valid, then the side1 should be 3, side2 should be 4 and side3 should be 5
		assertEquals(3, t1.getSIDE1());
		//t1.setSIDE2(4);
		assertEquals(4, t1.getSIDE2());
		//t1.setSIDE3(5);
		assertEquals(5, t1.getSIDE3());
	}
	
	public void testsetSIDE1()
	{
		CTriangle t2 = new CTriangle(0, 4, 5 );
		//t2.setSIDE1(0);
		//if the side1 is not greater than 0, then side1 is not valid, so side1 should be 1.
		assertEquals(1, t2.getSIDE1());	
	}
 
	public void test1setSIDE1()
	{
		CTriangle t3 = new CTriangle(3, 4, 5 );
		//t3.setSIDE1(3);
		//if the side1 is greater than 0, then side1 is valid, so side1 should be 3.
		assertEquals(3, t3.getSIDE1());	
	}
	
	public void testsetSIDE2()
	{
		CTriangle t4 = new CTriangle(3, 0, 5 );
		//t4.setSIDE2(0);
		//if the side2 is not greater than 0, then side2 is not valid, so side2 should be 1.
		assertEquals(1, t4.getSIDE2());	
	}
	
	public void test1setSIDE2()
	{
		CTriangle t5 = new CTriangle(3, 4, 5 );
		//t5.setSIDE2(4);
		//if the side2 is  greater than 0, then side2 is  valid, so side2 should be 4.
		assertEquals(4, t5.getSIDE2());	
	}
	
	public void testsetSIDE3()
	{
		CTriangle t6 = new CTriangle(3, 4, 0 );
		//t6.setSIDE3(0);
		//if the side3 is not greater than 0, then side3 is not valid, so side3 should be 1.
		assertEquals(1, t6.getSIDE3());	
	}
	
	public void test1setSIDE3()
	{
		CTriangle t7 = new CTriangle(3, 4, 5 );
		//t7.setSIDE3(5);
		//if the side3 is greater than 0, then side3 is valid, so side3 should be 5.
		assertEquals(5, t7.getSIDE3());	
	}

	public void testCalculateArea() 
	{
		CTriangle t8 = new CTriangle(3, 4, 5);
		// to test the area of the triangle
		assertEquals(t8.CalculateArea(), 6, 0);
	}
	
	public void testtoString()
	{
		CTriangle t9 = new CTriangle(3, 4, 5);
		//c6.shapename ="circle";
		//c6.setRadius(10);
		//c6.CalculateArea();
		//to test  the return of the result is right or not
		assertEquals("this is a triangle with area 6.0", t9.toString());
		
	}
	

}
