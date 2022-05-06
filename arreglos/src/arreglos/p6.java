package arreglos;

public class p6 {

	public static void main(String[] args) {
		int[][] matriz = {{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
		int[][] matriz1 = new int[matriz[0].length][matriz.length];
		int x, y;
		
		for(x = 0; x < 4; x++)
		{
			for(y = 0; y < 3; y++)
			{
				System.out.print(matriz[x][y] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (x = 0; x < matriz.length; x++)
		{
			for (y = 0; y < matriz[x].length; y++)
			{
				matriz1[y][x] = matriz[x][y];
			}
		}
		System.out.println("Matriz Traspuesta" + "\n");
		
		for(x = 0; x < matriz[x].length; x++)
		{
			for(y = 0; y < matriz.length; y++)
			{
				System.out.print(matriz1[x][y] + "\t" );
			}
			System.out.println();
		}
	}

}
