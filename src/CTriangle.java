/** 
 * 
 * @author Danfeng Wang
 *
 */
public class CTriangle extends CShape {// CTriangle  inherits from the class CShape
	
	private int side1 = 1;	// side1 must be positive
	private int side2 = 1;	// side2 must be positive
	private int side3 = 1;	// side3 must be positive
	
	public CTriangle(int side1, int side2, int side3)
	{	
		shapename = "triangle";
		setSIDE1(side1);//a triangle has three sides, side1, side2 and side3
		setSIDE2(side2);
		setSIDE3(side3);
	}
	
	public int setSIDE1(int side1)
	{
		//this.side1 = (side1) > 0? side1: this.side1;
		if (isValidPositive(side1)) this.side1 = side1;
		return side1;
	}
	
	public int setSIDE2(int side2)
	{
		//if the value of side2 is positive, then give the value to side2
		if (isValidPositive(side2)) this.side2 = side2;
		return side2;
	}
	
	public int setSIDE3(int side3)
	{
		//if the value of side2 is positive, then give the value to side2
		if (isValidPositive(side3)) this.side3 = side3;
		return side3;
	}
	
	public int getSIDE1()
	{
		//to get the value of side1
		return side1;
	}

	public int getSIDE2()
	{
		//to get the value of side2
		return side2;
	}

	public int getSIDE3()
	{
		//to get the value of side3
		return side3;
	}
	
	// internal method (utility method) to store the rule for a valid side
	
	private boolean isValidPositive(int n)
	{
		//to check the value is positive or not
		return (n>0);
	}
	
	protected double CalculateArea() 
	{
		// to use Heron's formula to calculate the area of the triangle and then return the area
		double p = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));
		return area;

	}
	
	public String toString()
	{
		//to return the result that includes the shape name and area.
		return "this is a " + shapename + " with area " + CalculateArea();
	}


}
