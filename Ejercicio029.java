/*
 Matriz con elementos negativos a positivos y postivos*5 
 */

public class Ejercicio029 {
    public static void main(String[] args) {
        int matriz[][]={{1,-3,2},{-5,9,-8},{7,-5,4}};
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]<0)
                    matriz[i][j]*=-1;
                else if(matriz[i][j]>0)
                    matriz[i][j]*=5;                
            }
        }
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++)
                System.out.print("  "+matriz[i][j]);
            System.out.println("");
        }
    }
}
