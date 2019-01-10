public class Circle2D {
/*
	 * Project to create a circle2D class and 
	 */

		private double X, Y;
		private double radius;
		private double distance;	
		
		public Circle2D()
		{
			X = 0;
			Y = 0;
			radius = 1;
		}
		
		public Circle2D(double newX, double newY, double newRadius)
		{
			X = newX;
			Y = newY;
			radius = newRadius;
		}
		
		public double getArea()
		{
			return Math.PI*(radius * radius);
		}
		
		public double getPerimeter()
		{
			return 2*Math.PI*radius;
		}
		
		public boolean contains(double x, double y)
		{
			distance = Math.sqrt((x-X)*(x-X)+(y-Y)*(y-Y));
			if(distance > radius)
				return false;
			else 
				return true;
		}
		
		public boolean contains(Circle2D circle)
		{
			distance = Math.sqrt((X-circle.X)*(X-circle.X)+(Y-circle.Y)+(Y-circle.Y));
			if(distance + circle.radius <= radius)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}	
		public boolean overlaps(Circle2D circle)
		{
			distance = Math.sqrt((X-circle.X)*(X-circle.X)+(Y-circle.Y)*(Y-circle.Y));
			if(distance < circle.radius + radius)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
