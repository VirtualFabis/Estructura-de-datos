package arreglos;

public class p7 {

	public static void main(String[] args) {
		int matriz [][] = new int [5] [4];
		int x, y;
		int r=0;
		
		matriz  [0][0]= 194;
		matriz  [0][1]= 48;
		matriz  [0][2]= 206;
		matriz  [0][3]= 45;
		//-----------------
		matriz  [1][0]= 180;
		matriz  [1][1]= 20;
		matriz  [1][2]= 320;
		matriz  [1][3]= 16;
		//-----------------
		matriz  [2][0]= 221;
		matriz  [2][1]= 90;
		matriz  [2][2]= 140;
		matriz  [2][3]= 20;
		//-----------------
		matriz  [3][0]= 432;
		matriz  [3][1]= 50;
		matriz  [3][2]= 821;
		matriz  [3][3]= 14;	
		//-----------------
		matriz  [4][0]= 820;
		matriz  [4][1]= 61;
		matriz  [4][2]= 946;
		matriz  [4][3]= 18;	
		
		for(x = 0; x < 5; x++)
		{r++;
			System.out.print(r+" ");
			for(y = 0; y < 4; y++)
			{
				System.out.print(matriz[x][y] + "\t");
				
				
			}
			System.out.println("");
		}
		
		int z=0,s=0,d=0;
		int c=1,o=0;
		int v=2,b=0;
		int j=3,k=0;
		
		for(s = 0; s < 5; s++)
		{
			
			d=d+matriz[s][z];
			o=o+matriz[s][c];
			b=b+matriz[s][v];
			k=k+matriz[s][j];
			
		}
		System.out.println("");
		System.out.println("Resultados de Votaciones");
		System.out.println("");
		System.out.println("R"+" "+d+"  "+o+"    "+b+"     "+k);
		System.out.println("");
		System.out.println("Total de Votos: "+(d+o+b+k));
		System.out.println("");
		System.out.println("Candidato Mas Votado: "+(b));
	}

}
