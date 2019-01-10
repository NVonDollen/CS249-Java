import java.util.*;
public class Assign4_2 {

	public static void main(String[] args) {
		 final int mapRows = 10;
		 final int mapCols = 20;
		 char [][] map = new char[10][20];
		 char movement = 'x';
		 Scanner keyboard = new Scanner(System.in);
		 
		 //Create and fill char array with ','
		 for(int i = 0; i < mapRows; i++)
			 for(int j = 0; j < mapCols; j++)
				 map[i][j] = '.';
		 
		 //Create 2D char array for display buffer
		 char [][] buffer = new char[10][20];
		 int [] coordinates = {0,0};
		 
		 do{
			 for(int i = 0; i < mapRows; i++)
			 {
				 for(int j = 0; j < mapCols; j++)
				 {
					 buffer[i][j] = map[i][j];
				 }
			 }
			 buffer[coordinates[1]][coordinates[0]] = '@';
			 
			 //"Render" the display
			 for(int i = 0; i < mapRows; i++)
			 {
				 for(int j = 0; j < mapCols; j++)
				 {
					 System.out.print(buffer[i][j]);
				 }
				 System.out.println("");
			 }
			 
			 //Ask user for input 
			 System.out.println("Enter an input to move the @ symbol: ");
			 System.out.println("Enter q when you want to terminate the program..." );
			 	movement = keyboard.next().charAt(0);
			 	
			 	//Send input to lowercase so there isnt any confusion
			 	movement = Character.toLowerCase(movement);
			 	
			 //Create a switch case for each putton press
			 switch(movement)
			 {
			 case 'w':
				 if(coordinates[1] == 0)
				 {
					 break;
				 }
				 else
				 {
					 coordinates[1] = coordinates[1]-1;
					 break;
				 }
			 case 'a':
				 if(coordinates[0] == 0)
				 {
					break;
				 }
				 else
				 {
					 coordinates[0] = coordinates[0]-1;
					 break;
				 }
			 case 's':
				 if(coordinates[1] == 9)
				 {
					 break;
				 }
				 else
				 {
					 coordinates[1] = coordinates[1] + 1;
					 break;
				 }
			 case 'd':
				 if(coordinates[0] == 19)
				 {
					 break;
				 }
				 else
				 {
					 coordinates[0] += 1;
					 break;
				 }
			default: 
				break;
		 	}
			 //enter "q" to quit the code.
		 }while(movement != 'q');
	}
}
