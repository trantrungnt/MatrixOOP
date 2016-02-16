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
public class MatrixOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m, n;
      
        
        
        try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nNhap ma tran A co m hang va n cot");
            System.out.print("\nSo hang m=");
            m = Integer.parseInt(oBufferedReader.readLine());
            System.out.print("So cot n=");
            n = Integer.parseInt(oBufferedReader.readLine());
            float[][] a = new float[m][n];
            Calculate oCalculate = new Calculate();
            oCalculate.inputMatrix(a, m, n);
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
