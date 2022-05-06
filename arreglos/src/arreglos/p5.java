package arreglos;

public class p5 {

	public static void main(String[] args) {
		
		int matriz [][] = new int [3] [5];
		int[][] matrizT = new int[matriz[0].length][matriz.length];
		int x, y;
		matriz  [0][0]= 4;
		matriz  [0][1]= 7;
		matriz  [0][2]= 1;
		matriz  [0][3]= 3;
		matriz  [0][4]= 5;
		matriz  [1][0]= 2;
		matriz  [1][1]= 0;
		matriz  [1][2]= 9;
		matriz  [1][3]= 6;
		matriz  [1][4]= 7;
		matriz  [2][0]= 3;
		matriz  [2][1]= 1;
		matriz  [2][2]= 2;
		matriz  [2][3]= 6;
		matriz  [2][4]= 4;
		for(x = 0; x < 3; x++)
		{
			for(y = 0; y < 5; y++)
			{
				System.out.print(matriz[x][y] + "\t");
			}
			System.out.println("");
		}
		for (x = 0; x < matriz.length; x++)
		{
			for (y = 0; y < matriz[x].length; y++)
				
			{
				matrizT[y][x] = matriz[x][y];
			}
		}
		System.out.println(" " );
System.out.println("Matriz Traspuesta" );
System.out.println(" " );

		for(x = 0; x < 5; x++)
		{
			for(y = 0; y < 3; y++)
			{
				System.out.print(matrizT[x][y] + "\t" );
			}
			System.out.println();
		}
	}
	}


