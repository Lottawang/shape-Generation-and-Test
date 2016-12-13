/** Class CRectangle implements class rectangle shape which is a 
 * derived class from CShape. We must implement its CalculateArea()
 * 
 * @author kobti
 *
 */


public class CRectangle extends CShape
{
	public int length = 1;	// length must be positive
	public int width = 1;	// width must be positive

	public CRectangle(int length, int width)
	{	
		shapename = "rectangle";
		setLength(length);
		setWidth(width);
	}
	
	public int setLength(int length)
	{
		//this.length = (length) > 0? length: this.length;
		if (isValidPositive(length)) this.length = length;// to check the value is positive or not and set the length value
		return length;
	}
	
	public int setWidth(int width)
	{
		if (isValidPositive(width)) this.width = width;// to check the value is positive or not and set the width value
		return width;
	}
	
	public int getWidth()
	{
		return width;// to get the width
	}
	
	public int getLength()
	{
		return length;// to get the length
	}

	
	// internal method (utility method) to store the rule for a valid side
	protected boolean isValidPositive(int n)
	{
		return (n>0);// to check the value is positive or not
	}
	
	@Override
	protected double CalculateArea() {
		
		return width * length;// to calculate the area of the rectangle
	}
	
	public String toString()
	{
		return "this is a " + shapename + " with area " + CalculateArea(); //to show the result
	}

}
