import java.util.Scanner;

public class Map implements Loadable {
	private int mapRows = 0;
	private int mapCols = 0;
	private char[][]mapData;
	
	public Map()
	{
		mapRows  = 0;
		mapCols = 0;
		mapData = new char[0][0];
	}
	public Map(int newMapRows, int newMapCols)
	{
		mapRows = newMapRows;
		mapCols = newMapCols;
		mapData = new char[mapRows][mapCols];
		for(int i = 0; i < mapRows; i++)
		{
			for(int j = 0; j < mapCols; j++)
			{
				mapData[i][j] = '.';
			}
		}
	}
	public boolean copyTo(Map newMap)
	{
		if(newMap == null)
			return false;
		else if(newMap.mapData.length != mapData.length || newMap.mapData[0].length != mapData[0].length)
		{
			return false;
		}
		else
		{
			for(int i = 0; i < mapRows; i++)
			{
				for(int j = 0; j < mapCols; j++)
				{
					newMap.mapData[i][j] = mapData[i][j];	
				}
			}
			return true;
		}
	}
	public void draw()
	{
		for(int i = 0; i < mapRows; i++)
		{
			System.out.println("");
			for(int j = 0; j < mapCols; j++)
			{
				System.out.print(mapData[i][j]);
			}
		}
	}
	public boolean setMapLocation(int x, int y, char c)
	{
		if(x<= mapRows && y <= mapCols && x >= 0 && y >= 0)
		{
			mapData[y][x] = c;
			return true;
		}
		else
		return false;
	}
	
	@Override
	public void load(Scanner input) throws Exception
    {
        mapData = new char[0][0];
        mapRows = 0;
        mapCols = 0;

        mapRows = Integer.parseInt(input.nextLine());
        mapCols = Integer.parseInt(input.nextLine());

        mapdata = new char[mapRows][mapCols];

        for(int i=0;i<mapRows;i++)
        {
            String inputs = input.nextLine();
            if (inputs != null)
            {
                for (int j = 0; j < inputs.length(); j++)
                {
                    mapData[i][j] = inputs.charAt(j);
                }
            }

        }
    }
	
	public int getMapRows()
	{
		return mapRows;
	}
	
	public int getMapCols()
	{
		return mapCols;
	}
	
	public char getMapLocation(int x, int y)
	{
		if(x<0 || y<0 || x>=mapRows || y >=mapCols)
		{
			return(' ');
		}
		else
		{
			return mapData[y][x];
		}
	}
	
	public boolean canMoveTo(int x, int y)
	{
		if(x<0 || y<0 || x>mapRows || y >mapCols)
		{
			return false;
		}
		else if(mapData[y][x] == '.')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}
