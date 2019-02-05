class Cylinder extends Circle
{
   private  double height;
   Cylinder()
   {
    super();
    this.height=1;
   }
   Cylinder(double radius)
   {
    super(radius);
    this.height=1;
   } 
   Cylinder(double radius,double height)
   {
    super(radius);
    this.height=1;
   }
   double getHeight()
   {
    return height;
   }
   void setHeight(double h)
   {
     this.height=h;
   }
   double getVolume()
    {
      double Volume=pi*(getRadius())*height;
      return Volume;
    } 
}