package br.traceview;

import android.app.Activity;
import android.os.Bundle;
import android.os.Debug;
import android.widget.*;

public class TraceviewEmbarcadosActivity extends Activity {
    
	// Tamanho das matrizes: 2x2, 3x3 ... SZn x SZn
	static int SZ1 = 3;
	static int SZ2 = 5;
	static int SZ3 = 8;
	
	// Texto da Janela
	String screenText = "";
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    	// Matrizes Inteiras
        int[][] A1i = new int[SZ1][SZ1]; geraValores(A1i);
        int[][] B1i = new int[SZ1][SZ1]; geraValores(B1i);
        int[][] C1i = new int[SZ1][SZ1]; 

        int[][] A2i = new int[SZ2][SZ2]; geraValores(A2i);
        int[][] B2i = new int[SZ2][SZ2]; geraValores(B2i);
        int[][] C2i = new int[SZ2][SZ2]; 

        int[][] A3i = new int[SZ3][SZ3]; geraValores(A3i);
        int[][] B3i = new int[SZ3][SZ3]; geraValores(B3i);
        int[][] C3i = new int[SZ3][SZ3]; 

    	// Matrizes Long
        long[][] A1l = new long[SZ1][SZ1]; geraValores(A1l);
        long[][] B1l = new long[SZ1][SZ1]; geraValores(B1l);
        long[][] C1l = new long[SZ1][SZ1]; 

        long[][] A2l = new long[SZ2][SZ2]; geraValores(A2l);
        long[][] B2l = new long[SZ2][SZ2]; geraValores(B2l);
        long[][] C2l = new long[SZ2][SZ2]; 

        long[][] A3l = new long[SZ3][SZ3]; geraValores(A3l);
        long[][] B3l = new long[SZ3][SZ3]; geraValores(B3l);
        long[][] C3l = new long[SZ3][SZ3]; 
        
    	// Matrizes Float
        float[][] A1f = new float[SZ1][SZ1]; geraValores(A1f);
        float[][] B1f = new float[SZ1][SZ1]; geraValores(B1f);
        float[][] C1f = new float[SZ1][SZ1]; 

        float[][] A2f = new float[SZ2][SZ2]; geraValores(A2f);
        float[][] B2f = new float[SZ2][SZ2]; geraValores(B2f);
        float[][] C2f = new float[SZ2][SZ2]; 

        float[][] A3f = new float[SZ3][SZ3]; geraValores(A3f);
        float[][] B3f = new float[SZ3][SZ3]; geraValores(B3f);
        float[][] C3f = new float[SZ3][SZ3]; 
        
        // Matrizes Double
        double[][] A1d = new double[SZ1][SZ1]; geraValores(A1d);
        double[][] B1d = new double[SZ1][SZ1]; geraValores(B1d);
        double[][] C1d = new double[SZ1][SZ1]; 

        double[][] A2d = new double[SZ2][SZ2]; geraValores(A2d);
        double[][] B2d = new double[SZ2][SZ2]; geraValores(B2d);
        double[][] C2d = new double[SZ2][SZ2]; 

        double[][] A3d = new double[SZ3][SZ3]; geraValores(A3d);
        double[][] B3d = new double[SZ3][SZ3]; geraValores(B3d);
        double[][] C3d = new double[SZ3][SZ3]; 

        MultiplicaMatriz mm = new MultiplicaMatriz();        
        
        screenText += "Start:\n";
        
        long t = System.currentTimeMillis();
        
        Debug.startMethodTracing("mm");
        
        // Matrizes Int
        mm.multiplicar(A1i, B1i, C1i);
        mm.multiplicar(A2i, B2i, C2i);
        mm.multiplicar(A3i, B3i, C3i);

        // Matrizes Long
        mm.multiplicar(A1l, B1l, C1l);
        mm.multiplicar(A2l, B2l, C2l);
        mm.multiplicar(A3l, B3l, C3l);

        // Matrizes Float
        mm.multiplicar(A1f, B1f, C1f);
        mm.multiplicar(A2f, B2f, C2f);
        mm.multiplicar(A3f, B3f, C3f);

        // Matrizes Double
        mm.multiplicar(A1d, B1d, C1d);
        mm.multiplicar(A2d, B2d, C2d);
        mm.multiplicar(A3d, B3d, C3d);
        
		Debug.stopMethodTracing();
		
        t = System.currentTimeMillis() - t;
        
        screenText += "\n\nDuração da aplicação: ";
        screenText += t;
        screenText += "ms";
        
        TextView tv = new TextView(this);
        tv.setText(screenText);
        setContentView(tv);
        
    }
    
	public void geraValores(int[][] array)
	{
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++)
				array[i][j] = (int)(1+Math.random()*100);
	}
	
	public void geraValores(long[][] array)
	{
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++)
				array[i][j] = (long)(1+Math.random()*100);
	}

	public void geraValores(float[][] array)
	{
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++)
				array[i][j] = (float)Math.random();
	}

	public void geraValores(double[][] array)
	{
		for(int i=0; i<array.length; i++)
			for(int j=0; j<array[i].length; j++)
				array[i][j] = Math.random();
	}

}
