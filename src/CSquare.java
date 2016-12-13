/** 
 * 
 * @author Danfeng Wang
 *
 */
public class CSquare extends CRectangle // inherits from the class CRectangle
{
	private int side = 1;// default the side of the square is 1
	
	public CSquare(int length, int width) 
	{
		super(length, width);	//inherits from the class CRectangle, need the two parameters, length and width
		shapename = "square";
		setSide(length, width);// to set the side of the square , need the two parameters, length and width
	}
	
	public int setSide(int length,int width)
	{
		if(isValidSquare(length,width))// to check the length equals to the width or not
		{
			side = length;// if length == width, then pass the value to side 
		}
		return side;// return the value of the side
	}
	
	public int getSide()
	{
		return side;//return the value of the side
	}
	
	protected double CalculateArea() 
	{
		return side*side;//to calculate the area of the square
	}
	private boolean isValidSquare(int length, int width)
	{
		return (length == width);// a square only has side, and square inherits from the class CRectangle, so we need to check the the value of length is as same as the value of the width
	}
	

}
