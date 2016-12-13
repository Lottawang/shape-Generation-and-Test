/** 
 * 
 * @author Danfeng Wang
 *
 */

import junit.framework.TestCase;

public class testRectangle  extends TestCase
{
	public void testCRectangle()
	{
		CRectangle r1 = new CRectangle(0,0);
		assertEquals("rectangle", r1.shapename);// test the shape name is right or not
		r1.setLength(0);// if the value of length is 0, then it is not valid, so the length should be 1
		assertEquals(1, r1.getLength());
		r1.setWidth(0);//if the value of width is 0, then it is not valid, so the width should be 1
		assertEquals(1, r1.getWidth());
	}
	
	public void testCRectangle1()
	{
		CRectangle r2 = new CRectangle(10,2);
		assertEquals("rectangle", r2.shapename);
		r2.setLength(10);// if the value of length is greater than 0, then it is valid, so the length should be 10
		assertEquals(10, r2.getLength());
		r2.setWidth(2);// if the value of width is greater than 0, then it is valid, so the width should be 2
		assertEquals(2, r2.getWidth());
	}
	
	public void testsetLength()
	{
		CRectangle r3 = new CRectangle(0,0);
		r3.setLength(0);// if the value of length is 0, then it is not valid, so the length should be 1
		assertEquals(1, r3.getLength());
	}
	
	public void testsetLength1()
	{
		CRectangle r4 = new CRectangle(10,2);
		r4.setLength(10);// if the value of length is greater than 0, then it is valid, so the length should be 10
		assertEquals(10, r4.getLength());
	}
	
	public void testseWidth()
	{
		CRectangle r5 = new CRectangle(0,0);
		r5.setWidth(0);//if the value of width is 0, then it is not valid, so the width should be 1
		assertEquals(1, r5.getWidth());
	}
	
	public void testsetWidth1()
	{
		CRectangle r6 = new CRectangle(10,2);
		r6.setWidth(2);// if the value of width is greater than 0, then it is valid, so the width should be 2
		assertEquals(2, r6.getWidth());
	}
	
	public void testisValidPositive()
	{
		CRectangle r8 = new CRectangle(0,0);
		assertEquals(false, r8.isValidPositive(0));	// if the value is not greater than 0, then should return false
	}
	
	public void testisValidPositive1()
	{
		CRectangle r9 = new CRectangle(10,2);
		assertEquals(true, r9.isValidPositive(2));//if the value is greater than 0, then should return true 	
	}
	
	public void testCalculateArea() 
	{
		CRectangle r10 = new CRectangle(10, 2);// need input two parameters to calculate the area	
		assertEquals(r10.CalculateArea(), 20, 0);
	}
	
	public void testtoString()
	{
		// to test the return of the result is right or not
		CRectangle r11 = new CRectangle(10, 2);
		//r11.shapename ="rectangle";
		//r11.setLength(10);
		//r11.setWidth(2);
		//r11.CalculateArea();
		assertEquals("this is a rectangle with area 20.0", r11.toString());
		
	}
	

}
