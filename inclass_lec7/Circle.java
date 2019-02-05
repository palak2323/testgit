/*() 1.	Define the class hierarchy as detailed in the following class diagram:
Write an application TestCylinder that uses the above class definitions to maintain and display: 
a)	Radius
b)	Height
c)	base area and 
d)	volume of a cylinder.
Definition of Done:
a)	The class definitions are defined as per the class diagram.
b)	Each class definition is stored in its own .java file.
c)	Base class constructors are invoked using super keyword
d)	Use getArea () function of the base class in the definition of getVolume()
*/

class Circle
{
 	private double radius;
  	private String color;
  	final double pi=3.14;
  	Circle()
  	{
       this.radius=2;
       this.color ="black";
  	}
  	Circle(double radius)
  	{
       this.radius=radius;
       this.color ="red"; 	
  	}
  	Circle(double radius,String color)
  	{
       this.radius=radius;
       this.color =color; 	 
  	}
    double getRadius()
  	{
       return radius;
   	}
   	String getColor()
  	{
       return color;
   	}
   	void setRadius(double r)
   	{
       this.radius=r;
   	}
   	double getArea()
   	{
   		double Area=pi*radius*radius;
   		return Area;
   	}
  }