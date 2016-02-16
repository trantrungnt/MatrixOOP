/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoop;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class Calculate {
    public void inputMatrix(float[][] a,int m, int n)
    {
        try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            
            for(int i=0; i<m; i++)
                for(int j=0; j<n; j++)
                {
                    System.out.print("a[" + i + "][" + j + "]=");
                    a[i][j] = Float.parseFloat(oBufferedReader.readLine());
                }    
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    public void displayMatrix(float[][] a, int m, int n)
    {
        for(int i=0; i<m; i++)
        {    
            for(int j=0; j<n; j++)
             System.out.print(a[i][j] + " ");
            System.out.println();
        }    
    }
}
