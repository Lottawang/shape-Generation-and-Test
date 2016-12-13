/** 
 * 
 * @author Danfeng Wang
 *
 */
import junit.framework.TestCase;

public class testCircle extends TestCase{
	public void testCCircle()
	{
		CCircle c1 = new CCircle(0);
		assertEquals("circle", c1.shapename);// to test the shapename is circle or not
		c1.setRadius(0);
		assertEquals(1, c1.getRadius());// if the value of radius is 0, then the the radius should be 1
	}
	public void testCCircle1()
	{
		// if the radius is greater than 0, then the method getRadius should return the value of radius
		CCircle c2 = new CCircle(10);
		assertEquals("circle", c2.shapename);
		c2.setRadius(10);
		assertEquals(10, c2.getRadius());
	}
	
	public void testsetRadius()
	{
		// if the value of radius is 0, which means the radius is not valid, then the the radius should be 1
		CCircle c3 = new CCircle(0);
		c3.setRadius(0);
		assertEquals(1, c3.getRadius());
	}
	
	public void testsetRadius1()
	{
		// if the radius is greater than 0,which means the radius is valid,then the method getRadius should return the value of radius
		CCircle c4 = new CCircle(10);
		c4.setRadius(10);
		assertEquals(10, c4.getRadius());
	}
	
	public void testCalculateArea() 
	{
		// test the area is right or not when the radius is 10.
		CCircle c5 = new CCircle(10);	
		assertEquals(c5.CalculateArea(), 314.1592653589793, 0);
	}
	
	public void testtoString()
	{
		// test the return method is right or not, when the radius is 10 and the shape name is circle
		CCircle c6 = new CCircle(10);
		//c6.shapename ="circle";
		//c6.setRadius(10);
		//c6.CalculateArea();
		assertEquals("this is a circle with area 314.1592653589793", c6.toString());
		
	}
	

}
