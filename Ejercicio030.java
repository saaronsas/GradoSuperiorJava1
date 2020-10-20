/*
Multiplicar vector por matriz (filas) 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio030 {
    public static void main(String[] args) {
        int matriz[][]={{15,-30,2},{-5,9,-8},{7,-5,4}}, vector[]={2,3,4};
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++)
                System.out.print("    "+matriz[i][j]*vector[i]);
            System.out.println("");
        }
    }
}
