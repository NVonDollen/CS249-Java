
public class Spider extends Monster {

	public Spider()
	{
		
	}
	
	public Spider(int newX, int newY, int newHealth)
	{
		super.setX(newX);
		super.setY(newY);
		super.setHealth(newHealth);
	}
	
	//Concrete implementation of Drawable
	public interface Drawable
	{
		
	}
	

}
