
public class Map {
	private int mapRows = 0;
	private int mapCols = 0;
	char[][]mapData;
	
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
}
