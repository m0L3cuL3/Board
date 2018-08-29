/*

Name: Sean __________
Section: BSIT-1 CCB
Date Finished: 08/29/2018

Description: 

Identify whether the 1's crossed each other(based on queen's move in chess)

*/
class FinalBoard
{
	 public static void main(String args[]) 
	{
 
		int i, j;
		int x1 = 0, y1 = 0;
		int x2 = 0, y2 = 0;
		int[][] board = new int[8][8];
		
		x1 = Integer.parseInt(args[0]); 
		y1 = Integer.parseInt(args[1]); 
		x2 = Integer.parseInt(args[2]); 
		y2 = Integer.parseInt(args[3]); 
		
		
		// initialize the board to 0's
		for (i = 0; i < 8; i++)
			for (j = 0; j < 8; j++)
				board[i][j] = 0;
		
		board[x1][y1] = 1;		
		board[x2][y2] = 1;		
		
		for (i = 0; i < 8; i++) 
		{
			for (j = 0; j < 8; j++) 
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
		if (x1 == x2 || y1 == y2) // Gi syam2 nako para makuha nako ni... (Vertial and Horizontal paths)
		{
			System.out.println("they cross each other.");                               
		}
		else if (x1 - x2 == y1 - y2) // 4:00 AM is real!!! (Diagonal paths)
		{
			System.out.println("they cross each other.");                               
		}
		else
		{
			System.out.println("they don't cross each other");
		}

    }
}
