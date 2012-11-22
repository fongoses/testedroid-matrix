package br.traceview;

public class MultiplicaMatriz {
	
	public void multiplicar(int A[][], int B[][], int C[][]) {
		int aux;
		
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				aux = 0;

				for(int k=0; k<A[i].length; k++)
					aux = aux + A[i][k] * B[k][j];
				
				C[i][j] = aux;
			}
		}
	}

	public void multiplicar(long A[][], long B[][], long C[][]) {
		long aux;
		
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				aux = 0;

				for(int k=0; k<A[i].length; k++)
					aux = aux + A[i][k] * B[k][j];
				
				C[i][j] = aux;
			}
		}
	}

	public void multiplicar(float A[][], float B[][], float C[][]) {
		float aux;
		
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				aux = 0;

				for(int k=0; k<A[i].length; k++)
					aux = aux + A[i][k] * B[k][j];
				
				C[i][j] = aux;
			}
		}
	}

	public void multiplicar(double A[][], double B[][], double C[][]) {
		double aux;
		
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				aux = 0;

				for(int k=0; k<A[i].length; k++)
					aux = aux + A[i][k] * B[k][j];
				
				C[i][j] = aux;
			}
		}
	}

}
